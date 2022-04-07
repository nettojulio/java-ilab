import java.util.Scanner;

public class BeeCrowd1008 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int number, salary;
        float paymentHour;

        number = keyboard.nextInt();
        salary = keyboard.nextInt();
        paymentHour = keyboard.nextFloat();

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, (salary * paymentHour));

        keyboard.close();
    }
}
