/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton_IIII;

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
    private ButtonGroup grupo;
    private JPanel laminaNueva;

    public Lamina() {
        setLayout(new BorderLayout());
        laminaNueva = new JPanel();
        texto = new JLabel("PUROS CORRIDOS TUMBADOS EHHHHH-AAA");
        texto.setFont(new Font("Serif", Font.BOLD, 15));
        //Agregamos el texto en la parte central
        add(texto, BorderLayout.CENTER);
        grupo = new ButtonGroup();
        //Agregamos los componentes
        colocarBoton("ROJO", false, Color.RED);
        colocarBoton("VERDE", false, Color.GREEN);
         add(laminaNueva, BorderLayout.SOUTH);

    }

    public void colocarBoton(String nombre, boolean activado, Color color) {
        JRadioButton boton = new JRadioButton(nombre, activado);
        grupo.add(boton);
        laminaNueva.add(boton);
        ActionListener evento = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                texto.setForeground(color);
            }

        };
        boton.addActionListener(evento);
    }

}
