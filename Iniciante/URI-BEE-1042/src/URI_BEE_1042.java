import java.util.Arrays;
import java.util.Scanner;

public class URI_BEE_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] crescente = {num1, num2, num3};
        Arrays.sort(crescente);

        for (int num : crescente) {
            System.out.println(num);
        }

        System.out.println();

        crescente[0] = num1;
        crescente[1] = num2;
        crescente[2] = num3;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}