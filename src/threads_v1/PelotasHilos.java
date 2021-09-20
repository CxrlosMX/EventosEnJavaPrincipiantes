/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_v1;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 15-sep-2021
 *
 */
public class PelotasHilos implements Runnable {

    private Pelota pelota;
    private Component componente;

    public PelotasHilos(Pelota unaPelota, Component unComponente) {
        this.pelota = unaPelota;
        this.componente = unComponente;
    }

    @Override
    public void run() {
        boolean bandera=Thread.interrupted();
        /*
         Dentro del método "run" se debe agregar la tarea que queremos que se ejecute 
         más d euna vez o que sea multitarea
         */
      
           // while(!Thread.interrupted()){
            
            while(!bandera){ //El metodo currentThread nos devuelve un objeto de 
                //tipo Thread
                bandera=Thread.interrupted();
                if(bandera){
                JOptionPane.showMessageDialog(null,"Hilo detenido", "Detenido", 1);
                }
                
                pelota.mueve_pelota(componente.getBounds());

            componente.paint(componente.getGraphics());
            try {
                Thread.sleep(4);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
} 
         /*   try {
                /*
                 sleep(long millis)
                 Causes the currently executing thread to sleep (temporarily cease execution)
                 for the specified number of milliseconds, subject to the precision
                 and accuracy of system timers and schedulers.
                 */
                
                /*
                Al utilizar el métood sleep e intentar detener el hilo
                este nos saldra un error por que cuando se utiliza este metodo
                el hilo se encuentra bloqueado
                */
              //  Thread.sleep(4);
           //} catch (InterruptedException ex) {
             //x.printStackTrace();
            //    System.out.println("Hilo bloqueado imposible su interrupción");
           // } 

        }
    

}
