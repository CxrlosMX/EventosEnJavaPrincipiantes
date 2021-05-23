/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts.I;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/05/2021
 *
 */
public class miMarco extends JFrame {

    public miMarco() {
        setVisible(true);
        setTitle("Layouts I");
        setLocation(200, 150);
        setSize(500, 600);
        Lamina lamina = new Lamina();
        //FlowLayout posicion = new FlowLayout(FlowLayout.LEFT);
        //lamina.setLayout(new FlowLayout(FlowLayout.CENTER,50,100)); //Podemos instanciar directamente o podemos crear un objeto de FlowLayout
        add(lamina,BorderLayout.SOUTH);
        lamina.setBackground(new Color(45, 87, 93));
        Lamina2 lamina2 = new Lamina2();
        add(lamina2,BorderLayout.NORTH);
        lamina2.setBackground(new Color(65, 98, 29));
    }

}
