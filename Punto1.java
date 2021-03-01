/*

Elaborado por: Valentina Meneses Tangarife

 Realice un pequeño programa que reciba del usuario un conjunto de enteros separados por
comas y los guarde en un vector. Luego, con base en dicho números debe calcular:
    a. La suma.
    b. El promedio.
    c. El mayor valor.
    d. El menor valor.

Nota: Se recomienda usar el método split de la clase String
 */
package com.mycompany.tallerevaluativo;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        int suma = 0, promedio = 0, mayor = 0;
        int cant;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad del numeros: ");
        cant = sc.nextInt();

        int[] num = new int[cant];

        for (int i = 0; i < num.length; i++) {
            System.out.println(" Ingrese el numero ");
            num[i] = sc.nextInt();

            suma = suma + num[i];
            promedio = suma / cant;
        }
        
        int menor = num[0];
        
        for (int j = 0; j < num.length; j++) {

            if (num[j] > mayor) {
                mayor = num[j];
            }
            if (num[j] < menor && num[j] != 0 || menor == 0) {
                menor = num[j];
            }
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        /*
        String[] arrayNumeros = numeros.split(",");

        for(int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i]);
        }
        
        int numerosEnt = Integer.parseInt(numeros.trim());
        int [] vector = new int [numerosEnt];
         */
    }
}
