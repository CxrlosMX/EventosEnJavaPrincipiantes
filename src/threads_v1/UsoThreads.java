/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_v1;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 15-sep-2021
 *
 */
import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JFrame marco = new MarcoRebote();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);

    }

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------
class Pelota {

    // Mueve la pelota invirtiendo posición si choca con límites
    public void mueve_pelota(Rectangle2D limites) {

        x += dx;

        y += dy;

        if (x < limites.getMinX()) {

            x = limites.getMinX();

            dx = -dx;
        }

        if (x + TAMX >= limites.getMaxX()) {

            x = limites.getMaxX() - TAMX;

            dx = -dx;
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();

            dy = -dy;
        }

        if (y + TAMY >= limites.getMaxY()) {

            y = limites.getMaxY() - TAMY;

            dy = -dy;

        }

    }

    //Forma de la pelota en su posición inicial
    public Ellipse2D getShape() {

        return new Ellipse2D.Double(x, y, TAMX, TAMY);

    }

    private static final int TAMX = 15;

    private static final int TAMY = 15;

    private double x = 0;

    private double y = 0;

    private double dx = 1;

    private double dy = 1;

}

// Lámina que dibuja las pelotas----------------------------------------------------------------------
class LaminaPelota extends JPanel {

    //Añadimos pelota a la lámina
    public void add(Pelota b) {

        pelotas.add(b);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Pelota b : pelotas) {

            g2.fill(b.getShape());
        }

    }

    private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
}

//Marco con lámina y botones------------------------------------------------------------------------------
class MarcoRebote extends JFrame {

    public MarcoRebote() {

        setBounds(600, 300, 400, 350);

        setTitle("Rebotes");

        lamina = new LaminaPelota();
        lamina.setBackground(new Color(12, 140, 23));
        add(lamina, BorderLayout.CENTER);

        JPanel laminaBotones = new JPanel();
        bHilo1 = new JButton("Hilo 1");
        bHilo1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                comienza_el_juego(ae);
            }
        });
        bHilo2 = new JButton("Hilo 2");
        bHilo2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                comienza_el_juego(ae);
            }
        });
        bHilo3 = new JButton("Hilo 3");
        bHilo3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                comienza_el_juego(ae);
            }
        });
        bDetener1 = new JButton("Detener 1");
        bDetener1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                detener(ae);
            }
        });
        bDetener2 = new JButton("Detener 2");
        bDetener2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                detener(ae);
            }
        });
        bDetener3 = new JButton("Detener 3");
        bDetener3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                detener(ae);
            }
        });
        laminaBotones.add(bHilo1);
        laminaBotones.add(bHilo2);
        laminaBotones.add(bHilo3);
        laminaBotones.add(bDetener1);
        laminaBotones.add(bDetener2);
        laminaBotones.add(bDetener3);
        add(laminaBotones, BorderLayout.SOUTH);
    }

    //Añade pelota y la bota 1000 veces
    public void comienza_el_juego(ActionEvent e) {

        Pelota pelota = new Pelota();

        lamina.add(pelota);

        Runnable r = new PelotasHilos(pelota, lamina);
        if (e.getSource().equals(bHilo1)) {
            hilo1 = new Thread(r);
            hilo1.start();
        } else if (e.getSource().equals(bHilo2)) {
            hilo2 = new Thread(r);
            hilo2.start();
        } else if (e.getSource().equals(bHilo3)) {
            hilo3 = new Thread(r);
            hilo3.start();
        }

        /*  Thread(Runnable target) :Constructor usado*/
        //System.out.println(Thread.activeCount());
        /*for (int i = 1; i <= 3000; i++) {
         pelota.mueve_pelota(lamina.getBounds());

         lamina.paint(lamina.getGraphics());
            
         try {
         /*
         sleep(long millis)
         Causes the currently executing thread to sleep (temporarily cease execution)
         for the specified number of milliseconds, subject to the precision
         and accuracy of system timers and schedulers.
                
         Thread.sleep(4);
         } catch (InterruptedException ex) {
         ex.printStackTrace();
         }

            

         }*/
    }

    public void detener(ActionEvent e) {
        if (e.getSource().equals(bDetener1)) {
            hilo1.interrupt();
        } else if (e.getSource().equals(bDetener2)) {
            hilo2.interrupt();
        } else if (e.getSource().equals(bDetener3)) {
            hilo3.interrupt();
        }
        // if (hiloPelota.isAlive()) {
        //hilo.interrupt();
        // } else {
        //    JOptionPane.showMessageDialog(lamina, "Hilo Detenido", "Detenido", 2);
        // }
    }

    private LaminaPelota lamina;
    private Thread hilo1, hilo2, hilo3;
    private JButton bHilo1, bHilo2, bHilo3, bDetener1, bDetener2, bDetener3;

}
