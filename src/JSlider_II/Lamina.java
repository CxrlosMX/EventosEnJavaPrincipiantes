/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSlider_II;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/06/2021
 *
 */
public class Lamina extends JPanel {

    private JPanel lamina2;
    private JLabel texto;
    private JSlider barra;

    public Lamina() {
        //Asinamos un tipo de Layut a nuestra lamina principal
        setLayout(new BorderLayout());
        //instaniamos nuestro JLabel
        texto = new JLabel("HOLA");
        texto.setFont(new Font("Serif", Font.ITALIC, 50));

        //Agregamos la segunda Lamina
        lamina2 = new JPanel();
        //Agregamos nuestra barra de JSlider
        barra = new JSlider();
        //Metodos para los campos que se movera la barra maximo y minimo
        barra.setMajorTickSpacing(25);
        barra.setMinorTickSpacing(5);
        //Metodo para imprimir las marcas de cada valor
        barra.setPaintTicks(true);
        //Metodo para imprimir los valores numericos en la barra
        barra.setPaintLabels(true);
        //Metodo para que la barra solo pueda quedar en valores designados en ella
        barra.setSnapToTicks(true);
        //Cambiamos la fuentes de los numeros que aparecen en la barra
        barra.setFont(new Font("Serif", Font.ITALIC, 15));
        //Agregamos el eventos a nuestro compente
        EventoTexto evento = new EventoTexto();
        barra.addChangeListener(evento);
        //Agregamos nuestro componente a nuestra segunda lamina
        lamina2.add(barra);
        //Agregamos nuestros componentes a la lamina principal
        add(lamina2, BorderLayout.SOUTH);
        add(texto, BorderLayout.CENTER);
    }

    //Creamos la clase que gestionara el evento

    private class EventoTexto implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent ce) {
            int n = barra.getValue();
            texto.setFont(new Font("Serif", Font.ITALIC, n));
            texto.setForeground(new Color(n));
            //System.out.println(n);
        }

    }
}
