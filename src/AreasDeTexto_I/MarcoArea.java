/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreasDeTexto_I;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 1/06/2021
 *
 */
public class MarcoArea extends JFrame {

    public MarcoArea() {
        setVisible(true);
        setTitle("Areas de Texto");
        setSize(500,500);
        setLocation(250,150);
        LaminaArea lamina=new LaminaArea();
        lamina.setBackground(Color.GRAY);
        add(lamina);
    }
}
