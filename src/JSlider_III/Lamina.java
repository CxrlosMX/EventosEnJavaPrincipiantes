/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSlider_III;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 15/06/2021
 *
 */
public class Lamina extends JPanel {

    private JLabel texto;
    private JSlider control;
    private JPanel lamina2;

    public Lamina() {
        setLayout(new BorderLayout());
        //Inicializamos nuestro texto
        texto = new JLabel("CxrlosMX");
        texto.setFont(new Font("Serif", Font.ITALIC, 25));
        //agregamos nuestro texto a la lamina
        add(texto, BorderLayout.CENTER);
        //Instanciamos nuestra segunda lamina
        lamina2 = new JPanel();
        //Creamos nuestro componentes control
        control = new JSlider(5, 105, 25); //Utilizamos un contructor (menor,amximo,inicioComponente)
        control.setMajorTickSpacing(20); //Metodo para las marcas mayores
        control.setMinorTickSpacing(5);//Metodo para las marcas menores
        control.setPaintLabels(true);//Para que pinte  los rotulos
        control.setPaintTicks(true); //Para que pinte las marcas
        control.setFont(new Font("Serif", Font.ITALIC, 15));
        //Creamos la instancia del evento 
        // EventoTexto evento = new EventoTexto();
        control.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent ce) {
                texto.setFont(new Font("Serif", Font.ITALIC, control.getValue()));
            }
        });
        //Agregamos nuestro componente a nuestra segunda lamina
        lamina2.add(control);

        //Agregamos nuestra lamina segunda a la lamina principal
        add(lamina2, BorderLayout.NORTH);

    }

    //Creamos nuestra clase que gestionara nuestro evento
   /* private class EventoTexto implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent ce) {
            texto.setFont(new Font("Serif", Font.ITALIC, control.getValue()));
            // System.out.println("HOLA ESTAS USANDO EL SLIDER");
        }

    }*/
}
