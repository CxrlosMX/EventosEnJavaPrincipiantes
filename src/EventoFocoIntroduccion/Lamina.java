/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open t0he template in the editor.
 */
package EventoFocoIntroduccion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author El Camaleon
 */
public class Lamina extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        //Agregaremos un tamaño y posicion a nuestros cuadros de texto
        cuadro1.setBounds(170, 200, 150, 20);
        cuadro2.setBounds(170, 230, 150, 20);
        cuadro1.setBackground(Color.LIGHT_GRAY);
        cuadro2.setBackground(Color.LIGHT_GRAY);
        add(cuadro1);
        add(cuadro2);
        LanzaFoco foco = new LanzaFoco();
        cuadro1.addFocusListener(foco);
       
    }
    //Para crear dos cuadros de texto dentro de nuestra ventana
    JTextField cuadro1;
    JTextField cuadro2;
    
    private class LanzaFoco implements FocusListener {
        
        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Has ganado el foco");
        }
        
        @Override
        public void focusLost(FocusEvent e) {
            
            System.out.println("Has perdido el foco");
        }
    }
    
}
