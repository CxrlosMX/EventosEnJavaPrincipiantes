/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionesAvanzadas_Muelle;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/07/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setVisible(true);
        setTitle("Disposicion MUELLE");
        setSize(500, 500);
        setLocation(400, 150);
        Lamina lamina=new Lamina();
                
                add(lamina);
    }
}
