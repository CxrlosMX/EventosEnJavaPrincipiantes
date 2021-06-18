/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSpinner_I;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/06/2021
 *
 */
public class Lamina extends JPanel {

    private JSpinner control;
    //Con esta instruccion obtenemos el nombre de nuestras fuentes que tenemos en nuestro sistema
    //Creamos este arreglo para que se pueda elegir dentro de una opcion dentro de nuestro componente Spinner
    private String[] arreglo = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    public Lamina() {
        // control = new JSpinner(new SpinnerListModel(arreglo)); //Inicializamos nuestra instancia de JSpinner, dentro de ella podemos pasarle como parametro una clase, dependiendo del valor que queremos que nos muestre

        //control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));//SpinnerNumberModel(int value, int minimum, int maximum, int stepSize)
        //¿Como cambiamos el tamaño de nuestro JSpinner?
        //Metodo: setPreferedSize(Dim); para podemos usar el metodo necesitamos un objeto de tipo Dimension
        //Para eso creamos una variable de tipo Dimension
        //Dimension d = new Dimension(200, 20); //Creamos nuestro objeto de tipo dimension
        //control.setPreferredSize(d); //Le pasamos nuestro objeto de tipo dimension a nuestro metodo para modificar el tamaño
        //Usamos la clase que hemos creado, para hacer uso de las modificaciones que hicimos a nuestro modelo
        // MimodeloSpinner modeloCreado = new MimodeloSpinner(); //hacemos una instancia del modelo que hemos modificado
        //control = new JSpinner(new MimodeloSpinner()); //Instanciamos directamente o podemos usar la instancia creada arriba
        /*
         Clase Interna Anonima
         */
        control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
            //Clase interna Anonima
            @Override
            public Object getNextValue() { //Aqui llamamos el metodo que al pusar la flecha hacia arriba nos de el valor siguiente, entonces al modificarlo, le retornamos el metodo 
                //que al llamarlo nos de  el valor anterior
                return super.getPreviousValue();
            }

            @Override
            public Object getPreviousValue() {//En este metodo es lo contrario al pulsar la flecha hacia abajo nos daria el valor anterior, pero si lo modificamos 
                //y le decimos que nos devuelva el valor que sigue por que llamamos el metodo NextValue();
                return super.getNextValue(); //To change body of generated methods, choose Tools | Templates.
            }

        }); //Si vemos bien los parentesis vemos que el parentesis cierra afuera de la llama, eso quiere decir que tenemos nuestra clase interna Anonima
        Dimension d = new Dimension(200, 20); //Creamos nuestro objeto de tipo dimension
        control.setPreferredSize(d); //
        add(control);
    }

    //Como creo mi propio modelo para que reciba los parametros que yo quiera y tenga un comportamiento diferente las tablas
    /*private class MimodeloSpinner extends SpinnerNumberModel { //Heredamos de nuestra clase SpinnerNumberModel

     public MimodeloSpinner() {
     super(5, 0, 10, 1); //Llamamos el contructor de la clase padre
     //Metodo para cambiar las flechas, anterior getPreviousValue()
     //Metodo para ver el numero que sigue:  	getNextValue()

     }
     //Con estos metodos de la clase padre los modificamos para que las flechas actuen de una forma diferente

     @Override
     public Object getNextValue() { //Aqui llamamos el metodo que al pusar la flecha hacia arriba nos de el valor siguiente, entonces al modificarlo, le retornamos el metodo 
     //que al llamarlo nos de  el valor anterior
     return super.getPreviousValue();
     }

     @Override
     public Object getPreviousValue() {//En este metodo es lo contrario al pulsar la flecha hacia abajo nos daria el valor anterior, pero si lo modificamos 
     //y le decimos que nos devuelva el valor que sigue por que llamamos el metodo NextValue();
     return super.getNextValue(); //To change body of generated methods, choose Tools | Templates.
     }

     }*/
}
