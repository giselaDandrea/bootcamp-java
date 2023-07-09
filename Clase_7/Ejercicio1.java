package Clase_7;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Ejercicio1
        //Craer un arreglo que guarde 5 numeros y los muestre
        int[] numeros = new int[5]; //array
        Scanner teclado = new Scanner(System.in); //Crea la instacia para el ingreso del usuario


        int contador = 0;
        while (contador < numeros.length) {
            System.out.println("Por favor ingrese un número");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;

        }

        contador = 0;
        while (contador < numeros.length) {
            System.out.println(numeros[contador]);
            contador++;

        }

        //Ejercicio2 : Agregar que muestre el numero mayor y menor
        int mayor = 0;
        int menor = 0;

        for (int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];
            if (num >= mayor || contador == 0) {
                mayor = num;
            }
            if (num <= menor || contador == 0) {
                menor = num;
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        //Ejercicio3: Calcular promedio

        int sumatoria = 0;
        for (int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];
            sumatoria += num;
        }

        System.out.println("La sumatoria de numeros es " + sumatoria);
       float promedio = (float)sumatoria / numeros.length ;
        System.out.println("El promedio es: " + promedio);
    }
}







