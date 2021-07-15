/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionesAvanzadas_Libre;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/07/2021
 *
 */
public class Lamina extends JPanel {

    private JButton boton1, boton2;

    public Lamina() {
        //Como le informo a mi lamina que trabajare con un Layout Libre
        setLayout(null); //Estamos especificando que nuestra lamina tendra un alyout libre

        /* //Instanciamos nuestros componentes
         boton1 = new JButton("Boton 1");
         boton2 = new JButton("Boton 2");

         //Asiganmos la posicion de nuestro componente
         //Le asignamos una ubicacion y un tamaño 
         boton1.setBounds(300, 200, 120, 25);
         boton2.setBounds(200, 100, 120, 25);
         //*Dato: Para asignar la ubicacion el metodo setLocation* no funciona

         //Agregamos nuestro componente a nuestra lamina
         add(boton1);
         add(boton2);*/
        //-------------Ejemplo Formulario
        //Creamos los objetos que usaremos
        JLabel nombre = new JLabel("Nombre: ");
        JLabel apellido = new JLabel("Apellido: ");

        JTextField cuadro1 = new JTextField();
        JTextField cuadro2 = new JTextField();

        /*Nota: Siempre que usamos una disposicion libre debemos antes de agregar los componentes a la lamina debemos especificar 
         donde se ubicaran y su tamaño*/
        nombre.setBounds(20, 20, 80, 10);
        cuadro1.setBounds(100, 18, 100, 20);
        apellido.setBounds(20, 50, 80, 15);
        cuadro2.setBounds(100, 50, 100, 20);

        //Agreamos los componentes a la lamina
        add(nombre);
        add(cuadro1);
        add(apellido);
        add(cuadro2);

    }
}
