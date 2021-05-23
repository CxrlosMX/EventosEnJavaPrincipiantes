/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiplesFuentes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 20/05/2021
 *
 */
public class Lamina extends JPanel {

    JButton nuevo = new JButton("CREAR VENTANA");

    public Lamina() {
        nuevo.setBackground(Color.BLACK);
        cerrar = new JButton("CERRAR TODO");
        nuevo.setForeground(Color.white);
        add(nuevo);
        add(cerrar);
        oyenteNuevo oyente = new oyenteNuevo();
        nuevo.addActionListener(oyente);
    }

    private class oyenteNuevo implements ActionListener { //Creamos una nueva clase para llamar a nuestro boton

        @Override
        public void actionPerformed(ActionEvent e) {
            marcoEmergente marco = new marcoEmergente(cerrar);
        }

    }
    JButton cerrar;

}

class marcoEmergente extends JFrame { //Esta clase es para crear nuevas ventana

    public marcoEmergente(JButton exit) { //Dentro de nuestro constructor creamos atributos para nuestra ventana
        contador++;
        setVisible(true);
        setTitle("Ventana Emergente " + contador);
        setSize(500, 500);
        setLocation(40 * contador, 40 * contador);
        design dis=new design();
        add(dis);
        dis.setBackground(new Color(45,76,32));
        cierre c = new cierre();
        exit.addActionListener(c);

        // Lamina lamina = new Lamina();
        //add(lamina);
        //lamina.setBackground(new Color(13, 76, 169));
    }

    private class cierre implements ActionListener { //Creamos la clase interna para cerrar las ventanas

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose(); //Metodo para cerrar todas las ventanas

        }

    }

    private class design extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g); //Invocamos el metodo desde la  clase padre para usarlo
            g.drawString("Hola :) tu puedes", 100, 100); //Le tienes que pasar como paremetros la ubicACION donde queremos el texto

        }

    }
    private static int contador = 0;
}
