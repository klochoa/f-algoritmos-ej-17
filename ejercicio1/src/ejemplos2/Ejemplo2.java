/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

/**
 *
 * @author Karla
 */
public class Ejemplo2 {
    public static void main (String[] arg){
        Computadora2 c = new Computadora2();
        System.out.println(c.obtener_velocidad_procesador());
        c.establecer_velocidad_procesador(10.0);
        System.out.println(c.obtener_velocidad_procesador());
    }
}
