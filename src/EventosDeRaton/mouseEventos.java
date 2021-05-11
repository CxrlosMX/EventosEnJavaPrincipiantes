/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosDeRaton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author El Camaleon
 */
public class mouseEventos implements MouseListener { //Puedes usar la clase MouseAdapter y evitar sobre escribir tus metodos

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Has hecho click en el Frame");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Acaba de precionar");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Acaba de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Acaba de entrar");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Acaba de salir");
    }

}
