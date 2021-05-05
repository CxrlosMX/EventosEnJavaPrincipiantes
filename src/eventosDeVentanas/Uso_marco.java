/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosDeVentanas;

import javax.swing.JFrame;

/**
 *
 * @author El Camaleon
 */
public class Uso_marco {
    public static void main (String args[]){
    miMarco marco=new miMarco();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setSize(500,500);
    marco.setLocation(100,100);
    miMarco marco_2=new miMarco();
    marco_2.setSize(600, 600);
    marco_2.setLocation(200, 200);
    marco_2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
