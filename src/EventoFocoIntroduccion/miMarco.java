/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventoFocoIntroduccion;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class miMarco extends JFrame{
    public miMarco(){
    setVisible(true);
    setTitle("Introduccion a eventos de foco");
    setSize(500,400);
    setLocation(450,200);
    Lamina lamina=new Lamina();
    add(lamina);
    lamina.setBackground(new Color(0,0,0));
    }
}
