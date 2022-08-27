import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", ((numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2)));
    }
}