/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herenciaEjemplo.Asignatura;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    private Asignatura[] asignaturas;

    public Estudiante(String n, String a, int e, Asignatura[] as) {
        super(n, a, e);
        setAsignatura(as);
    }

    public Asignatura[] getAsignatura() {
        return asignaturas;
    }

    public void setAsignatura(Asignatura[] as) {
        asignaturas = as;
    }

    public double obtener_valor_matricula() {
        double valor = 0;
        Asignatura[] arrayAsignaturas = getAsignatura();
        for (int i = 0; i < arrayAsignaturas.length; i++) {
            valor += arrayAsignaturas[i].getCosto();

        }

        return valor++;
    }

    public String imprimir_valor_matricula() {
        String cadena = "";

        Asignatura[] arrayAsignaturas = getAsignatura();

        for ( int i = 0; i < arrayAsignaturas.length; i++) {
            cadena += String.format("\nAsignatura presencial\n\tNombre:%s\n \tTipo:%s\n\t Costo:%.2f\n"
            ,arrayAsignaturas[i].getNombre()
            ,arrayAsignaturas[i].getTipo()
            ,arrayAsignaturas[i].getCosto());
            
        }
           return cadena;
    }
    

    @Override
    public String toString() {

        return String.format("%s\n Costo:%.2f\n Lista de Asignaturas%s"
                ,super.toString(),obtener_valor_matricula(),imprimir_valor_matricula());
    }

   
}
