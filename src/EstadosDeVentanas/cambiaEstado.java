/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadosDeVentanas;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 *
 * @author El Camaleon
 */
public class cambiaEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent we) {

        //System.out.println("La ventana ha sido activada");

        //System.out.println(we.getNewState()); //Este metodo nos devuelve un estado nuevo dentro de la ventana
        if (we.getNewState() == 0) {
            System.out.println("Ventana en tamaño normal");
        }
        else if(we.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana ha sido maximizada");
        }
        else if(we.getNewState()==Frame.ICONIFIED){
            System.out.println("La ventana se encuentra minimizada");
        }
       
    }

}
