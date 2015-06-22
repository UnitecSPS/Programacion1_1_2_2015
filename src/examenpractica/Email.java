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
public class Email {
    private String from, subject, content;
    private boolean read;

    public Email(String from, String subject, String content) {
        this.from = from;
        this.subject = subject;
        this.content = content;
        read = false;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return read;
    }
    
    public void leido(){
        read = true;
    }
    
    public void print(){
        System.out.println("DE: "+from);
        System.out.println("ASUNTO: " + subject);
        System.out.println(content);
    }
}
