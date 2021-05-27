/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuadrosDeTexto;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 26/05/2021
 * 
 */
public class MarcoTexto extends  JFrame{
    public MarcoTexto(){
    setVisible(true);
    setTitle("Cuadros de Texto");
    setSize(500,500);
    setLocation(200,260);
    LaminaTexto lamina=new LaminaTexto();
    lamina.setBackground(new Color(34,67,56));
    add(lamina);
    }

}
