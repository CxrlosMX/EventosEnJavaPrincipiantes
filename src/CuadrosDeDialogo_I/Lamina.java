/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadrosDeDialogo_I;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 19/07/2021
 *
 */
public class Lamina extends JPanel {

    //Agregamos las variables que usaremos
    private JButton boton1, boton2, boton3, boton4;

    public Lamina() {
        //Creamos nuestros objetos JButton
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");

        //Agregamos el evento
        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());

        //Agregamos nuestros botones a Nuestra Lamina
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

    }

    //Clase interna que gestionara los eventos
    private class Accion_botones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                //Este metodo de la clase JOptionPane, recibe (componentePadre,mensaje)
                JOptionPane.showMessageDialog(Lamina.this, "Has pulsado el boton 1");
                //El componente padre es para que se muestre el mensaje en la lamina y no fuera de ella
               // System.out.println("Has pulsado el boton 1");
            } else if (e.getSource() == boton2) {
                JOptionPane.showMessageDialog(Lamina.this, "Has pulsado el boton 2", "Brr",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/bd.jpg"));
              //  System.out.println("Has pulsado el boton 2");
            } else if (e.getSource() == boton3) {
                   JOptionPane.showMessageDialog(Lamina.this, "Has pulsado el boton 3", "Brr",JOptionPane.INFORMATION_MESSAGE);
             
              //  System.out.println("Has pulsado el boton 3");
            } else {
                JOptionPane.showInputDialog(Lamina.this,"Introduce Nombre","Nombre",1);
                        
                System.out.println("Has pulsado el boton 4");
            }
        }
    }

}
