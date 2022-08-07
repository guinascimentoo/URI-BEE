import java.util.Scanner;

public class URI_BEE_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();

        int horas = tempo / 3600;
        int restoHoras = tempo % 3600;

        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;

        int segundos = restoMinutos;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}