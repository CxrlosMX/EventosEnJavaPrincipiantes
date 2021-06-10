/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton_II;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 9/06/2021
 *
 */
public class Lamina extends JPanel {

    private JPanel lamina1, lamina2;
    private JLabel texto;
    private JRadioButton op1, op2;
    private ButtonGroup grupo;

    public Lamina() {
        //Agregamos el tipo de letra
          Font miletra = new Font("Serif", Font.BOLD, 24);
        //Establecemos el Layout de nuestra Lamina
        setLayout(new BorderLayout());
        //Agregamos unLabel para el texto
        texto = new JLabel("CXRLOS MX");
        texto.setFont(miletra);
        texto.setBackground(Color.WHITE);
        //Creamos nuevas laminas para agregar los 
        lamina1 = new JPanel();
        lamina2 = new JPanel();
        //Instancia del evento
        cambioColor evento=new cambioColor();
        //Agregamos los radiosButton
        op1 = new JRadioButton("ROSA", false);
        op2 = new JRadioButton("AMARILLO", false);
        
        op1.addActionListener(evento);
        op2.addActionListener(evento);
        //Creamos el grupo
        grupo = new ButtonGroup();
        grupo.add(op1);
        grupo.add(op2);
        //Agregamos los componentes a las laminas creadas
        lamina1.add(texto);
        lamina1.setBackground(new Color(112,145,165));
        lamina1.setForeground(Color.WHITE);
        lamina2.add(op1);
        lamina2.add(op2);
        //Agregamos las laminas
        add(lamina1, BorderLayout.CENTER);
        add(lamina2,BorderLayout.SOUTH);
    }

    private class cambioColor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (op1.isSelected()) {
                texto.setForeground(Color.PINK);
            }
            else {
            texto.setForeground(Color.YELLOW);
            }
        }

    }

}
