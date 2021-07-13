/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionesAvanzadas_Muelle;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/07/2021
 *
 */
public class Lamina extends JPanel {

    private JButton boton1, boton2, boton3;

    public Lamina() {
        //Primero crear nuestros dos primeros Botones
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");

        //Agregaremos un tipo de Disposicion, la cual sera de MUelle, creamos la instancia
        SpringLayout miLayout = new SpringLayout();
        setLayout(miLayout);

        //Construimos el muelle con el siguiente Metodo:  	constant(int min, int pref, int max)
        //Debido a que el metodo es Static debemos escribir el nombre de la clase
        Spring muelle = Spring.constant(0, 10, 100);

        //¿Como agrego el muelle a nuestros componentes?
        // 	putConstraint(String e1, Component c1, int pad, String e2, Component c2)
        //miLayout.putConstraint(Donde comienza el muelle,componentes que le asiganremos el muelle,nombre de la instancia de nuestro muelle,hacia donde ira el muelle,en donde se encuentra el componente);
        //El inicio y final se maneja con cordenadas Norte-Sur-Este-Oeste
        miLayout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
        miLayout.putConstraint(SpringLayout.WEST, boton2, muelle, SpringLayout.EAST, boton1);
        miLayout.putConstraint(SpringLayout.WEST, boton3, muelle, SpringLayout.EAST, boton2);
        miLayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);

        //Agregamos nuestros botones a la lamina
        //Cuando no especificamos la disposicion de nuestra lamina usa una por defecto que es la de FLow Layout
        add(boton1);
        add(boton2);
        add(boton3);

    }
}
