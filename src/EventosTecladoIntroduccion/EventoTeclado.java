/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosTecladoIntroduccion;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author El Camaleon
 */
public class EventoTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        //getKeyChar
      //Este metodo nos devuelve la letra pulsada
        char letra=e.getKeyChar();
        System.out.println(letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
     //    int codigo= e.getKeyCode(); //Este metodo devuelve el codigo de la tecla pulsada
      //  System.out.println(codigo); //Cuando precionamos la tecla nos devuelve la letra
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
