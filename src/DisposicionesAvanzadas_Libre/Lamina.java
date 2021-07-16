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
 * @Date: 15/07/2021
 *
 */
public class Lamina extends JPanel {

    private JTextField caja1, caja2;
    private JLabel nombre, apellido;

    public Lamina() {
        //Primero debemos especificar que la disposicion que usaremos en la ventana sera libre
        setLayout(new EnColumnas());//Le indicamos que use nuestra propio layout

        //Inicializamos o creamos nuestros componentes Swing
        //Creamos nuestros objetos Label
        nombre = new JLabel("Nombre");
        apellido = new JLabel("Apellido");

        //Creamos nuestras cajas
        caja1 = new JTextField();
        caja2 = new JTextField();
        
        
        //Siempre antes de usar nuestros componentes en una disposicion libre debemos pasarle la ubicacion donde los queremos dentro de la lamina
      //  nombre.setBounds(50,20, 80,10);
       // apellido.setBounds(50,40, 80,30);
        //Le asignamos un tamaño y Ubicacion a nuestras cajas
       // caja1.setBounds(100, 17, 100,20);
        // caja2.setBounds(100, 47, 100,20);
        
        //¿Como creo mi propio Layout?
        //Interfaz:LayoutManager
        
        
        
        //Agregamos nuestros componentes a la lamina
        add(nombre);
       
        add(caja1);
         add(apellido);
        add(caja2);
    }

}

