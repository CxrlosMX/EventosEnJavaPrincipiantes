/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practia_I_ProcesadorTexto;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/06/2021
 *
 */
public class Lamina extends JPanel {

    private JMenuItem arial, curiel, verdana;
    private JMenuItem negrita, cursiva;
    private JMenuItem chico, mediano, grande, gigante;
    private JPanel segundaLamina;
    private JTextPane areaTexto;

    public Lamina() {
        setLayout(new BorderLayout());
        segundaLamina = new JPanel();
        JMenuBar mibarra = new JMenuBar();
        //------------------------------------------  
        JMenu estilo = new JMenu("Estilo");
        JMenu size = new JMenu("Tamaño");
        JMenu fuente = new JMenu("fuente");
        //------------------------------------------  
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(size);
        //------------------------------------------  
        arial = new JMenuItem("Arial");
        curiel = new JMenuItem("Aero");
        verdana = new JMenuItem("Verdana");
        curiel.addActionListener(new ActionListener() { //Clase interna anonima
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setFont(new Font("Aero", Font.PLAIN, 12));
            }
        });
        arial.addActionListener(new ActionListener() { //Clase interna anonima
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setFont(new Font("Arial", Font.PLAIN, 12));
            }
        });
        verdana.addActionListener(new ActionListener() { //Clase interna anonima
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setFont(new Font("Verdana", Font.PLAIN, 12));
            }
        });
        fuente.add(arial);
        fuente.add(curiel);
        fuente.add(verdana);
        //------------------------------------------  
        negrita = new JMenuItem("Negrita");
        cursiva = new JMenuItem("Cursiva");
        estilo.add(negrita);
        estilo.add(cursiva);
        //------------------------------------------  
        chico = new JMenuItem("12");
        mediano = new JMenuItem("28");
        grande = new JMenuItem("25");
        gigante = new JMenuItem("35");
        size.add(chico);
        size.add(mediano);
        size.add(grande);
        size.add(gigante);
        //------------------------------------------  

        segundaLamina.add(mibarra);
        add(segundaLamina, BorderLayout.NORTH);
        //------------------------------------------  
        areaTexto = new JTextPane();
        add(areaTexto, BorderLayout.CENTER);
    }

    /*private class eventoTexto implements ActionListener {

     @Override
     public void actionPerformed(ActionEvent e) {
     areaTexto.setFont(new Font("Aero", Font.PLAIN, 12));

     }
     }*/
}
