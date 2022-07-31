import java.util.Scanner;

public class URI_BEE_1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;

        System.out.println(((maiorAB + C + Math.abs(maiorAB - C)) / 2) + " eh o maior");
    }
}