import java.util.Scanner;

public class URI_BEE_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int soma = 0;
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n1 < n2) {
                for (int j = n1 + 1; j < n2; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else {
                for (int j = n2 + 1; j < n1; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}