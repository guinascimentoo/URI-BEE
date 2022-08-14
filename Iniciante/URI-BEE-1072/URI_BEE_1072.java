import java.util.Scanner;

public class URI_BEE_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int x[] = new int[num];

        int in = 0, out = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            if (x[i] >= 10 && x[i] <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}