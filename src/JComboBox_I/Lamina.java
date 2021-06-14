/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JComboBox_I;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 11/06/2021
 *
 */
public class Lamina extends JPanel {

    private JLabel texto;
    private JComboBox combo;
    private JPanel lamina2;

    public Lamina() {
        //Creamos nuestro tipo de Layout que tendra nuestra lamina
        setLayout(new BorderLayout());
        //Inicializamos nuestros JLabel
        texto = new JLabel("Hola Mundo");
        //Le damos un tipo de letra a nuestro Texto
        texto.setFont(new Font("Serif", Font.PLAIN, 45));
        //Agregamos nuestro texto a la lamina en el centro
        add(texto, BorderLayout.CENTER);
        //Agregamos la lamina
        lamina2 = new JPanel();
        //Inicalizamos nuestro JComboBox
        combo = new JComboBox();
        //Metodo si queremos que el texto sea editable en la lamina
        combo.setEditable(true);
        //Agregmos los componentes que contendra
        //Hacemos la lista de Items que contendra nuestro combo BOX
        combo.addItem("Serif");
        combo.addItem("SansSerif");
        combo.addItem("MonoSpace");
        combo.addItem("Arial");
        //Creamos nuestro evento
        cambioTexto evento=new cambioTexto();
        combo.addActionListener(evento);
        //Agregmos a la lamina2 el combo 
        lamina2.add(combo);
        //Agregamos nuestra lamina2 a nuestra lamina principal, con un Borderlayout 
        add(lamina2, BorderLayout.NORTH);
    }

    private class cambioTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          texto.setFont(new Font(combo.getSelectedItem()+"".trim(),Font.PLAIN,45));
          //texto.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,45));
        }

    }
}
