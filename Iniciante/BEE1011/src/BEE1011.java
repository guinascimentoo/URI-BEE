import java.util.Locale;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double R = sc.nextDouble();

        double volume = (4/3.0) * pi * (R * R * R);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}