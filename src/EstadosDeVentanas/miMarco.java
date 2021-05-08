/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadosDeVentanas;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame{
    public miMarco(){
    setVisible(true);
    setSize(500,600);
    setLocation(250,150);
    setTitle("Controlando estados de ventanas");
    cambiaEstado estado=new cambiaEstado();
    addWindowStateListener(estado);
    }
    
}
