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
public class Asignatura {
    private String nombre;
    private String tipo;
    private double costo;

public Asignatura (String n, String t, double c){
    setNombre(n);
    setTipo(t);
    setCosto(c);
    
}  

public void setNombre (String n){
    nombre = n;
    
}

public String getNombre(){
    return nombre;
}

public void setTipo (String t){
    tipo = t;
    
}

public String getTipo(){
    return tipo;
}

public void setCosto (double c){
    costo = c;
    
}

public double getCosto(){
    return costo;
}

@Override
    public String toString(){
        return String.format("Nombre:%s\n Tipo:%s\n Costo:%.2f\n", 
                getNombre(), getTipo(), getCosto());
    }

    
}
