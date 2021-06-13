/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JComboBox_I;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 11/06/2021
 * 
 */
public class Marco extends JFrame{
    public Marco(){
    setVisible(true);
    setLocation(300,200);
    setSize(500,500);
    setTitle("JComboBox");
    Lamina lamina=new Lamina();
    add(lamina);
    }

}
