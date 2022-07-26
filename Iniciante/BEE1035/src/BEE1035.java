import java.util.Scanner;

public class BEE1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println((B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) ? "Valores aceitos" : "Valores nao aceitos");
    }
}