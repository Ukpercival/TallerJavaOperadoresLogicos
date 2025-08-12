package tallerJavafixed;

import java.util.Scanner;

public class ParticipacionEventoFixed {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la edad de la primera persona");
        int edadPersona1 = scanner.nextInt();
        System.out.println("Ingresa la edad de la segunda persona");
        int edadPersona2 = scanner.nextInt();

        boolean ambasMayores18 = (edadPersona1 > 18 && edadPersona2 > 18);
        boolean ambasMenores18 = (edadPersona1 < 18 && edadPersona2 < 18);
        boolean algunaMayor18 = (edadPersona1 > 18 || edadPersona2 > 18);
        boolean algunaMenor18 = (edadPersona1 < 18 || edadPersona2 < 18);
        boolean ambasMayores30 = (edadPersona1 > 30 && edadPersona2 > 30);
        boolean ambasMenores30 = (edadPersona1 <30 && edadPersona2 <30);
        boolean algunaMenor30 = (edadPersona1 < 30 || edadPersona2 <30);
        boolean algunaMayor30 = (edadPersona1 > 30 || edadPersona2 >30);
        boolean ambasMayores50 = (edadPersona1 > 50 && edadPersona2 > 50);
        boolean ambasMenores50 = (edadPersona1 < 50 && edadPersona2 < 50);
        boolean algunaMayor50 = (edadPersona1 > 50 || edadPersona2 > 50);
        boolean algunaMenor50 = (edadPersona1 > 50 || edadPersona2 > 50);


        System.out.println("Ambas son mayores de 18: " + ambasMayores18);
        System.out.println("Ambas son menores de 18: " + ambasMenores18);
        System.out.println("Alguna es mayor de 18: " + algunaMayor18);
        System.out.println("Alguna es menor de 18: " + algunaMenor18);
        System.out.println("Ambas son mayores de 30: " + ambasMayores30);
        System.out.println("Ambas son menores de 30: " + ambasMenores30);
        System.out.println("Alguna es mayor de 30: " + algunaMayor30);
        System.out.println("Alguna es menor de 30: " + algunaMenor30);
        System.out.println("Ambas son mayores de 50: " + ambasMayores50);
        System.out.println("Ambas son menores de 50: " + ambasMenores50);
        System.out.println("Alguna es mayor de 50: " + algunaMayor50);
        System.out.println("Alguna es menor de 50: " + algunaMenor50);




    }

}
