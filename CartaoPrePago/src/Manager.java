import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int opcao;
		double valor;
		Cartao cartao = new Cartao("1234 5678 9012 3456", "Joao Siva", 2021, 12);
		
		do {
			System.out.println("Informe a opção desejada:\n1 - Saldo\n2 - Adicionar Créditos\n3 - Efetuar compra\n0 - Sair\n");
			opcao = keyboard.nextInt();
			switch(opcao) {
			case 1:
				System.out.printf("Saldo atual de R$ %.2f\n", cartao.getSaldo()); 
				break;
			case 2:
				System.out.println("Digite o valor da recarga:\n");
				valor = keyboard.nextDouble();
				if (cartao.adicionarCredito(valor)) {
					System.out.printf("Operação realizada com sucesso\nValor adicionado: R$ %.2f\nNovo saldo: R$ %.2f\n", valor, cartao.getSaldo());
				}else{
					System.out.println("Operação inválida! Verifique os valores digitados e tente novamente.");					
				}
				break;
			case 3:
				System.out.println("Digite o valor da compra:\n");
				valor = keyboard.nextDouble();
				if(cartao.comprar(valor)) {
					System.out.printf("Transação no valor de R$ %.2f efetuada com sucesso!\nSaldo atual de %.2f\n", valor, cartao.getSaldo());
				}else{
					System.out.printf("Transação Negada!\nValor da transação R$ %.2f excede saldo disponível\n", valor);
				}
				break;
			case 0:
				System.out.println("Obrigado!!!\n");
				break;
			default:
				System.out.println("Opção inválida\n");
			}
		} while (opcao != 0);
		
		
		keyboard.close();
	}
}
