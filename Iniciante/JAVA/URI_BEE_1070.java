import java.util.Scanner;

public class URI_BEE_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int contador = 0;

        if(num > 0){
            while (contador < 6){
                if(num % 2 != 0){
                    contador ++;
                    System.out.println(num);
                }
                num++;
            }
        }
    }
}