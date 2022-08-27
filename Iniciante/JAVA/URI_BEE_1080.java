import java.util.Scanner;

public class URI_BEE_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0, posMaior = 1;

        for(int i = 1; i <= 100; i++){
            int num = sc.nextInt();
            if(i == 1){
                maior = num;
            }
            else if(num > maior){
                maior = num;
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);
    }
}