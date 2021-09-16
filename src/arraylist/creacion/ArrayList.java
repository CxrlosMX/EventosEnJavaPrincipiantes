/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.creacion;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10-sep-2021
 *
 */
public class ArrayList {

    private final Object[] datosElemento;
    private int i;

    public ArrayList(int z) {
        datosElemento = new Object[z];
        i = 0;
    }
    public Object get(int i){
    return datosElemento[i];
    }

    public void add(Object o) {

        datosElemento[i] = o;
        i++;
    }

}
