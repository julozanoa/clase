/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Perro {
    private String nombre;
    private double edad;
    private String color;
    private double peso;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public void comer(){
    
    }
    
    public void ladrar(){
        
    }
    
    public void correr(){
        
    }
    
    public void dormir(){
        
    }
}
