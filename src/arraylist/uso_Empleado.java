/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 4/09/2021
 *
 */
public class uso_Empleado {

    public static void main(String[] args) {

        /*
         Forma tipica de crear un array
         Empleado[] listaEmpleados=new Empleado[3];
         listaEmpleados[0]=new Empleado("Ana", 45, 2500);
         listaEmpleados[1]=new Empleado("Antonio",55, 2000);
         listaEmpleados[2]=new Empleado("Maria", 25, 2600);*/
        //ArrayList<TiposDeDato>
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        //Método para especificar cuantos empleados aploximadamente agregaremos a la lista esto para reducir consum de memoria
        //listaEmpleados.ensureCapacity(15);

        //Para agregar valores en un ArrayList: listaEmpleados.add(valor);
        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Maria", 25, 2600));
        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Maria", 25, 2600));
        //el metodo 'set' sirve para enviar o agregar un objeto(valor) en una posicion especifica de nuestro ArrayList
        listaEmpleados.set(0, new Empleado("Luis", 20, 10000000));

        /*
         Cuando estamos seguros que no agregaremos más objetos a nuestros array
         es correcto especificarlo, para evitar que usemos memoria de nuestra maquina
         */
        //listaEmpleados.trimToSize();
        /*
         size(): Nos devuelve el tamaño de la lista
         */
      /*  System.out.println("Ciclo For Each");
        System.out.println("Tamaño lista: " + listaEmpleados.size());
        for (Empleado listaEmpleado : listaEmpleados) {
            System.out.println(listaEmpleado);
        }

        /*
         El método 'get' sirve para obtener el objeto o valor dentro de la posición especificada
         */
        //System.out.println(listaEmpleados.get(2));
        
        /*
        Como recorro un ArrayList con un ciclo 'for' convencional
        */
       /* System.out.println("Clico convencional");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println((i+1)+"-"+listaEmpleados.get(i));
        }
        
        /*
        Como copio los valores almacenados en un arrayList dentro 
        de un arreglo convencional
        */
        /*Empleado[] arreglo=new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arreglo);
         */
        
        Iterator<Empleado> iterador=listaEmpleados.iterator();
        while (iterador.hasNext()) {            
            System.out.println(iterador.next());
        }
    }
}

/*
 Crearemos una clase Empleado
 */
class Empleado {

    private String nombre;
    private int edad;
    private int sueldo;

    public Empleado(String nombre, int edad, int sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSueldo=" + sueldo + "\n";
    }

}
