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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

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
    private JTextField usuario;
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
        usuario = new JTextField(20);
        //Cuadro de tipo contraseña
        password = new JPasswordField(20); //Con este componente de Swing se suele usar para almacenar las contraseñas del usuario
        CompruebaPass miEvento=new CompruebaPass();
        password.getDocument().addDocumentListener(miEvento);
        lamina_superior.add(text1);
        lamina_superior.add(usuario);
        lamina_superior.add(text2);
        lamina_superior.add(password);
        boton = new JButton("Enviar");
        boton.setBackground(Color.RED);
        boton.setForeground(Color.WHITE);
        add(boton, BorderLayout.SOUTH); //Agregamos nuestro boton en la parte baja de nuestra interfaz
        
    }

    private class CompruebaPass implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] texto = password.getPassword();
            if (texto.length <8 || texto.length > 12) {
                password.setBackground(Color.RED);
            }
            else {
            password.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
           char[] texto = password.getPassword();  
           if (texto.length <8 || texto.length > 12) {
                password.setBackground(Color.RED);
            }
            else {
            password.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }

    }

}
