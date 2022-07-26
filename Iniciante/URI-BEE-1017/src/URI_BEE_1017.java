import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double horas = sc.nextInt();
        double km = sc.nextInt();

        double litros = (horas * km) / 12;

        System.out.printf("%.3f%n", litros);
    }
}