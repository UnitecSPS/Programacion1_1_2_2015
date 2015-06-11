/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Aula
 */
public class Prueba4 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int filas = lea.nextInt();
        int columnas = lea.nextInt();
        //declaro e inicializo el arreglo
        int bidi[][] = new int[filas][columnas];
        //lleno el arreglo
        for(int f=0; f < filas; f++){
            for (int c = 0; c < columnas; c++) {
                System.out.print("valor para bidi["+f+"]["+c+"]: ");
                bidi[f][c] = lea.nextInt();
            }
        }
        //imprimo el arreglo
        for (int f = 0; f < filas; f++) {
            if( f % 2 == 0){
                for (int c = 0; c < columnas; c++) {
                    System.out.print(bidi[f][c]+ " ");
                }
            }
            else{
                for (int c = columnas-1; c >= 0; c--) {
                    System.out.print(bidi[f][c]+ " ");
                }
            }
        }
    }
}
