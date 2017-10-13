/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author Karla
 */
public class Computadora3 {
    private double velocidad_procesador;
   
   public void  establecer_velocidad_procesador(double velo) {
       velocidad_procesador = velo;
               
       if(velo>5){
           velocidad_procesador = 5.0;
           
       }else{
           velocidad_procesador = velo;
       }
               
} 
   public double  obtener_velocidad_procesador (){
       
       return velocidad_procesador;
   }
   
    @Override
   public String toString(){
       String cadena = String.format("Computadora con velocidad\n"
               +"velocidad%f",obtener_velocidad_procesador());
       
       String cadena2 = String.format("Computadora con velocidad\n"
               +"velocidad%f", velocidad_procesador);
       
       return cadena;
       
   }
    
}
