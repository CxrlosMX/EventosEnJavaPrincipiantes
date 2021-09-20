/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads_v2;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16-sep-2021
 * 
 */
public class EjercicioNumerosLetras {
    public static void main(String[] args) {
        /*
        1.-Crea una clase que implemente la interface "runnable" y tenga de atributo un numero llamado tipo
            *Si el tipo es 1, mostrara los números del 1 al 30
            *Si el tipo es 2, mostrara las letras de la "a" a la "z"
        */
        Runnable obj1=new LlamadaHilos(1); //Números
        Runnable obj2=new LlamadaHilos(2);
        
        Thread hilo1=new Thread(obj1);
         Thread hilo2=new Thread(obj2);
         /*
         Iniciamos nuestros hilos
         La ventaja de los hilos, especialmente es por que podemos hacer mas de una tarea a la vez
         minestras se imprimen los numero se imprimen las letras, y no llevan un orden aunque el otro todavia no
         acabe el segundo hilo sigue, ni el uno al otro de perjudican
         */
        hilo1.start();
        hilo2.start();
        
        
    }

}


        
