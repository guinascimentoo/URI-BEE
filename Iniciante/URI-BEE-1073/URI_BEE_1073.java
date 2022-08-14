import java.util.Scanner;

public class URI_BEE_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^" + "2" + " = " + (int) Math.pow(i, 2));
            }
        }
    }
}