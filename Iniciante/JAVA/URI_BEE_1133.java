import java.util.Scanner;

public class URI_BEE_1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, aux;
        x = sc.nextInt();
        y = sc.nextInt();

        if(x > y){
            aux = x;
            x = y;
            y = aux;
        }
        for(int i = x+1; i < y; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}