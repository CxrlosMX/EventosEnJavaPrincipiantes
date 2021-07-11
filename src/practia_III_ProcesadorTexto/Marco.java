/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practia_III_ProcesadorTexto;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/06/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setVisible(true);
        setSize( 600, 600);
        setLocation(400, 120);
        setTitle("Practica 1");
        Lamina lamina = new Lamina();
        add(lamina);
    }
}
