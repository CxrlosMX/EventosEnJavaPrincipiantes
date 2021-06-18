/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMenu_I;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 18/06/2021
 *
 */
public class Lamina extends JPanel {

    private JMenu archivo, edicion, herramienta, opcion;
    private JMenuBar barra;
    private JMenuItem guardar, guardarComo, cortar, copiar, pegar, generales, op1, op2;

    public Lamina() {
        //¿Como creo un menu?
        //1.-Crear la Barra con JMenuBar
        barra = new JMenuBar();
        //Componente para hacer un submenu dentro de los elementos 
        opcion = new JMenu("Opcion");
        //2.-Crear las opciones que contendra la barra
        archivo = new JMenu("Archivo");
        edicion = new JMenu("Edición");
        herramienta = new JMenu("Herramientas");
        //Agregar los elementos que colgaran de las opciones principales dentro de la barra
        //Elementos para el elemento principal Archivo
        guardar = new JMenuItem("Guardar");
        guardarComo = new JMenuItem("Guardar Como");
        //Elementos para el componente Edicion
        cortar = new JMenuItem("Cortar");
        copiar = new JMenuItem("Copiar");
        pegar = new JMenuItem("Pegar");
        //Elementos para el subMenu
        op1 = new JMenuItem("Opción 1");
        op2 = new JMenuItem("Opción 2");

        //Elememtos para el componente Herramientas
        generales = new JMenuItem("Generales");
        //Agregar los elementos creados a su correspondiente Componente Principal
        //Agg Archivo
        archivo.add(guardar);
        archivo.add(guardarComo);
        //Agg Edicion
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        //Agregamos un separador para que se diferencien los componentes del menu interno
        edicion.addSeparator();
        edicion.add(opcion);
        //Agregamos nuestro submenu a nuestro componente que deseamos agregarlo
        opcion.add(op1);
        opcion.add(op2);
        //Agg Herramientas
        herramienta.add(generales);

        //3.-Agregamos las opciones a la barra
        barra.add(archivo);
        barra.add(edicion);
        barra.add(herramienta);

        //Agregamos la barra de menu a nuestra barra
        add(barra);
    }
}
