/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts.II;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
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

    public Lamina() {
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        miLamina = new JPanel();
        add(pantalla, BorderLayout.NORTH);
        pantalla.setEnabled(false);
        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("/");
        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");
        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("-");
        ponerBoton("0");
        ponerBoton(".");
        ponerBoton("=");
        ponerBoton("+");
        miLamina.setLayout(new GridLayout(4, 4)); //Con esto indicamos que va a tener 4 filas y 4 columnas
        add(miLamina, BorderLayout.CENTER);
    }

    //Crearemos un metodo para agregar botones
    private void ponerBoton(String rotulo) {
        JButton boton = new JButton(rotulo);
        miLamina.add(boton);
    }

}
