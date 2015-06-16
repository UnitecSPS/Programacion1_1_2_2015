/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8y9;

import java.util.Scanner;



/**
 *
 * @author Aula
 */
public class BACTest {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        CuentaBancaria cb1 = new CuentaBancaria();
        cb1.setNumero(8);
        cb1.print();
        
        int numero = lea.nextInt();
        String nombre = lea.next();
        CuentaBancaria cb2 = new CuentaBancaria(numero,nombre);
        cb2.depositar(2500);
        cb2.print();
        
        CuentaBancaria cuentas[] = new CuentaBancaria[10];
        cuentas[0] = new CuentaBancaria();
        //System.out.println(cuentas[0].tasa);
        
        
    }
}
