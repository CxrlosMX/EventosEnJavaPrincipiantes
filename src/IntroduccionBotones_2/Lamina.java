/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionBotones_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author El Camaleon
 */
public class Lamina extends JPanel {

    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");

    JButton botonAmarillo = new JButton("Amarillo");

    public Lamina() {
        add(botonAzul);
        //Agregamos los botones
        add(botonRojo);
        add(botonAmarillo);
        botonRojo.setBackground(Color.RED);
        botonAzul.setBackground(Color.BLUE);
        botonAmarillo.setBackground(Color.YELLOW);
        
        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo rojo = new ColorFondo(Color.RED);
        ColorFondo azul = new ColorFondo(Color.BLUE);
        botonRojo.addActionListener(rojo);
        botonAmarillo.addActionListener(amarillo);
        botonAzul.addActionListener(azul);

    } 
    
    //Clases internas
    private  class ColorFondo implements ActionListener{
    public ColorFondo(Color c){ //Parametro de tipo color
    colorDeFondo=c;
        
        
    }
     //Si implementamos nuestro interfaz debemos implementar nuestro metodo forsozamente
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(colorDeFondo);
        
    }
    private Color colorDeFondo;
    

   
    
}

}
