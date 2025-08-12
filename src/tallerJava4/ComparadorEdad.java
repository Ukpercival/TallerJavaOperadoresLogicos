package tallerJava4;

import java.util.Scanner;

public class ComparadorEdad {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pepito, ¿cual es tu edad?");
        int edadPepito = scanner.nextInt();
        System.out.println("Juan, ¿Cual es tu edad?");
        int edadJuan = scanner.nextInt();

        if (edadPepito != edadJuan){
            System.out.println("no tienen la misma edad");
            if (edadPepito> edadJuan){
                System.out.println("Pepito es mayor que Juan");
            } else if (edadPepito<edadJuan) {
                System.out.println("Juan es mayor que Pepito");
            }
        }else {
            System.out.println("Ambos tienen la misma edad");
        }


    }
}

