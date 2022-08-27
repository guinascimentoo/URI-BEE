import java.util.Scanner;

public class URI_BEE_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        String string3 = sc.nextLine();

        if(string1.equals("vertebrado") && string2.equals("ave") && string3.equals("carnivoro")){
            System.out.println("aguia");
        }
        else if(string1.equals("vertebrado") && string2.equals("ave") && string3.equals("onivoro")){
            System.out.println("pomba");
        }
        if(string1.equals("vertebrado") && string2.equals("mamifero") && string3.equals("onivoro")){
            System.out.println("homem");
        }
        else if(string1.equals("vertebrado") && string2.equals("mamifero") && string3.equals("herbivoro")){
            System.out.println("vaca");
        }

        if(string1.equals("invertebrado") && string2.equals("inseto") && string3.equals("hematofago")){
            System.out.println("pulga");
        }
        else if(string1.equals("invertebrado") && string2.equals("inseto") && string3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        if(string1.equals("invertebrado") && string2.equals("anelideo") && string3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if(string1.equals("invertebrado") && string2.equals("anelideo") && string3.equals("onivoro")){
            System.out.println("minhoca");
        }
    }
}