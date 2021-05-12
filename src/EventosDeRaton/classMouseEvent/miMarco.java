/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosDeRaton.classMouseEvent;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame{
    public miMarco(){
    setVisible(true);
    setSize(500,300);
    setLocation(150,100);
    setTitle("Eventos de raton");
    EventosRaton evento=new EventosRaton();
    addMouseListener(evento);
    addMouseMotionListener(evento);
    }
}
