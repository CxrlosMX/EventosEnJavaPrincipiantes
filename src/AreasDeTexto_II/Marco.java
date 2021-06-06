/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreasDeTexto_II;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 3/06/2021
 *
 */
public class Marco extends JFrame {

    private JPanel lamina;
    private JButton insertar, saltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaBarras;

    public Marco() {
        setVisible(true);
        setTitle("Areas de Texto");
        setSize(500, 500);
        setLocation(150, 200);
        setLayout(new BorderLayout());
        //Agregamos una lamina a nuestro marco
        lamina = new JPanel();
        lamina.setBackground(Color.LIGHT_GRAY);

        insertar = new JButton("INSERTAR");
        saltoLinea = new JButton("SALTO LINEA");
        insertar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("Hola Bienvenido, te invito a seguirme en GIT HUB");
            }

        });
        saltoLinea.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean salto = !areaTexto.getLineWrap();
                areaTexto.setLineWrap(salto);
                //Operador ternario
                saltoLinea.setText(salto? "QUITAR SALTO": "SALTO LINEA");
              /*  if (salto) {
                    saltoLinea.setText("QUITAR SALTO");
                } else {
                    saltoLinea.setText("SALTO LINEA");
                }*/
            }

        });
       
      
        areaTexto = new JTextArea(8, 20);
        laminaBarras = new JScrollPane(areaTexto);
        laminaBarras.setBackground(Color.BLACK);
        add(laminaBarras,BorderLayout.CENTER);
        lamina.add(insertar);
        lamina.add(saltoLinea);
        add(lamina, BorderLayout.SOUTH);
    }

}
