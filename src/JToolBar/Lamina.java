/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JToolBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 6/07/2021
 *
 */
public class Lamina extends JPanel {

    private JPanel lamina2;

    public Lamina() {
        setLayout(new BorderLayout());
        AccionColor accionAmarillo = new AccionColor("AMARILLO", Color.YELLOW);
        AccionColor accionAzul = new AccionColor("AZUL", Color.BLUE);
        AccionColor accionRojo = new AccionColor("ROJO", Color.RED);

        Action accionSalir = new AbstractAction("Salir", null) {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0); //Cierra la ventana
            }
        };
        //Agregamos la segunda lamina
        lamina2 = new JPanel();
        //Creamos un menu
        JMenu menu = new JMenu("Color");
        //Agregamos nuestras acciones a nuestro menu
        menu.add(accionRojo);
        menu.add(accionAmarillo);
        menu.add(accionAzul);

        //Creamos una barra de Menu
        JMenuBar barra = new JMenuBar();
        barra.add(menu);
        lamina2.add(barra);

        //Contruccion de la barra de Herramientas
        JToolBar barraHerramientas = new JToolBar();

        barraHerramientas.add(accionRojo);
        barraHerramientas.add(accionAmarillo);
        barraHerramientas.add(accionAzul);
        //Agregamos un separador
        barraHerramientas.addSeparator(); //Para agregar un separador y puedas distingir
        barraHerramientas.add(accionSalir);
        //Si no queremos que nuestra barra se mueva le asignamos 
        barraHerramientas.setFloatable(true);

        //Agregamos la barra de herramientas a la segunda lamina
        //Le damos un Layout en Nort para poder moverla
        lamina2.add(barraHerramientas, BorderLayout.NORTH);
        
        //Hubicamos la barra

        add(lamina2, BorderLayout.NORTH);

    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Color colorBoton) {
            putValue(Action.NAME, nombre); //Para almacenar el nombre
            // putValue(Action.SMALL_ICON, icono);//Para almacenar el Icono del botton
            putValue(Action.SHORT_DESCRIPTION, "Pone la lamina de color " + nombre); //Con este metodo al poner el mouser sobre el boton te da una descrpcion de lo que hace
            putValue("Color de Fondo", colorBoton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = (Color) getValue("Color de Fondo");
            setBackground(color);
            System.out.println("Boton pulsado " + getValue(Action.NAME) + "\nDescripcion " + getValue(Action.SHORT_DESCRIPTION));
        }

    }
}
