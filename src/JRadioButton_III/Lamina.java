/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton_III;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10/06/2021
 *
 */
public class Lamina extends JPanel {

    private JLabel texto;
    // private JRadioButton op1, op2, op3, op4;
    private ButtonGroup grupo;
    private JPanel laminaNueva;

    public Lamina() {
        setLayout(new BorderLayout());
        laminaNueva = new JPanel();
        //Creamos el Texto
        texto = new JLabel("PUROS CORRIDOS TUMBADOS EHHHHH-AAA");
        texto.setFont(new Font("Serif", Font.BOLD, 15));
        //Agregamos el texto en la parte central
        add(texto, BorderLayout.CENTER);
         grupo = new ButtonGroup();
        //Agregamos los botones con el metodo
        colocarBoton("PEQUEÑO", false, 10);
        colocarBoton("MEDIANO", true, 12);
        colocarBoton("GRANDE", false, 20);
        colocarBoton("MUY GRANDE", false, 30);
        laminaNueva.setBackground(new Color(123,203,150));
        add(laminaNueva, BorderLayout.SOUTH);
        /* //Creamos el grupo+
         grupo = new ButtonGroup();
         //Creamos nuestros RadioButton
         op1 = new JRadioButton("PEQUEÑO", false);
         op2 = new JRadioButton("MEDIANO", true);
         op3 = new JRadioButton("GRANDE", false);
         op4 = new JRadioButton("MUY GRANDE", false);

         //Agregamos el evento 
         cambioTexto evento = new cambioTexto();
         op1.addActionListener(evento);
         op2.addActionListener(evento);
         op3.addActionListener(evento);
         op4.addActionListener(evento);
         grupo.add(op1);
         grupo.add(op2);
         grupo.add(op3);
         grupo.add(op4);
         laminaNueva.add(op1);
         laminaNueva.add(op2);
         laminaNueva.add(op3);
         laminaNueva.add(op4);

         add(laminaNueva, BorderLayout.SOUTH);*/
    }

    //Metodo para colocar botones
    public void colocarBoton(String nombre, boolean activado, final int size) {
        JRadioButton boton = new JRadioButton(nombre, activado);
        grupo.add(boton);
        laminaNueva.add(boton);
        ActionListener evento = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                texto.setFont(new Font("Serif", Font.BOLD, size));
            }

        };
        boton.addActionListener(evento);
    }

    /*  private class cambioTexto implements ActionListener {

     @Override
     public void actionPerformed(ActionEvent e) {
     if (op1.isSelected()) {
     texto.setFont(new Font("Serif", Font.BOLD, 10));
     }
     else if(op2.isSelected()){
     texto.setFont(new Font("Serif", Font.BOLD, 12));
     }
     else if(op3.isSelected()){
     texto.setFont(new Font("Serif", Font.BOLD, 20));
     }
     else if(op4.isSelected()){
     texto.setFont(new Font("Serif", Font.BOLD, 30));
     }
     }

     }*/
}
