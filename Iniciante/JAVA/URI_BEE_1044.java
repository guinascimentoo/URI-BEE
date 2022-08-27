import java.util.Scanner;

public class URI_BEE_1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println((A % B == 0 || B % A == 0) ? "Sao Multiplos" : "Nao sao Multiplos");
    }
}