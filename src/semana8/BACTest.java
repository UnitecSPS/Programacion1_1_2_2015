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
        CuentaBancaria cb2 = new CuentaBancaria();
        
        cb1.numero = lea.nextInt();
        cb1.nombre = lea.next();
        System.out.println("cb1 = " + cb1.numero+"-"+cb1.nombre+" con tasa: "+
                cb1.tasa);
  
        cb2.numero = lea.nextInt();
        cb2.nombre = lea.next();
        System.out.println("cb1 = " + cb2.numero+"-"+cb2.nombre+" con tasa: "+
                cb2.tasa);
        
        CuentaBancaria cuentas[] = new CuentaBancaria[10];
       // cuentas[0] = new CuentaBancaria();
        System.out.println(cuentas[0].tasa);
        
        
    }
}
