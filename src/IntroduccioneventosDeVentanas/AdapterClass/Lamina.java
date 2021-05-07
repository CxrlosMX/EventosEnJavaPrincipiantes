/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccioneventosDeVentanas.AdapterClass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author El Camaleon
 */
public class Lamina extends JPanel implements MouseListener{
  JButton botonRojo = new JButton("Rojo");
    public Lamina(){
    add(botonRojo);
     botonRojo.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
          setBackground(Color.RED);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        setBackground(Color.RED);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
      setBackground(Color.RED);   //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       setBackground(Color.RED); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
          setBackground(Color.RED); //To change body of generated methods, choose Tools | Templates.
    }
     
  
    
}
