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
public class CuentaBancaria {

    //atributos
    //-Deben estar contenidos nada mas por las llaves de la clase
    //Atributos a nivel de Objeto
    //-FORMATO id_de_acceso Tipo id    

    private int numero;
    private String nombre;
    private double saldo, tasa = 0.02;

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
        saldo = 500;
    }

    //funciones
    public void setNumero(int num){
        numero = num;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setTasa(double t){
        tasa = t;
    }
    
    public void print(){
        System.out.println(numero+"-"+nombre+" con tasa: "+tasa+
                " Saldo Lps."+saldo);
    }
    
    /**
     * Funcion llamada deposita que le adiciona un monto double
     * al saldo. Se deja depositar SOLO si dicho monto es >=0
     * NO RETORNA NADA
     */
    public void depositar(double monto){
        if(monto>=0){
            saldo += monto;
        }
    }
    
}
