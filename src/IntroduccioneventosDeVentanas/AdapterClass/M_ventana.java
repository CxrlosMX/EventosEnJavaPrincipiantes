/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccioneventosDeVentanas.AdapterClass;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author El Camaleon
 */
public class M_ventana extends WindowAdapter{ //Con la clase Adapter nos evitamos tener que 
    //Implementar todos los metodos de la interfas WindowsListener, con esta clase solo implementamos los metodos 
    //Que queremos utilizar
    
     @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Abriendo Ventana");
    }
}
