/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSpinner_II;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/06/2021
 *
 */
public class Lamina extends JPanel {

    private JLabel texto;
    private JSpinner control;
    private JPanel lamina2;

    public Lamina() {
        //Declaramos el tipo de Layout en nuestra lamina
        setLayout(new BorderLayout());
        //Instanciamos nuestra segunda Ventana
        lamina2 = new JPanel();
        lamina2.setBackground(new Color(12,5,67));
        //Inicializamos nueestro texto
        texto = new JLabel("CxrlosMX");
        texto.setFont(new Font("Serif", Font.ITALIC, 10));
        //Inicializamos nuestro componente JSPinner
        control = new JSpinner(new SpinnerNumberModel(10, 9, 100, 5)); //(valorInicial,NumeroMinimio,Maximo,DecuantoAvanzara);
        //Configuramos el tamaño de nuestro componente SPinner
        Dimension d = new Dimension(200, 20);
        control.setPreferredSize(d);
        //Creamos una instancia de nuestro evento
        EventoTexto evento=new EventoTexto();
        control.addChangeListener(evento);
        //Agregamos nuestro componente SPInner a nuestra segunda Lamina
        lamina2.add(control);
        //Agregamos nuestros componentes a nuestra lamina principal
        add(texto, BorderLayout.CENTER);
        //Agregamos nuestra segunda lamina a nuestra lamina principal
        add(lamina2,BorderLayout.NORTH);
    }

    //Clase que gestionara el evento
    private class EventoTexto implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent ce) {
            texto.setFont(new Font("Serif", Font.ITALIC, (int) control.getValue()));
        }

    }

}
