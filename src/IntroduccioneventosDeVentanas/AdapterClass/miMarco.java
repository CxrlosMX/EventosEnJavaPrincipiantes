/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccioneventosDeVentanas.AdapterClass;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame {
    public miMarco(){
    setVisible(true);
    setTitle("Eventos Ventanas");
    setSize(600,500);
    setLocation(300,150);
   Lamina lamina=new Lamina();
 //  add(lamina); Comentado :)
    addWindowListener(new M_ventana());
    
    }
    
}
