/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts.I;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/05/2021
 *
 */
public class Lamina extends JPanel {

    public Lamina() {
        //Cambiaremos la posicion de los componentes en la lamina
        // setLayout(new FlowLayout(FlowLayout.CENTER,50,100));

        //Crearemos una nueva posicion con BorderLayout
        setLayout(new BorderLayout(10, 10));
        //Agregamos objetos de tipo JButton
        add(new JButton("Negro"), BorderLayout.CENTER);
        add(new JButton("Amarillo"), BorderLayout.NORTH);
           add(new JButton("Verde"),BorderLayout.EAST);

    }
}

class Lamina2 extends JPanel {

    public Lamina2() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 50, 100));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
     
    }

}
