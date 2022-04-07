public class BeeCrowd1155 {
    public static void main(String args[]) {

        double i = 1;
        double acc = 0;

        while (i <= 100) {
            acc = acc + (1 / i);
            i++;
        }
        System.out.printf("%.2f\n", (float) (acc));
    }
}
