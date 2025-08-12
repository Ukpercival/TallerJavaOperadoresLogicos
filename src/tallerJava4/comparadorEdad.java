package tallerJava4;

import java.util.Scanner;

public class comparadorEdad {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pepito, ¿cual es tu edad?");
        int edadPepito = scanner.nextByte();
        System.out.println("Juan, ¿Cual es tu edad?");
        int edadJuan = scanner.nextByte();

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
