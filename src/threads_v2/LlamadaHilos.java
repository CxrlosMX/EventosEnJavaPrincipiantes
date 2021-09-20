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
public class LlamadaHilos implements Runnable {

    private int tipo;

    public LlamadaHilos(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        
        while (true) {
            switch (tipo) {
                case 1: {
                    System.out.println("Numeros");
                    for (int i = 1; i <= 30; i++) {
                        System.out.println(i);
                    }
                    System.out.println("");
                    break;
                }
                case 2: {
                    char letra;
                    System.out.println("Letras");
                   /* for (int i = 65; i <=90; i++) {
                        System.out.println((letra=(char)i));
                    }*/
                   for (char c = 'a'; c <='z'; c++) {
                        System.out.println(c); 
                    }
                    break;
                }
                default: {
                    System.out.println("Introduce valores validos");
                    break;
                }

            }
        }
    }

}
