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
public interface Musico extends Persona{ //Especificamos que queremos que nuestra interfas herede de nuestro interfas Personas
    /*
    Cuando hereda una interfas de otra interfas no es necesrio que implemente sus métodos
    */
    
    void tocarMusica();
    
    /*
    NOTA: Una interfas no puede tener métodos que se implementen 
    */
    
}
