/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSlider_I;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/06/2021
 *
 */
public class Lamina extends JPanel {
    
    private JSlider control;
    
    public Lamina() {
        //Instanciamos nuestro SLider, podemos instanciarlo haciendo uso de sus diferentes constructores
        control = new JSlider(0, 100, 25); //SwingConstants.VERTICAL
        //Con la constante SwingContants podemos modiifcar la horientacionde nuestro JSlider
        // control.setOrientation(SwingConstants.VERTICAL);
        //Para que se vean las marcas o valores que tiene nuestro Slider
        control.setMajorTickSpacing(25);
        //Para especificar cual sera el rango menor que se mostrara en nuestro JSlider
        control.setMinorTickSpacing(5);
        //Por ultimo necesitamos imprimir eso valoress
        control.setPaintTicks(true);
        //Una vez imprimidas las marcas le decimos que debajo de las marcas nos imprima los valores
        control.setPaintLabels(true);
        //Metodo para cambiar el tipo de letras
        control.setFont(new Font("Serif",Font.ITALIC,10));
        
        //Metodo para que la barra solo se pueda colocar en las marcas que tiene disponible
        control.setSnapToTicks(true);
        //Agregamos nuestro componente a nuestra lamina
        add(control);
        
    }
}
