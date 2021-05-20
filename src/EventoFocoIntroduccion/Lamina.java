/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open t0he template in the editor.
 */
package EventoFocoIntroduccion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author El Camaleon
 */
public class Lamina extends JPanel {

    //JButton inicio = new JButton("INICIAR SESIÓN");
    public Lamina() {
        AccionColor boton = new AccionColor("INICIAR SESIÓN",Color.red);
        setLayout(null);
        JButton inicio = new JButton(boton);
        add(inicio);
        inicio.setBounds(170, 280, 150, 25);
        inicio.setForeground(Color.BLACK);
        inicio.setBackground(new Color(51, 153, 255));
        
        //Creamos nuestro mapa de entrada
        InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        //Creamos nuestra convinacion
        KeyStroke c=KeyStroke.getKeyStroke("ctrl A");
        //Asignamos la combinacion de teclas al objeto
        mapaEntrada.put(c, "fondo_rojo");
        //Asignando la accion al objeto
        ActionMap ac=getActionMap();
        ac.put("fondo_rojo", boton);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File miImagen = new File("src/chueck.png"); //Creamos un objeto de tipo File el cual dentro de el tenemos que especificar la 
        try {
            //ruta de nuestra imagen
            //imagen=ImageIO.read(new File("Ruta"));
            imagen = ImageIO.read(miImagen);
        } catch (IOException ex) {
            System.out.println("La imagen no ha podido encontrarse " + ex.getMessage());
        }
        g.drawImage(imagen, 180, 50, null);

        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        //Agregaremos un tamaño y posicion a nuestros cuadros de texto
        cuadro1.setBounds(170, 200, 150, 20);
        cuadro2.setBounds(170, 230, 150, 20);
        cuadro1.setBackground(Color.LIGHT_GRAY);
        cuadro2.setBackground(Color.LIGHT_GRAY);
        add(cuadro1);
        add(cuadro2);

        LanzaFoco foco = new LanzaFoco();
        cuadro1.addFocusListener(foco);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Arial", Font.ITALIC, 50));
        g2.setColor(new Color(80, 30, 40).brighter());
        g2.drawString("CxlosMX", 70, 150);

    }
    //Para crear dos cuadros de texto dentro de nuestra ventana
    JTextField cuadro1;
    JTextField cuadro2;
    private Image imagen;

    private class LanzaFoco implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Has ganado el foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText(); //Con este metodo nos permite capturar el texto
            boolean encontrado = false;
            for (int i = 0; i < email.length() && !encontrado; i++) {

                if (email.charAt(i) == '@') {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Correo no valido", "Correo NO valido", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Color colorRojo) {
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Pulsa para iniciar sesión");
            putValue("Color de Fondo", colorRojo);
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
           
            setBackground(Color.red);
            //tln("Boton pulsado "+getValue(Action.NAME));
        }

    }

}
