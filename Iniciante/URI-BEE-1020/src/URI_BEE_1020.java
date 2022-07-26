import java.util.Scanner;

public class URI_BEE_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDias = sc.nextInt();

        int anos = idadeDias / 365;
        int restoDias = idadeDias % 365;

        int meses = restoDias / 30;
        int restoMeses = restoDias % 30;

        int dias = restoMeses;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}