import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String palavras = keyboard.nextLine();
		
		char l1;
		char[] separar = palavras.toCharArray();
		boolean palindromo = true;
		int y = 0;

		
		for (int x = separar.length - 1; x >= 0; x--) {
			l1 = separar[x];
			if (l1 == separar[y]) {
				y++;
			} else {
				palindromo = false;
				break;
			}
		}
		System.out.println(palindromo ? "Palindromo" : "Não é Palindromo");
		keyboard.close();
	}
}
