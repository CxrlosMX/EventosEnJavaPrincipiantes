/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadrosDeDialogo_I;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 19/07/2021
 *
 */
public class miMarco extends JFrame {

    public miMarco() {
        setVisible(true);
        setBounds(400, 150, 500, 500);
        setTitle("JOptionPane");
        Lamina lamina=new Lamina();
        add(lamina);
    }
}
