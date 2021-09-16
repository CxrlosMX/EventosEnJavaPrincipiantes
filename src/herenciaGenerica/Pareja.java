/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaGenerica;


/**
 *
 * @author: CxrlosMX
 * @param <T>
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10-sep-2021
 *
 */
public class Pareja<T> {// Con los operadores <,> dentro colocamos o asignamos que nuestra clase es generica
//Por lo regular para representar que sera de valores genericos, se utilizan las letras T,U,K

    private T primero;

    public Pareja() {

        primero = null;
    }

    /*
     Creamos un metodo set que se encargara de darle un valor a nuestro valor dentro de la clase
     */
    public void setPrimero(T valor) { //Recordemos que estamos haciendo uso programación generica
        primero = valor;
    }
    //Comodines
    public static void  imprimirDatos(Pareja<?extends Empleado> e){
       Empleado primero=e.getPrimero();
        System.out.println(primero);
    }
    
    /*
    Creamos nuestros método gettr que se encargara de devolvernos en valor de nuestra variable
    */
    
    public T getPrimero(){
    return primero;
    }

}
 