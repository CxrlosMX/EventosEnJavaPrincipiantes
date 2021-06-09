/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBox_I;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.CheckBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/06/2021
 *
 */
public class LaminaCheck extends JPanel {

    private JPanel lamina1, lamina2;
    private JLabel texto;
    private JCheckBox caja1, caja2;

    public LaminaCheck() {
        setLayout(new BorderLayout());
        Font miletra = new Font("Serif", Font.PLAIN, 24); //Creamos una fuente para nuestro texto
        texto = new JLabel("Hola Mundo");//Inicializamos el texto en el Label que queremos
        texto.setFont(miletra);
        //Agregamos nuestros CheckBox
        caja1 = new JCheckBox("Negrita");
        caja2 = new JCheckBox("Cursiva");
        //Evento
        ManejaCheck evento = new ManejaCheck();
        caja1.addActionListener(evento);
        caja2.addActionListener(evento);
        //Creamos nuestras laminas donde tendremos nuestros componentes
        lamina1 = new JPanel();
        lamina2 = new JPanel();
        //Agregamos a la lamina nuestros componentes
        lamina2.add(caja1);
        lamina2.add(caja2);
        lamina1.add(texto);
        //Le damos una dispocision a nuestra lamina
        add(lamina2, BorderLayout.SOUTH);
        add(lamina1, BorderLayout.CENTER);
    }

    private class ManejaCheck implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo=0;
            if(caja1.isSelected())tipo+=Font.BOLD;
               if(caja2.isSelected())tipo+=Font.ITALIC;
            texto.setFont(new Font("Serif".trim(),tipo,24));
            
            /*
            if (caja1.isSelected()) { //Si la caja esta marcada
                texto.setFont(new Font("Serif", Font.BOLD, 24));
            } else {
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }*/
        }

    }

}
