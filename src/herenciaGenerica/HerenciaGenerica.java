/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciaGenerica;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14-sep-2021
 * 
 */
public class HerenciaGenerica {
    public static void main(String[] args) {
        /*Empleado administrativa=new Empleado("Elena", 45, 1500);
        Jefe directorComercial=new Jefe("Ana", 27, 3500);
        
        Empleado nuevoEmpleado=directorComercial;*/
        Pareja<Empleado > adiministrativo=new Pareja<>();
        Pareja<Jefe> directorComecial=new Pareja<>();
        
        //Pareja<Empleado> nuevoEmpleado=directorComecial;
        Pareja.imprimirDatos(adiministrativo);
        Pareja.imprimirDatos(directorComecial);
    }

}
