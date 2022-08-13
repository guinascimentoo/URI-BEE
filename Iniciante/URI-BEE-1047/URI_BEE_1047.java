import java.util.Scanner;

public class URI_BEE_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int duracaoTotal = (24 * 60 - (horaInicial * 60 + minutoInicial)) + (horaFinal * 60 + minutoFinal);

        int horas = duracaoTotal / 60;
        int minutos = duracaoTotal % 60;

        if(horas >= 24 && minutos >= 1){
            horas = horas % 24;
        }
        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}