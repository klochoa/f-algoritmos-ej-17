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
public class AsignaturaDistancia extends Asignatura{
    private int numero_creditos;

    public AsignaturaDistancia(String n, String t, double c,int nc) {
        super(n, t, c);
        setNumero_creditos(nc);
        
        
    }

    public void setNumero_creditos(int nc) {
        numero_creditos = nc;
    }
    
     public int getNumero_creditos() {
        return numero_creditos;
    }

    @Override
    public String toString() {
       return String.format("%sNumero de creditos:%d",super.toString(),getNumero_creditos());
    }
 
     
    
    
}
