/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EventosCuadrosTexto;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 28/05/2021
 * 
 */
public class miMarco extends JFrame {
public miMarco(){
setVisible(true);
setSize(500,500);
setLocation(300,100);
setTitle("EVENTOS DE CUADROS DE TEXTO");
Lamina lamina=new Lamina();
lamina.setBackground(Color.DARK_GRAY);
add(lamina);
}
}
