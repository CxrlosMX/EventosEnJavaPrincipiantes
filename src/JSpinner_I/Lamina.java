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

        control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));//SpinnerNumberModel(int value, int minimum, int maximum, int stepSize)
        //¿Como cambiamos el tamaño de nuestro JSpinner?
        //Metodo: setPreferedSize(Dim); para podemos usar el metodo necesitamos un objeto de tipo Dimension
        //Para eso creamos una variable de tipo Dimension
        Dimension d = new Dimension(200, 20); //Creamos nuestro objeto de tipo dimension
        control.setPreferredSize(d); //Le pasamos nuestro objeto de tipo dimension a nuestro metodo para modificar el tamaño
        add(control);
    }
}
