import java.util.Scanner;

public class URI_BEE_1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i, k = (j * i), l = (k * j); j == i ; j++) {
                System.out.println(j + " " + k + " " + l);
            }
        }
    }
}