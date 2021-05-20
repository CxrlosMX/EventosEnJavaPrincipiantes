/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosTecladoIntroduccion;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame{
    
    public miMarco(){
    setSize(600,500);
    setLocation(250,150);
    setTitle("Eventos de teclado");
    setVisible(true);
    EventoTeclado eventoTeclado=new EventoTeclado();
    
    addKeyListener(eventoTeclado);
    
    }
    
}
