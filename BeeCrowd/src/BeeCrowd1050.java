import java.util.Scanner;

public class BeeCrowd1050 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int ddd = keyboard.nextInt();

        switch (ddd) {
            case 11:
            case 011:
                System.out.println("Sao Paulo");
                break;
            case 61:
            case 061:
                System.out.println("Brasilia");
                break;
            case 71:
            case 071:
                System.out.println("Salvador");
                break;
            case 21:
            case 021:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
            case 032:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                // case 019:
                System.out.println((int) (014));
                break;
            case 27:
            case 027:
                System.out.println("Vitoria");
                break;
            case 31:
            case 031:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
        keyboard.close();
    }
}
