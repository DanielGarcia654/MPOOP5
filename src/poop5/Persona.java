/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author poo01alu14
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaNac;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public Fecha getFechaNac(){
        return fechaNac;
    }
    
    public void setFechaNac(Fecha fechaNac){
        this.fechaNac = fechaNac;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }
    
}
