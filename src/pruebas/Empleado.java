/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Aula
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private double salario;
    
    public Empleado(int c, String n, double s){
        codigo = c;
        nombre = n;
        salario = s;
    }
    
    public void print(){
        System.out.println(codigo+"-"+nombre+" Lps."+salario);
    }
    
    public double calcularPago(double t){
        return salario - (salario*t);
    }
}
