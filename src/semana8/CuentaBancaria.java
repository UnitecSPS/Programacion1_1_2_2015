/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

/**
 *
 * @author Aula
 */
public class CuentaBancaria {
    //atributos
    //-Deben estar contenidos nada mas por las llaves de la clase
    //Atributos a nivel de Objeto
    //-FORMATO id_de_acceso Tipo id    
    public int numero;
    public String nombre;
    public double saldo, tasa = 0.02;
    
    //constructor
    public CuentaBancaria(){
        System.out.println("SE LLAMO ESTE CONSTRUCTOR ()");
        nombre = "panchito";
        tasa = 0.01;
        numero = -1;
    }
    
    public CuentaBancaria(int num, String nom){
        numero = num;
        nombre = nom;
    }
    
    //funciones
}
