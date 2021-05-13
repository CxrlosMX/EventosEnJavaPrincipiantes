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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author El Camaleon
 */
public class Lamina extends JPanel {

    JButton inicio = new JButton("INICIAR SESIÓN");

    public Lamina() {
        setLayout(null);
        add(inicio);
        inicio.setBounds(170, 280, 150, 25);
        inicio.setForeground(Color.BLACK);
        inicio.setBackground(new Color(51,153,255));
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

            System.out.println("Has perdido el foco");
        }
    }

}
