package tallerJavafixed;

import java.util.Scanner;

public class ComparadorEdadFixed {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pepito, ¿cual es tu edad?");
        int edadPepito = scanner.nextInt();
        System.out.println("Juan, ¿Cual es tu edad?");
        int edadJuan = scanner.nextInt();


        boolean pepitoMayor = (edadPepito>edadJuan);
        boolean juanMayor = (edadPepito<edadJuan);
        boolean mismaEdad = (edadPepito == edadJuan);

        System.out.println("¿Tienen la misma edad? " + mismaEdad);
        System.out.println("¿Pepito es el mayor? " + pepitoMayor);
        System.out.println("¿Juan es el mayor? " + juanMayor);
    }
}
