/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herenciaEjemplo.Asignatura;
import herenciaEjemplo.AsignaturaDistancia;
import herenciaEjemplo.AsignaturaPresencial;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      AsignaturaPresencial ap = new AsignaturaPresencial("Programacion","Comun",100,180);
      
      
     AsignaturaPresencial ap1 = new  AsignaturaPresencial("Literatura","Troncal", 300, 6);
    
    
    Asignatura [] as = new Asignatura[2];
    as[0]= ap;
    as[1]= ap1;
    
    Estudiante e = new Estudiante("Rene","Elizalde",34,as);
    System.out.println(e);
    
        
      
    }
    
}
