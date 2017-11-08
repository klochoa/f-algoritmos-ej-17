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
public class AsignaturaPresencial extends Asignatura {
    private int numero_horas;

    public AsignaturaPresencial(String n, String t, double c, int nh) {
        super(n, t, c);
        setNumero_horas(nh);
    }


public void setNumero_horas(int nh){
    numero_horas = nh;
    
}

public int getNumero_horas(){
    return numero_horas;
}

    @Override
    public String toString() {
        return String.format("%s\nNumero de horas:%s",super.toString(),getNumero_horas()); //To change body of generated methods, choose Tools | Templates.
    }


    
}
