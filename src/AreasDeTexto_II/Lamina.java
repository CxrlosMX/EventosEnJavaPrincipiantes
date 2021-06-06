/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreasDeTexto_II;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 3/06/2021
 *
 */
public class Lamina extends JPanel {

    private JButton boton1;
    private JButton boton2;

    public Lamina() {
        boton1 = new JButton("INSERTAR");
        boton2 = new JButton("SALTO LINEA");
        AccionTexto evento=new AccionTexto();
        boton1.addActionListener(evento);
        add(boton1);
        add(boton2);
    }

    private class AccionTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }

    }
}
