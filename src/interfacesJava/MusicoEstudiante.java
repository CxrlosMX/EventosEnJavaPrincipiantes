/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacesJava;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 2/09/2021
 * 
 */
/*
Lo que queremos es que nuestra clase herede de nuestras interfaces "Musico" y "Estudiante"
En las interfaces no se usa el atributo "extends" si no el atributo "Implements"
*/
public class MusicoEstudiante implements Musico, Estudiante{

    @Override
    public void tocarMusica() {
        System.out.println("Estoy estudiando programación");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy cantando y tocando instrumentos musicales");
    }

}
