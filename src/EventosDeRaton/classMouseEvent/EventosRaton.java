/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosDeRaton.classMouseEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author El Camaleon
 */
public class EventosRaton extends MouseAdapter implements MouseMotionListener{

    /*   @Override
     public void mouseClicked(MouseEvent e) {
     //System.out.println("Numero de clicks: " + e.getClickCount());
     //System.out.println("Coordenada X:"+e.getX() +"\nCoordenada Y: "+e.getY()); //Puede funcionar para verificar si el usuario ha abierto un menu

     }*/
    @Override
    public void mousePressed(MouseEvent e) {
        int n = e.getModifiersEx();
        if (n == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Boton Izquierdo precionado en el Mouse");
        } else if (n ==MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Boton Derecho precionado en el Mouse");
        } else {
            System.out.println("Boton de la rueda precionado");
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent e){
        System.out.println("Estas arrastrando");
    }
    @Override
    public void mouseMoved(MouseEvent e){
        System.out.println("Estas moviendo el ratón");
    }
}
