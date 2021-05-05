/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosDeVentanas;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame{
    public miMarco(){
    setVisible(true);
    setTitle("Eventos con ventanas");
    //setSize(500,500);
    setLocation(250,250);
   M_ventana ventana=new M_ventana();
   addWindowListener(ventana);
    }
    
}
