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
    
    /**
     * FORMATO PARA RETORNAR ALGO:
     *     return EXPR;
     * REGLAS DE GOCHEZ PARA FUNCIONES QUE DEVUELVEN ALGO:
     *     1- DEBO retornar un valor compatible de acuerdo al tipo de la funcion
     *         sino: Tendre un Incompatible Type Error
     *     2- DEBO SIEMPRE retornar un valor. Todos los caminos de ejecucion
     *        deben llegar a un retorno. Sino: Missing Return Statement Error
     *     3- NO DEBO colocar ninguna instruccion inmediatamente despues de un
     *         return. sino: Unreachable Statement Error
     */
    
    public int getNumero(){
        return numero;
    }
    
    public String getNombre(){
        
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public double getTasa(){
        return tasa;
    }
    
    public boolean retirar(double m){
        if(m >=0 && saldo > m){
            saldo -= m;
            System.out.println("Se pudo retirar!");
            return true;
        }
        return false;
    }
    
    public double adicionarInteres(){
        double inte = saldo * tasa;
        saldo += inte;
        return inte;
    }
    
}
