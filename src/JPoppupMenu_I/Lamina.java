/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPoppupMenu_I;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 1/07/2021
 *
 */
public class Lamina extends JPanel {

    private JButton boton;

    public Lamina() {
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        JMenuBar barra = new JMenuBar();

        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu size = new JMenu("Tamaño");

        barra.add(fuente);
        barra.add(estilo);
        barra.add(size);
        lamina2.add(barra);
        
        JTextArea texto=new JTextArea();
        
        //Creamos un menu para asignarle un menu emergente
        // boton =new JButton("Prueba");
        //Construimos nuetro menu emergente
       // -----------------------------
        JPopupMenu emergente = new JPopupMenu();
        //¿Como le agrego menus a mi ventana emergente?--Con JMenuItem
        JMenuItem op1 = new JMenuItem("Opcion 1");
        JMenuItem op2 = new JMenuItem("Opcion 1");
        emergente.add(op1);
        emergente.add(op2);
        //¿Como asigno donde quiero que actue mi menu? --setComponentPopupMenu(componente c);
        texto.setComponentPopupMenu(emergente); //Le asignamos el menu a nuestro texto

       //Si queremos agregarle el menu emergente para un componente se realiza lo siguiente
        //componente.(metodo);
        // boton.setComponentPopupMenu(emergente);
       // add(boton);
        add(emergente);
        add(lamina2, BorderLayout.NORTH);
        add(texto,BorderLayout.CENTER);
    }
}
