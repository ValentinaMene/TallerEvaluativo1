/*

Elaborado por: Valentina Meneses Tangarife

 Realice una función que implemente la multiplicación de dos vectores
 */
package com.mycompany.tallerevaluativo;

/**
 *
 * @author valem
 */
import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Ingrese una opcion:"
                + "1. a.x + b.y"
                + "2. a.x + b.y + c.z"
                + "3. a.x + b.y + c.z + d.t");
        
        opcion = sc.nextInt();
        
        resultado = Solucion(opcion);
        resultado = resul;
        System.out.println(opcion);
    }
    
    int[][] Num = {{1, 3, 2, 4}, {5, 7, 6, 8}};
    
    public String Solucion(int opcion) {

        String Resul = "";
        int Num1 = Num[0][0];
        int Num2 = Num[1][0];
        int Num3 = Num[0][1];
        int Num4 = Num[1][1];
        int Num5 = Num[0][2];
        int Num6 = Num[1][2];
        int Num7 = Num[0][3];
        int Num8 = Num[1][3];
        switch (opcion) {
            case 1: {
                Resul += Num1 + "." + Num2 + " + " + Num3 + "." + Num4 + " = " + ((Num1 * Num2) + (Num3 * Num4)) + "\n";
                break;
            }
            case 2: {
                Resul += Num1 + "." + Num2 + " + " + Num3 + "." + Num4 + " + " + Num5 + "." + Num6 + " = " + ((Num1 * Num2) + (Num3 * Num4) + (Num5 * Num6)) + "\n";
                break;
            }
            case 3: {
                Resul += Num1 + "." + Num2 + " + " + Num3 + "." + Num4 + " + " + Num5 + "." + Num6 + " + " + Num7 + "." + Num8 + " = " + ((Num1 * Num2) + (Num3 * Num4) + (Num5 * Num6) + (Num7 * Num8)) + "\n";
                break;
            }
        }
        return Resul;
    }
}
