package Clase_5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto:");
        Double precioOriginal = (double) scanner.nextInt();

        System.out.println("Ingrese el descuento:");
        Double descuento= (double) scanner.nextInt();


        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);


                System.out.println("El precio final del producto es de " + precioFinal);
    }
}

