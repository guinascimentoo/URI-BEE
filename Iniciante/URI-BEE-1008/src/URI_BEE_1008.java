import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", (horasTrabalhadas * valorPorHora));
    }
}