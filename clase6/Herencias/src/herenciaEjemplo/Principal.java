/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEjemplo;

/**
 *
 * @author Karla
 */
public class Principal {
    public static void main(String[] args) {
        
    AsignaturaPresencial ap = new AsignaturaPresencial("Programacion","Comun",100,180);
    System.out.println(ap);
    
    AsignaturaDistancia at = new  AsignaturaDistancia("Literatura","Troncal", 300, 6);
    System.out.println(at);
     
    }
    
    
}
 /* programacio
    comun
    $100
    Numero de horas : 180
 */           