/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosGenericos;

import java.util.GregorianCalendar;



/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 13-sep-2021
 *
 */
public class MetodoGenerico {

    public static void main(String[] args) {
        String[] nombres = {"Jose", "Maria", "Pepe"};

        System.out.println(MisMatrices.getElementos(nombres));
        System.out.println("Primer elemento: "+MisMatrices.getPrimero(nombres));
        Empleado[] empleados = {new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500)};
        System.out.println(MisMatrices.getElementos(empleados));
        
        GregorianCalendar[] fechas={new GregorianCalendar(2015, 07, 12),
        new GregorianCalendar(2010, 05, 5),
        new GregorianCalendar(2012, 04, 3)};
        System.out.println(MisMatrices.getPrimero(fechas));
    }

}

class MisMatrices {
    /*
     Vamos a crear un método generico
     */

    public static <T> String getElementos(T[] a) {
        return "El tamaño del arreglo es de " + a.length + " elementos";
    }

    public static <T extends Comparable> T getPrimero(T[] a) {
        
        if (a == null || a.length == 0) {
            return null;
        }
        T elementoMenor=a[0];
        for (int i = 1; i <a.length; i++) {
            if(elementoMenor.compareTo(a[i])>0){
            elementoMenor=a[i];
            }
        }
        return elementoMenor;
    }

}

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
