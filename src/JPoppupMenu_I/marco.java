/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPoppupMenu_I;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 1/07/2021
 *
 */
public class marco extends JFrame {

    public marco() {
        setVisible(true);
        setLocation(400, 150);
        setSize(500, 500);
        setTitle("JPopupMenu");
        Lamina lamina = new Lamina();
        add(lamina);
    }
}
