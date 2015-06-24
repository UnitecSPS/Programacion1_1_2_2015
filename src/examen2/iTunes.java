/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Aula
 */
public class iTunes {
    private Song canciones[];
    public static int MAX_SONGS = 100;
    public int contador=0;
    
    public iTunes(){
        canciones = new Song[MAX_SONGS];
    }
    
    public Song search(int c){
        for(Song cancion : canciones){
            if(cancion != null && cancion.getCodigo() == c){
                return cancion;
            }
        }
        return null;
    }
    
    public boolean addSong(int c, String n, double p){
        if(search(c) == null){
            if(contador < canciones.length){
                canciones[contador++] = new Song(c,n,p);
                return true;
            }
        }
        return false;
    }
    
    public void rateSong(int stars,int c){
        Song s = search(c);
        if(s != null){
            s.addStars(stars);
            s.print();
        }
    }
    
    public void printSongs(){
        for(int s=0; s < canciones.length; s++){
            if(canciones[s] != null){
                canciones[s].print();
            }
        }
    }
    
    public void report(){
        double suma=0, mejorRating=0;
        Song mejorCancion = null;
        
        for(int s=0; s < contador; s++){
            suma += canciones[s].getPrecio();
            double rating = canciones[s].songRating();
            if(rating > mejorRating){
                mejorRating = rating;
                mejorCancion = canciones[s];
            }
        }
        System.out.println("Total Canciones: "+contador);
        System.out.println("Suma Precios: "+ suma);
        System.out.println("La mejor cancion fue: ");
        mejorCancion.print();
        System.out.println("Con el rating "+mejorRating);
    }
    
}
