/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts.II;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 *
 */
public class Lamina extends JPanel {

    private JPanel miLamina;
    private JButton pantalla;
    private boolean principio;

    public Lamina() {
        principio=true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        miLamina = new JPanel();
        add(pantalla, BorderLayout.NORTH);
        pantalla.setEnabled(false);
        ActionListener insertar = new insertaNumero();
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        //ponerBoton("/");
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        // ponerBoton("*");
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        //  ponerBoton("-");
        ponerBoton("0", insertar);
      //  ponerBoton(".");
        //  ponerBoton("=");
        //  ponerBoton("+");
        miLamina.setLayout(new GridLayout(4, 4)); //Con esto indicamos que va a tener 4 filas y 4 columnas
        add(miLamina, BorderLayout.CENTER);
    }

    //Crearemos un metodo para agregar botones
    private void ponerBoton(String rotulo, ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        miLamina.add(boton);
    }

    //Clase que gestionara los eventos de la calculadora
    private class insertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada); //Le mandamos nuestro valor de entrada a nuestro boton que se usara para representar los numeros
        }

    }

}
