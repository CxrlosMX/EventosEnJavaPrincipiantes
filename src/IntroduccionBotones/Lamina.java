/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionBotones;

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
public class Lamina extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");   //Con esto estamos llamando a nuestro boton
    //y el texto que recibe es el texto que queremos que muestre
    //Para mostrar el boton debemos construir el constructor

    //Creamos mas botones para cambiar el color
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
        
        botonRojo.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonAzul.addActionListener(this); //Como decir al hacer click
        //Al poner el this estamos haciendo referencia a la propia clase 
        //Con este metodo hacemos una accion, dentro de el asignamos quien recivira la accion del evento
    }

    @Override
    public void actionPerformed(ActionEvent e) {  
        //Este evento recive por parametro un evento de tipo Mouse 
        //getSource permite calcular el origen del evento
        Object botonPulsado=e.getSource(); //Nos devuelve la fuente
        if(botonPulsado==botonAzul){
            setBackground(Color.BLUE); //Le decimos que cuando toquemos el boton cambie el color de la lamina
            
          
        }
        else if(botonPulsado==botonRojo){
        setBackground(Color.RED);
        }else {
        setBackground(Color.YELLOW);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
