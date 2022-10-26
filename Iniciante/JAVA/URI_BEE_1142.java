import java.util.Scanner;

public class URI_BEE_1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= (4 * n - 1); i += 4) {
            for (int k = i; k <= i+2; k++) {
                System.out.print(k + " ");
            }
            System.out.println("PUM");
        }
    }
}