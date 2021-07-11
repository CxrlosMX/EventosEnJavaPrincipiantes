/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionesAvanzadas_BOX;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 9/07/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
      
        setTitle("Marco en Caja");
        setSize(500, 500);
        setLocation(400, 150);
        
        //------
        //Creando los compoenentes que contendra nuestra primera caja
        JLabel rotulo1 = new JLabel("Nombre");
        JTextField texto1 = new JTextField(10);
        //Vamos a decir que cuando redimencionemos la caja segun aumente la ventana
       texto1.setMaximumSize(texto1.getPreferredSize());
        
        //Creamos nuestra primera caja Horizontal
        Box cajaH1 = Box.createHorizontalBox();
        //Agregamos nuestros componentes a nuestra caja Horizontal
        cajaH1.add(rotulo1);
        
        //Especificamos la distancia entre los componentes
        cajaH1.add(Box.createHorizontalStrut(10));
        //Agregamos el siguiente texto
        cajaH1.add(texto1);

        //---------
        //Agregamos una nueva caja donde iran los demas componente
        JLabel rotulo2 = new JLabel("Contraseña");
        JTextField texto2 = new JTextField(10);

        texto2.setMaximumSize(texto2.getPreferredSize()); //Metodo para que no se mueva o tenga un comportamiento malo cuando redimencionamos
        //Creamis nuestra seunda caja
        Box cajaH2 = Box.createHorizontalBox();//Usamos constantes
        cajaH2.add(rotulo2);//Agregamos el componente
        cajaH2.add(Box.createHorizontalStrut(10));//Creamos un espacio entre 
        cajaH2.add(texto2);

        //------
        //Creamos la tercera caja
        JButton boton1 = new JButton("OK");
        JButton boton2 = new JButton("CANCELAR");
        //Creamos una tercera caja
        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(boton1);//Agregamos el primer boton a la caja
        cajaH3.add(Box.createGlue());//Especificamos para que se adapte la distancia cuando redimensionamos la ventana
        cajaH3.add(boton2); //Agregamos el segundo boton a nuestra caja

        //-----
        //Caja vertical donde iran las cajas Horizontales con su repectivos componentes
        Box cajaH4 = Box.createVerticalBox();
        //Agregamos las cajas Horizontales a la caja padre 
        cajaH4.add(cajaH1);
        cajaH4.add(cajaH2);
        cajaH4.add(cajaH3);

        add(cajaH4,BorderLayout.CENTER); //Agregamos la caja padre a la lamina
    }

}
