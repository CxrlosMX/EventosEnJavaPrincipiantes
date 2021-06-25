/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practia_I_ProcesadorTexto;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/06/2021
 *
 */
public class Lamina extends JPanel {

    /*private JMenuItem arial, curiel, verdana;
     private JMenuItem negrita, cursiva;
     private JMenuItem chico, mediano, grande, gigante;*/
    private JMenu estilo, fuente, size;
    private Font letras;
    private JPanel segundaLamina;
    private JTextPane areaTexto;

    public Lamina() {
        setLayout(new BorderLayout());
        segundaLamina = new JPanel();
        JMenuBar mibarra = new JMenuBar();
        //------------------------------------------  
        estilo = new JMenu("Estilo");
        size = new JMenu("Tamaño");
        fuente = new JMenu("Fuente");
        //------------------------------------------  
        areaTexto = new JTextPane();
        //------------------------------------------
        configuraMenu("Aero", "fuente", "Aero", 9, 10);
        configuraMenu("Serif", "fuente", "Serif", 9, 10);
        configuraMenu("Agency FB", "fuente", "Agency FB", 9, 10);
        //------------------------------------------
        configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
        configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);
        //------------------------------------------
        configuraMenu("12", "tamaño", "", 9, 12);
        configuraMenu("16", "tamaño", "", 9, 16);
        configuraMenu("20", "tamaño", "", 9, 20);
        configuraMenu("24", "tamaño", "", 9, 24);
        //------------------------------------------
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(size);
        segundaLamina.add(mibarra);
        add(segundaLamina, BorderLayout.NORTH);
        add(areaTexto, BorderLayout.CENTER);
    }

    public void configuraMenu(String rotulo, String menu, String tipo_letra, int estilo, int tam) {

        JMenuItem ele_menu = new JMenuItem(rotulo);
        if (menu.equalsIgnoreCase("fuente")) {
            this.fuente.add(ele_menu);
        } else if (menu.equalsIgnoreCase("estilo")) {
            this.estilo.add(ele_menu);

        } else {
            this.size.add(ele_menu);
        }
        ele_menu.addActionListener(new eventoTexto(rotulo, tipo_letra, estilo, tam));

    }

    //Clase que gestionara los eventos
    private class eventoTexto implements ActionListener {

        private String tipo_texto, menu;
        private int estilo_letra, tamagno;

        public eventoTexto(String menu, String tipo_texto, int estilo_letra, int tamagno) {
            this.tipo_texto = tipo_texto;
            this.estilo_letra = estilo_letra;
            this.tamagno = tamagno;
            this.menu = menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            areaTexto.setFont(new Font(tipo_texto, estilo_letra, tamagno));
        }

    }

}
