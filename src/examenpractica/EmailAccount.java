/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenpractica;

/**
 *
 * @author mac
 */
public class EmailAccount {
    private String direccion, nombre;
    private Email inbox[];

    public EmailAccount(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
        inbox = new Email[100];
    }
    
    public boolean recibirEmail(Email em){
        for(int p=0; p < inbox.length; p++){
            if(inbox[p] == null){
                inbox[p] = em;
                return true;
            }
        }
        return false;
    }
    
    public void printInbox(){
        System.out.println("Direccion: " + direccion);
        System.out.println("Usuario: " + nombre);
        int sinLeer=0, recibidos=0;
        
        for(int e=0; e < inbox.length; e++){
            //procurar tomar en cuenta SOLO los != null
            if(inbox[e] != null){
                //hay un email!
                recibidos++;
                System.out.print((e+1) + inbox[e].getFrom() + " - " +
                        inbox[e].getSubject());
                if(inbox[e].isRead()){
                    System.out.println("- LEIDO");
                }
                else{
                    sinLeer++;
                    System.out.println("- SIN LEER");
                }
            }
        }
        
        System.out.println("Emails Recibidos: " + recibidos);
        System.out.println("Emails Sin Leer : " + sinLeer);
    }
    
    public void leerEmail(int pos){
        if(inbox[pos-1] != null){
            inbox[pos-1].print();
            inbox[pos-1].leido();
        }
        else{
            System.out.println("CORREO NO EXSISTE");
        }
    }
    
    public void borrarLeidos(){
        for(int e=0; e < inbox.length; e++){
            if(inbox[e] != null && inbox[e].isRead()){
                inbox[e] = null;
            }
        }
    }
    
}
