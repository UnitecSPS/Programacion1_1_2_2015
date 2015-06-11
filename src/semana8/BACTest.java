/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.util.Scanner;



/**
 *
 * @author Aula
 */
public class BACTest {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        CuentaBancaria cb1 = new CuentaBancaria();
        
        int numero = lea.nextInt();
        String nombre = lea.next();
        CuentaBancaria cb2 = new CuentaBancaria(numero,nombre);
        
        cb1.numero = lea.nextInt();
        System.out.println("cb1 = " + cb1.numero+"-"+cb1.nombre+" con tasa: "+
                cb1.tasa);

        System.out.println("cb2 = " + cb2.numero+"-"+cb2.nombre+" con tasa: "+
                cb2.tasa);
        
        CuentaBancaria cuentas[] = new CuentaBancaria[10];
        cuentas[0] = new CuentaBancaria();
        System.out.println(cuentas[0].tasa);
        
        
    }
}
