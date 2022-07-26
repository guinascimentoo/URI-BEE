import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = (totalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", comissao);
    }
}