import java.util.Scanner;

public class URI_BEE_1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        do {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n1 == n2) {
                break;
            }
            System.out.println((n1 > n2) ? "Decrescente" : "Crescente");
        } while (n1 != n2);
    }
}