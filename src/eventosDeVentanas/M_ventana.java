/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosDeVentanas;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

/**
 *
 * @author El Camaleon
 */
public class M_ventana implements WindowListener {

    //Para poder usar nuestra interfaz es necesario implementar nuestros metodos 
    @Override
    //invoked when a window is changed from a normal to a minimized state.
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Abriendo Ventana");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("La Ventana ha sido Cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
          System.out.println("Ventana minimizada");
    }

    @Override
    public void windowActivated(WindowEvent we) { //Este metodo se activa cuando la ventana se activa o ejecuta
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) { //Se invoca cuando la ventana es desactivada
        System.out.println("Ventana desactivada");
    }

}
