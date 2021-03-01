/*

Elaborado por: Valentina Meneses Tangarife

Escriba un programa que realice lo siguiente:
    a. Pida al usuario un número N.
    b. Pida al usuario un número M.
    c. Cree una matriz de dimensiones NxM de tipo double.
    d. Pida los NxM números y llene la matriz.
    e. Imprima los elementos de la matriz.
 */
package com.mycompany.tallerevaluativo;

import java.util.Scanner;

/**
 *
 * @author valem
 */
public class Punto4 {

    public static void main(String[] args) {

        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero en N");
        n = sc.nextInt();

        System.out.println("Ingrese un numero en M");
        m = sc.nextInt();

        double[][] matrizdimension = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese el dato de la matriz en: " + i + "," + j);
                matrizdimension[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Datos recopilados de la matriz");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = " + matrizdimension[i][j]);
            }
        }
    }
}
