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
    public CuentaBancaria() {
        this(-1);
        //codigos cuando finaliza el llamado anterior
        nombre = "marvin";
        tasa = 0.01;
    }

    public CuentaBancaria(int x) {
        this(x,"panchito");
        //cogigos
        tasa = 0.03;
    }

    public CuentaBancaria(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    //funciones
}
