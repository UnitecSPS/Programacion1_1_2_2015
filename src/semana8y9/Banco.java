/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8y9;

/**
 *
 * @author Aula
 */
public class Banco {
    private String nombre;
    private CuentaBancaria cuentas[];
    private int contador=0;
    
    public Banco(String n,int max){
        nombre=n;
        cuentas = new CuentaBancaria[max];
    }
    
    public boolean agregarCuenta(int num,String cli){
        if(contador < cuentas.length){
            cuentas[contador] = new CuentaBancaria(num, cli);
            contador++;
            return true;
        }
        return false;
    }
    
    
    
}
