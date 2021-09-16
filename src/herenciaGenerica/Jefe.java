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
public class Jefe extends Empleado{

    public Jefe(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }
    
    double incentivo(double inc){
    return  inc;
    }

}
