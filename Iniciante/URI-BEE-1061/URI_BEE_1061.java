import java.util.Scanner;

public class URI_BEE_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String primeiroDia = sc.nextLine();
        String horarioPrimeiroDia = sc.nextLine();
        String segundoDia = sc.nextLine();
        String horarioSegundoDia = sc.nextLine();

        String[] splitPrimeiroDia = primeiroDia.split(" ");
        String[] horarioSplitPDia = horarioPrimeiroDia.split(" : ");
        String[] splitSegundoDia = segundoDia.split(" ");
        String[] horarioSplitSDia = horarioSegundoDia.split(" : ");

        int dia1 = Integer.parseInt(splitPrimeiroDia[1]);
        int diaHora1 = Integer.parseInt(horarioSplitPDia[0]);
        int diaMinutos1 = Integer.parseInt(horarioSplitPDia[1]);
        int diaSegundos1 = Integer.parseInt(horarioSplitPDia[2]);

        int dia2 = Integer.parseInt(splitSegundoDia[1]);
        int diahora2 = Integer.parseInt(horarioSplitSDia[0]);
        int diaMinutos2 = Integer.parseInt(horarioSplitSDia[1]);
        int diaSegundos2 = Integer.parseInt(horarioSplitSDia[2]);

        diaSegundos1 = (dia1 * 24 * 60 * 60) + (diaHora1 * 60 * 60) + (diaMinutos1 * 60) + (diaSegundos1);
        diaSegundos2 = (dia2 * 24 * 60 * 60) + (diahora2 * 60 * 60) + (diaMinutos2 * 60) + (diaSegundos2);

        int  diferencaSegundos = diaSegundos2 - diaSegundos1;
        int diferencaSegundosAtual = diferencaSegundos;

        int dias = diferencaSegundosAtual / (24 * 60 * 60);
        diferencaSegundosAtual -= dias * 24 * 60 * 60;

        int horas = diferencaSegundosAtual / (60 * 60);
        diferencaSegundosAtual -= horas * 60 * 60;

        int minutos = diferencaSegundosAtual / (60);
        diferencaSegundosAtual -= minutos * 60;

        int segundos = diferencaSegundosAtual;

        System.out.printf("%s dia(s)\n", dias);
        System.out.printf("%s hora(s)\n", horas);
        System.out.printf("%s minuto(s)\n", minutos);
        System.out.printf("%s segundo(s)\n", segundos);
    }
}