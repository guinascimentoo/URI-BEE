import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f%n", ((totalVendas * 0.15) + salarioFixo));
    }
}