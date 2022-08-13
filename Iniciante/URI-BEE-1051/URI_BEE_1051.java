import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double taxa = 0;
        double salario = sc.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00) {
            taxa += (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        }
        else if (salario >= 3000.01 && salario <= 4500.00) {
            taxa += 1000.00 * 0.08;
            taxa += (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f%n", taxa);
        }
        else if(salario > 4500.00){
            taxa += 1000.00 * 0.08;
            taxa += 1500.00 * 0.18;
            taxa += (salario - 4500.00) * 0.28;
            System.out.printf("R$ %.2f%n", taxa);
        }
    }
}