/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadrosDeTexto.I;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 27/05/2021
 *
 */
public class LaminaPassWord extends JPanel {

    private JButton boton;
    private JPanel lamina_superior;
    private JLabel text1, text2;
    private JTextField campo1;
    private JPasswordField password; //Este componentes es similar a nuestro TextField con la diferencia que este 
    //Compontente se suele usar para el registro de contraseñas y a si manejar una mejor seguridad

    public LaminaPassWord() {
        setLayout(new BorderLayout());
        lamina_superior = new JPanel();
        lamina_superior.setLayout(new GridLayout(2, 2));
        lamina_superior.setBackground(new Color(0, 0, 0));

        add(lamina_superior, BorderLayout.NORTH);
        //Agregamos las etiquetas de texto
        text1 = new JLabel("Usuario: ");
        text1.setForeground(Color.WHITE);
        text2 = new JLabel("Contraseña: ");
        text2.setForeground(Color.WHITE);
        campo1 = new JTextField(20);

        password = new JPasswordField(20);
        lamina_superior.add(text1);
        lamina_superior.add(campo1);
        lamina_superior.add(text2);
        lamina_superior.add(password);
        boton = new JButton("Enviar");
        boton.setBackground(new Color(145, 200, 100));
        add(boton, BorderLayout.SOUTH);
    }
    
 
}
