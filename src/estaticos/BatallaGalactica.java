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
public class BatallaGalactica {
    static Marciano marcianos[] = new Marciano[10];
    
    public static void main(String[] args) {
        agregar();
        evaluar();
    }

    private static void agregar() {
        marcianos[0] = new Marciano("Alf");
        marcianos[1] = new Marciano("Marvin");
        marcianos[2] = new Marciano("Zim");
        marcianos[3] = new Marciano("Pepe");
        marcianos[4] = new Marciano("Quinto");
    }

    private static void evaluar() {
        for(Marciano m : marcianos){
            if( m!= null){
                m.atacar();
            }
        }
    }
}
