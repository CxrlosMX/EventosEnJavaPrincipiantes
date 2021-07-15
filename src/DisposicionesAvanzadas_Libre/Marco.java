/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionesAvanzadas_Libre;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/07/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setVisible(true);
        setSize(500,500);
        setLocation(400,150);
        setTitle("Disposiciones Avanzadas Libres");
        Lamina lamina=new Lamina();
        //lamina.setBackground(new Color(23,56, 78));
        add(lamina);
    }
}
