/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadrosDeTexto.I;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 27/05/2021
 *
 */
public class MarcoPassword extends JFrame {
    
    public MarcoPassword() {
        setVisible(true);
        setTitle("Inicio sesion");
        setSize(400,400);
        setLocation(300,150);
        LaminaPassWord lamina=new LaminaPassWord();
       
        lamina.setBackground(new Color(0,0,0));
        add(lamina);
    }
}
