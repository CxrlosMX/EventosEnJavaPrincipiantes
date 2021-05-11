/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosDeRaton;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame{
    public miMarco(){
    setSize(500,500); 
    setVisible(true);
    setLocation(150,70);
    setTitle("Eventos de ratón");
    mouseEventos mouse=new mouseEventos();
    addMouseListener(mouse);
    
    }
    
}
