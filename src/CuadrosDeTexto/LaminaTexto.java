/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadrosDeTexto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 26/05/2021
 *
 */
public class LaminaTexto extends JPanel {
    
    private JPanel lamina2;
    private JTextField texto1;
    private JButton boton;
    private JLabel mensaje, resultado;
    
    public LaminaTexto() {
        setLayout(new BorderLayout());
        lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());
        lamina2.setBackground(new Color(34, 67, 56));
        resultado = new JLabel("",JLabel.CENTER);

        //Agregando nuestro JLabel
        mensaje = new JLabel("Introduce tu Correo:");
        mensaje.setForeground(Color.WHITE);
        lamina2.add(mensaje);
        
        texto1 = new JTextField(30); //Existen diferentes contructores, en este caso solo le pasamos como parametro el tamaño de la columna
        texto1.setBackground(Color.BLACK); //Cambiamos el color del textField
        texto1.setForeground(Color.WHITE); //Cambiamos el color del texto que el usuario escriba en nuestro TextFild
        //  texto1.setText("Hola Mundo");//Metodo para asignar un texto dentro del nuesto TextField
        // System.out.println(texto1.getText().trim()); //Metodo para obtener el texto dentro de nuestro JTextField
        //Con el metodo trim() podemos eliminar los espacios que sean muy exageradors de nuestra cadena
        lamina2.add(texto1);
     
        resultado.setForeground(Color.WHITE);
        add(resultado, BorderLayout.CENTER);
        //Agregando el boton
        boton = new JButton("Verificar");
        boton.setBackground(Color.RED);
        boton.setForeground(Color.WHITE);
        DameTexto evento = new DameTexto();
        boton.addActionListener(evento); //Ponemos a la escucha a nuestro boton
        lamina2.add(boton);
       add(lamina2, BorderLayout.NORTH);    
    }
    
    private class DameTexto implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0, a = 0;
            String email = texto1.getText().trim();
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }
                if (i > 1) {
                    if (email.charAt(i) == '.') {
                        a++;
                    }
                }
            }
            if (correcto == 1 && a == 1) {
                resultado.setText("Correo Valido");
            } else {
                //JOptionPane.showMessageDialog(null, "Correo No Valido", "Error", JOptionPane.ERROR_MESSAGE);
                resultado.setText("Correno No Valido");
            }
            
        }
        
    }
    
}
