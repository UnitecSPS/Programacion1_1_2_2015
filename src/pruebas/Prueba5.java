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
public class Prueba5 {
    public static void main(String[] args) {
        Empleado emp = new Empleado(1, "Carlos Gochez", 4500);
        emp.print();
        System.out.println("Pago: "+emp.calcularPago(0.03));
    }
}
