/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionesAvanzadas_Libre;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/07/2021
 *
 */
public class EnColumnas implements LayoutManager {

    @Override
    public void addLayoutComponent(String string, Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container miContenedor) { //El contenedor hace referencia hacia donde ubicare mis elementos
        int contador = 0;
        int n = miContenedor.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;

            Component c = miContenedor.getComponent(i);
            c.setBounds(x, y, 100, 20);
            x += 100;
            if (contador % 2 == 0) {//Pares solo se incrementara la Y cuando contador sea un numero par
                x = 20;
                y += 40;
            }
        }

    }

    private int x = 20, y = 20;

}
