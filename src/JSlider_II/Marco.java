/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSlider_II;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/06/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setVisible(true);
        setSize(500, 500);
        setLocation(300, 200);
        setTitle("Cambio de Tamaño Texto");
        Lamina lamina = new Lamina();
        lamina.setBackground(Color.LIGHT_GRAY);
        add(lamina);

    }
}
