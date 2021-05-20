/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesEventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/05/2021
 *
 */
public class Lamina extends JPanel {
    
    public Lamina() {
        AccionColor accionAmarillo = new AccionColor("AMARILLO", Color.YELLOW);
        AccionColor accionAzul = new AccionColor("AZUL", Color.BLUE);
        AccionColor accionRojo = new AccionColor("ROJO", Color.RED);

        //JButton amarillo = new JButton(accionAmarrilo);
        // JButton rojo = new JButton(accionRojo);
        // JButton azul = new JButton(accionAzul);
        add(new JButton(accionAmarillo)); //Con esta linea de codigo agregamos un boton a la lamina y simplificamos mas el codigo
        add(new JButton(accionRojo));
        add(new JButton(accionAzul));

        //Creando nuestro mapa entrada
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        //Creando nuestra convinacion de teclas
        //KeyStroke comando1 = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke comando2 = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke comando3 = KeyStroke.getKeyStroke("ctrl R");

        //Asignando combinacion de teclas a un objeto 
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
        mapaEntrada.put(comando2, "fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("shift A"), "fondo_amarillo");
        mapaEntrada.put(comando3, "fondo_rojo");
        //Asignando el objeto a la accion
        ActionMap color1 = getActionMap();
        color1.put("fondo_amarillo", accionAmarillo);
        color1.put("fondo_azul", accionAzul);
        color1.put("fondo_rojo", accionRojo);
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
