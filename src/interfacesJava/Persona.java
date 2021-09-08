/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesJava;

/**
 *
 * @author CxrlosMX
 */
public interface Persona {
    
    /*
    NOTA IMPORTANTE: En una interfaz nunca se declaran atributos solo es para la creacion 
    de métodos
    
    */
    /*
    Al Hacer uso de una interfas automaticamente nuestros métodos son 'Public'
    ademas los valores que declaremos dentro de la interfas automaticamente quedan con el atributo 
    "final" 
    Ejemplo:
    
    int numero=10;
    Realizar esto seria los mismo que escribir:
    public final int=10;
    
    */
    void hablar(); //Este método es un método abstracto
    
}
