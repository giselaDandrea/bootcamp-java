package Clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro en años humanos:");

        int edadHumana = scanner.nextInt();

        int edadPerro = edadHumana * 7;

        System.out.println("La edad de su perro en años de perro es: " + edadPerro);
    }

    //Ejercicio 2

}




