/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Layouts.II;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 * 
 */
public class miMarco extends JFrame{
    public miMarco(){
    setVisible(true);
    setSize(500,500);
    setLocation(300,150);
    setTitle("Usando GridLayout");
    Lamina lamina=new Lamina();
    lamina.setBackground(new Color(34,76,98));
    add(lamina);
    }
    
}