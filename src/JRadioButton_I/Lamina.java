/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton_I;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 9/06/2021
 *
 */
public class Lamina extends JPanel {

    //Creamos nuestros JRadiosButton
    private JRadioButton op1, op2, op3, op4, op5;
    //Creamos nuestro grupo de buttons
    private ButtonGroup grupo, grupo2;

    public Lamina() {
        //Instanciamos el grupo de RadioButton
        grupo = new ButtonGroup(); //Para que funcionen para elegir una opcion tenemos que agregar los componentes a un grupo
        grupo2 = new ButtonGroup();
        //Instanciamos nuestros JRadioButton
        op1 = new JRadioButton("Verde", false);
        op2 = new JRadioButton("Rojo", true);
        op3 = new JRadioButton("Azul", false);
        op4 = new JRadioButton("MASCULINO", false);
        op5 = new JRadioButton("FEMENINO", false);
        //Decirle a nuestro programa que estos 3 botones pertenecen al grupo
        grupo.add(op1);//Lo agregamos al grupo
        grupo.add(op2);
        grupo.add(op3);
        grupo2.add(op4);//Lo agregamos al grupo
        grupo2.add(op5);

        //El grupo no se puede agregar a la lamina tenemos que agregar los componentes
        add(op1);
        add(op2);
        add(op3);
        add(op4);
        add(op5);
    }
}
