/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBox_I;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/06/2021
 *
 */
public class MarcoCheck extends JFrame {

    public MarcoCheck() {
        setVisible(true);
        setSize(500, 500);
        setLocation(150, 150);
        LaminaCheck lamina=new LaminaCheck();
        lamina.setBackground(Color.BLUE);
        add(lamina);
    }
}
