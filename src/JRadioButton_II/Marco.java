/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton_II;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 9/06/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setTitle("JRADIOBUTTON");
        setVisible(true);
        setLocation(500, 200);
        setSize(500, 500);
        Lamina lamina = new Lamina();
        lamina.setBackground(new Color(12,45,65));
        add(lamina);

    }

}
