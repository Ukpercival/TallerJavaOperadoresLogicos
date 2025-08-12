package tallerJava4;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Hola, por favor, ingresa tu peso en Kilogramos");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ahora ingresa tu altura en metros");
        double altura = scanner.nextDouble();

        double imc = peso/Math.pow(altura,2);
        int imcEntero = (int) imc;

        System.out.println("su IMC es de: " + imc);
        System.out.println("su IMC en enteros es de: " + imcEntero);

    }
}
