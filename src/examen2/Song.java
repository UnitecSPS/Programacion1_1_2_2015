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
public class Song {
    private int codigo;
    private String nombre;
    private double precio;
    private int estrellas, reviews;
    
    public Song(int c, String n, double p){
        codigo = c;
        nombre = n;
        precio = p;
        estrellas = 0;
        reviews = 0;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void addStars(int stars){
        if(stars>=0 && stars <= 5){
            estrellas += stars;
            reviews++;
        }
    }
    
    public double songRating(){
        if(reviews==0){
            return 0;
        }
        return estrellas/reviews;
    }
    
    public void print(){
        System.out.println(codigo+"-"+nombre+"-"+precio+"-"+songRating());
    }
}
