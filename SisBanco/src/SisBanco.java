import java.util.Scanner;

public class SisBanco {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Conta c1; 
		double valor;
		int menu; 

		c1 = new Conta();
		
		c1.numero = 1;
		c1.nome = "João Silva";
		c1.cpf = "111.222.333-44";
		c1.tipo = 0;
		c1.saldo = 1000.00;
				
		System.out.println("SISBANK - SISTEMA FINANCEIRO");
		
		do {
			System.out.println("\n\nDIGITE UMA DAS OPÇÕES ABAIXO\n\n1 - Detalhar Conta\n2 - Depositar Valor\n3 - Sacar Valores\n4 - Saldo\n0 - Sair\n");
			menu = keyboard.nextInt();
			
			switch(menu) {
			case 1:
				c1.detalharConta();
				break;
			case 2:
				System.out.println("Digite o valor para depósito:");
				c1.depositar((valor = keyboard.nextDouble()));
				break;
			case 3:
				System.out.println("Digite o valor para saque:");
				c1.sacar((valor = keyboard.nextDouble()));
				break;
			case 4:
				c1.saldoAtual();
				break;
			case 0:
				System.out.println("Sessão Finalizada...\nObrigado!");
				break;
			default: System.out.println("\nOpção inválida!");
				break;
			}
		} while (menu != 0);
		keyboard.close();
	}

}
