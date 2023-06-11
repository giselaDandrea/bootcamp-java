package Clase_5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas:");

        int distanciaEnMillas = scanner.nextInt();

        Double kilometros = distanciaEnMillas  * 1.60934;

        System.out.println("La distancia en kilometros es de: " + kilometros);
    }
}
