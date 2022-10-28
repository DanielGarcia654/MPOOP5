/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author poo01alu14
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.setNombre("Daniel");
        System.out.println(persona1.getNombre());
        persona1.setApellido("Garcia");
        System.out.println(persona1.getApellido());
        
        persona1.setFechaNac(new Fecha(22,10,22));
        System.out.println(persona1.getFechaNac());
        
        Persona persona2 = new Persona("Arturo", "Pacheco", new Fecha(29, 07, 2003));
        System.out.println(persona2);
        
        Fecha fechaP3 = new Fecha();
        fechaP3.setDia(34);
        fechaP3.setMes(13);
        fechaP3.setAnio(99);
        Persona persona3 = new Persona("Rocio", "Cardenas", fechaP3);
        System.out.println(persona3);
    }
    
}
