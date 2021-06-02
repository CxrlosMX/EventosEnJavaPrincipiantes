/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreasDeTexto_I;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 1/06/2021
 *
 */
public class LaminaArea extends JPanel {

    private JScrollPane segundaLamina; //Esto crea laminas con una barra de escrol para subir y bajar dentro de ella
    private JTextArea AreaTexto;
    private JButton boton;

    public LaminaArea() {
        //Creando areas de texto
        AreaTexto = new JTextArea(10, 20);
        AreaTexto.setLineWrap(true); //Con este metodo le decimos a nuestra area de texto que tendra saltos de lineas automaticos

        //Creando Lamina
        segundaLamina = new JScrollPane(AreaTexto); //Lamina de barras
        //Creando boton Boton
        boton = new JButton("Enviar");
        boton.setBackground(Color.RED);
        boton.setForeground(Color.WHITE);

        //Creando instancia de nuestra clase
        EnviarTexto evento = new EnviarTexto();
        //Diciendo que el evento tendra el boton 
        boton.addActionListener(evento);
        //Agregando los componentes en la lamina
        add(segundaLamina);
        add(boton);
    }

    private class EnviarTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String t = AreaTexto.getText();
            System.out.println(t);
        }

    }
}
