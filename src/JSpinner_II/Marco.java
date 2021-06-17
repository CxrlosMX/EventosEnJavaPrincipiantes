/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSpinner_II;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/06/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setVisible(true);
        setSize(500, 500);
        setLocation(300, 150);
        Lamina lamina=new Lamina();
        lamina.setBackground(new Color(123,98,76));
        add(lamina);
    }
}
