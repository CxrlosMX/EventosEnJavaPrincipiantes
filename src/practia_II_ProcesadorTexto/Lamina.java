/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practia_II_ProcesadorTexto;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

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
    private JPanel terceraLamina;
    private JTextPane areaTexto;
    private JLabel texto;
    private ButtonGroup grupo;

    public Lamina() {
        setLayout(new BorderLayout());
        segundaLamina = new JPanel();
        texto = new JLabel();
        terceraLamina = new JPanel();
        terceraLamina.add(texto);
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
        /*configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
         configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);*/
        JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/copiar.gif"));
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/copiar.gif"));
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        estilo.add(negrita);
        estilo.add(cursiva);
        //------------------------------------------
       /* configuraMenu("12", "tamaño", "", 9, 12);
         configuraMenu("16", "tamaño", "", 9, 16);
         configuraMenu("20", "tamaño", "", 9, 20);
         configuraMenu("24", "tamaño", "", 9, 24);*/
        grupo = new ButtonGroup();
        agregarRadioButton("12", 12);
        agregarRadioButton("16", 16);
        agregarRadioButton("20", 20);
        agregarRadioButton("24", 24);
        /* JRadioButtonMenuItem a = new JRadioButtonMenuItem("12");
         JRadioButtonMenuItem b = new JRadioButtonMenuItem("16");
         JRadioButtonMenuItem c = new JRadioButtonMenuItem("20");
         JRadioButtonMenuItem d = new JRadioButtonMenuItem("24");
         grupo.add(a);
         grupo.add(b);
         grupo.add(c);
         grupo.add(d);
         a.addActionListener(new StyledEditorKit.FontSizeAction("", 12));
         b.addActionListener(new StyledEditorKit.FontSizeAction("", 16));
         c.addActionListener(new StyledEditorKit.FontSizeAction("", 20));
         d.addActionListener(new StyledEditorKit.FontSizeAction("", 24));

         size.add(a);
         size.add(b);
         size.add(c);
         size.add(d);*/
        //------------------------------------------
        mibarra.add(fuente);
        mibarra.add(estilo);

        mibarra.add(size);
        segundaLamina.add(mibarra);
        add(segundaLamina, BorderLayout.NORTH);
        add(terceraLamina, BorderLayout.SOUTH);
        add(areaTexto, BorderLayout.CENTER);
    }

    private void agregarRadioButton(String texto, int tama) {
        JRadioButtonMenuItem elemento = new JRadioButtonMenuItem(texto);

        grupo.add(elemento);
        size.add(elemento);
        if (texto.equalsIgnoreCase("12")) {
            elemento.addActionListener(new StyledEditorKit.FontSizeAction("", tama));
        } else if (texto.equalsIgnoreCase("16")) {
            elemento.addActionListener(new StyledEditorKit.FontSizeAction("", tama));
        } else if (texto.equalsIgnoreCase("20")) {
            elemento.addActionListener(new StyledEditorKit.FontSizeAction("", tama));
        } else {
            elemento.addActionListener(new StyledEditorKit.FontSizeAction("", tama));
        }
    }

    public void configuraMenu(String rotulo, String menu, String tipo_letra, int estilo, int tam) {

        JMenuItem ele_menu = new JMenuItem(rotulo);
        if (menu.equalsIgnoreCase("fuente")) {
            this.fuente.add(ele_menu);
            if (tipo_letra.equalsIgnoreCase("Aero")) {
                ele_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Aero"));
            } else if (tipo_letra.equalsIgnoreCase("Serif")) {
                ele_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Serif"));
            } else {
                ele_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Agency FB"));
            }
        } /*else if (menu.equalsIgnoreCase("estilo")) {
         this.estilo.add(ele_menu);
         if (estilo == Font.BOLD) {
         ele_menu.addActionListener(new StyledEditorKit.BoldAction());
                
         } else {
         ele_menu.addActionListener(new StyledEditorKit.ItalicAction());
         }
         }*/ else {
            this.size.add(ele_menu);
            ele_menu.addActionListener(new StyledEditorKit.FontSizeAction("", tam));
        }

    }

    //Clase que gestionara los eventos
   /* private class eventoTexto implements ActionListener {

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
     letras = areaTexto.getFont();
     if (menu.equalsIgnoreCase("Aero") || menu.equalsIgnoreCase("Serif") || menu.equalsIgnoreCase("Agency FB")) {
     estilo_letra = letras.getStyle();
     tamagno = letras.getSize();
     } else if (menu.equalsIgnoreCase("Negrita") || menu.equalsIgnoreCase("Cursiva")) {
     if(letras.getStyle()==1 || letras.getStyle()==2){
     estilo_letra=3;
     }
     tipo_texto = letras.getFontName();
     tamagno = letras.getSize();
     } else if (menu.equalsIgnoreCase("12") || menu.equalsIgnoreCase("16") || menu.equalsIgnoreCase("20") || menu.equalsIgnoreCase("24")) {
     tipo_texto = letras.getFontName();
     estilo_letra = letras.getStyle();
     }
     texto.setText("Fuente: "+tipo_texto+" Estilo: "+estilo_letra+" Tamaño:"+tamagno);
     // System.out.println("Fuente: "+tipo_texto+" Estilo: "+estilo_letra+" Tamaño:"+tamagno);
     areaTexto.setFont(new Font(tipo_texto, estilo_letra, tamagno));
     }

     }*/
}
