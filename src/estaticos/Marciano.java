/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticos;

/**
 *
 * @author Aula
 */
public class Marciano {
    private String nombre;
    public static int CONTADOR=0;

    public Marciano(String nombre) {
        this.nombre = nombre;
        CONTADOR++;
    }
    
    public static int getContador(){
        return CONTADOR;
    }
    
    public void atacar(){
        if(CONTADOR>=5){
            System.out.println("Yo "+nombre+" ATACO!");
        }
        else{
            System.out.println("Yo "+nombre+" SOY COBARDE Porque SOLO Hay "+
                    CONTADOR+" marcianos");
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
