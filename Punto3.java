/*

Elaborado por: Valentina Meneses Tangarife

Realice una función que implemente el producto cruz o determinante de una matriz
compuesta por dos vectores en R3

Debe recibir como entrada dos vectores de tres elementos y debe devolver un
vector de tres elementos
 */
package com.mycompany.tallerevaluativo;

import java.util.Scanner;
/**
 *
 * @author valem
 */

public class Punto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int [] vector =  new int[3];
        int [] vector2 =  new int[3];
        int [][] matriz = new int [2][3];
        int [] vector3 =  new int[12];
        
        for(int i=0; i < 3; i++){
            System.out.println("Ingrese el valor #" + (i+1) + " para el primer vector");
            vector[i] = sc.nextInt();
            matriz[0][i] = vector[i];
            System.out.println("Ingrese el valor #" + (i+1) + " para el segundo vector");
            vector2[i] = sc.nextInt();
            matriz[1][i] = vector2[i];
        }
        
        for(int i=0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                if(i==0 && j==0){
                    vector3[4]= matriz[i][j];
                    vector3[8]= matriz[i][j];
                }
                
                if(i==0 && j ==1){
                    vector3[0]= matriz[i][j];
                    vector3[11]= matriz[i][j];
                }
                
                if(i==0 && j==2){
                   vector3[3]= matriz[i][j];
                   vector3[7]= matriz[i][j];
                }
                
                if(i==1 && j==0){
                    vector3[6]= matriz[i][j];
                    vector3[10]= matriz[i][j];
                }
                
                if(i==1 && j==1){
                    vector3[2]= matriz[i][j];
                    vector3[9]= matriz[i][j];
                }
                
                if(i==1 && j==2){
                    vector3[1]= matriz[i][j];
                    vector3[5]= matriz[i][j];
                }
            }
        }
        System.out.println("");
        for(int i=0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+",");
            }
            System.out.println("");
            }
            System.out.println("");
            System.out.print("=i("+vector3[0]+"."+vector3[1]+"-"+vector3[2]+"."+vector3[3]+
                    ")-j("+vector3[4]+"."+vector3[5]+"-"+vector3[6]+"."+vector3[7]+
                    ")+k("+vector3[8]+"."+vector3[9]+"-"+vector3[10]+"."+vector3[11]+")");
            System.out.println("");
            
            for(int i=0; i <3; i++){
                if(i==0){
                    vector[i]=(vector3[0]*vector3[1]) - (vector3[2]*vector3[3]);
                }
                
                if(i==1){
                    vector[i]=(vector3[4]*vector3[5]) - (vector3[6]*vector3[7]);
                    vector[i]=vector[i]*-1;
                }
                
                if(i==2){
                    vector[i]=(vector3[8]*vector3[9]) - (vector3[10]*vector3[11]);
                }
                System.out.print(vector[i]+",");
            }
        
    }
    
}
