/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPropias;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10-sep-2021
 *
 */
public class Uso_pareja {
    
    public static void main(String[] args) {
        Pareja<String> uno = new Pareja<>();
        uno.setPrimero("Hola");
        System.out.println(uno.getPrimero());
        
        Persona p1 = new Persona("Luis");
        
        Pareja<Persona> v = new Pareja<>();
        v.setPrimero(p1);
        System.out.println(v.getPrimero());
    }    
    
}

class Persona {
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    private final String nombre;
}
