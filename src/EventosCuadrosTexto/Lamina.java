/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosCuadrosTexto;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 28/05/2021
 *
 */
public class Lamina extends JPanel {

    private JTextField texto;

    public Lamina() {
        texto = new JTextField(20);
        Document evento=texto.getDocument();//Almacenamos dentro dentro de nuestro documento 
        
        evento.addDocumentListener(new EscuchaTexto());
        add(texto);
    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            //Realizaremos una pequeña accion que al escrbir dentro del campo nos mande un mensaje en consola
            System.out.println("Has escrito texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) { //Este evento se llama cuando el texto de nuestro cuadro de texto cambiar de, tipo etc
        }

    }
}
