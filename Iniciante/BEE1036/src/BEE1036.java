import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = Math.sqrt(Math.pow(B, 2) - 4 * A * C);
        double x1 = (- B + delta) / (2 * A);
        double x2 = (- B - delta) / (2 * A);

        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.println((A == 0) | (B * B - 4 * A * C < 0) ? "Impossivel calcular" : "R1 = " + df.format(x1) + "\nR2 = " + df.format(x2));
    }
}