/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventoFocoIntroduccion;

import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class Uso_ventanasFocos extends JFrame implements WindowFocusListener {

    public static void main(String args[]) {
        Uso_ventanasFocos ventana=new Uso_ventanasFocos();
        ventana.iniciar();
    }

    public void iniciar() {
        v1 = new Uso_ventanasFocos();
        v2 = new Uso_ventanasFocos();
        v1.setVisible(true);
        v2.setVisible(true);
        v1.setBounds(300, 100, 600, 350);
        v2.setBounds(1200, 100, 600, 350);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.addWindowFocusListener(this);
        v2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent we) {
        if(we.getSource()==v1){
        v1.setTitle("Tengo el foco");
        }
        else {
        v2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
            if(we.getSource()==v1){
        v1.setTitle(":(");
        }
        else {
        v2.setTitle(":(");
        }
    }
    Uso_ventanasFocos v1;
    Uso_ventanasFocos v2;

}
