import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        double litrosGasolina = sc.nextDouble();

        System.out.println(String.format("%.3f km/l", (km / litrosGasolina)));
    }
}