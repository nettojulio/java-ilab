import java.util.Scanner;

public class BeeCrowd1114 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int password;

        do {
            password = keyboard.nextInt();
            if (password != 2002) {
                System.out.println("Senha Invalida");
            }
        } while (password != 2002);

        System.out.println("Acesso Permitido");
        keyboard.close();
    }
}
