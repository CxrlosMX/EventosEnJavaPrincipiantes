/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.creacion;

import java.io.File;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10-sep-2021
 *
 */
public class UsoArray {

    public static void main(String[] args) {
        ArrayList archivos = new ArrayList(5);
        archivos.add("Luis");
        archivos.add("Jorge");
        archivos.add("Maria");
        archivos.add("Sandra");
        archivos.add(new File("gestion.accdb"));
        String nombre = (String) archivos.get(4);
        /* archivos.add(new File("gestion.accdb"));
         File nombre=(File) archivos.get(0);*/
        System.out.println(nombre);
    }

}
