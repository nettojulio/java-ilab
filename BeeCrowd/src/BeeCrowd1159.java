import java.util.Scanner;

public class BeeCrowd1159 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int value;
        int sum = 0;

        do {
            value = keyboard.nextInt();
            switch (value) {
                case 0:
                    break;
                default:
                    if (value % 2 == 0) {
                        sum = (value * 5) + 20;
                        System.out.println(sum);
                        break;
                    } else {
                        sum = ((value + 1) * 5) + 20;
                        System.out.println(sum);
                        break;
                    }
            }
        } while (value != 0);
        keyboard.close();
    }
}
