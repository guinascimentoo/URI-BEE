import java.util.Scanner;

public class URI_BEE_1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println("DIFERENCA = " + (A * B - C * D));
    }
}