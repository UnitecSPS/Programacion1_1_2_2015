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
public class EmailMain {
    public static void main(String[] args) {
        EmailAccount ea = new EmailAccount("java@unitec.edu", "Don Java");
        Email gotmail = new Email("python@unitec.edu", "Como Estas?","Hablame cuando podas");
        
        if( ea.recibirEmail(gotmail) ){
            System.out.println("Se recibió email!");
        }
        else{
            System.out.println("No se puede recibir!");
        }
    }
}
