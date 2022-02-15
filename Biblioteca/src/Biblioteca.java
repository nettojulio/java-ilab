import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Livro l1, l2, l3, l4;
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		l4 = new Livro();

		int option;

		l1.setIsbn(1);
		l1.setTitulo("1984");
		l1.setAutor("George Orwell");
		l1.setCategoria("Ficção");
		l1.setAno(1949);
		l1.setPosicao("E01P01");
		l1.setDisponivel(true);

		l2.setIsbn(2);
		l2.setTitulo("Animal Farm");
		l2.setAutor("George Orwell");
		l2.setCategoria("Ficção");
		l2.setAno(1945);
		l2.setPosicao("E01P02");
		l2.setDisponivel(false);

		l3.setIsbn(3);
		l3.setTitulo("Gabriela");
		l3.setAutor("Jorge Amado");
		l3.setCategoria("Literatura Brasileira");
		l3.setAno(1957);
		l3.setPosicao("E01P03");
		l3.setDisponivel(false);

		l4.setIsbn(3);
		l4.setTitulo("Gabriela");
		l4.setAutor("Jorge Amado");
		l4.setCategoria("Literatura Brasileira");
		l4.setAno(1957);
		l4.setPosicao("E01P04");
		l4.setDisponivel(true);

		do {
			System.out.println("SisLib");
			System.out.println("Digite uma das opções:\n1 - Devolver Livro\n2 - Emprestar Livro\n0 - Sair");
			option = keyboard.nextInt();
			switch (option) {
			case 1:
				if (!l1.isDisponivel()) {
					System.out.printf("Devolvido\nLivro %s deve ser recolocado na posição %s.\n", l1.getTitulo(),
							l1.getPosicao());
					l1.setDisponivel(true);
				} else {
					System.out.println("Não há livro para devolver");
				}
				break;
			case 2:
				if (l1.isDisponivel()) {
					System.out.printf("Empréstimo Realizado\nLivro %s localizado na posição %s foi disponibilizado.\n",
							l1.getTitulo(), l1.getPosicao());
					l1.setDisponivel(false);
				} else {
					System.out.println("Não há livro para empréstimo");
				}
				break;
			case 0:
				System.out.println("Obrigado!!!");
				break;
			default:
				System.out.println("Opção Inválida");
			}

		} while (option != 0);

		keyboard.close();
	}
}
