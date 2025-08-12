package tallerJava4;

import java.util.Scanner;

public class ParticipacionEvento {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la edad de la primera persona");
        int edadPersona1 = scanner.nextByte();
        System.out.println("Ingresa la edad de la segunda persona");
        int edadPersona2 = scanner.nextByte();

        if(edadPersona1>18 && edadPersona2>18){
            System.out.println("Ambas tienen más de 18");
            if(edadPersona1 < 30 && edadPersona2 < 30){
                System.out.println("ambas son menores de 30");
            } else if (edadPersona1>50 || edadPersona2 > 50 ) {
                System.out.println("Alguna de las dos personas tiene más de 50");
            }

        }else if (edadPersona1 < 18 || edadPersona2 <18){
            System.out.println("Alguna de las  personas no es mayor de edad");
        }else{
            System.out.println("Ninguna de las dos personas es mayor de edad");
        }

    }
}
