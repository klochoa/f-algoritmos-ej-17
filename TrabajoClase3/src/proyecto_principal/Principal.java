/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_principal;
import Institucion.Asignatura;
import personal_docente.Docente;
import personal_docente.Titulo;
        


/**
 *
 * @author Karla
 */
public class Principal {
    
    public static void main(String[] args) {
        // Se crean las asignaturas
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matem�ticas");
        a1.establecrer_creditos(8);
        
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("F�sica");
        a2.establecrer_creditos(6);
        
        Titulo t1 = new Titulo();
        t1.establecer_nombre("Licenciado en F�sico Matem�ticas");
        t1.establecer_nombre_universidad("Universidad Polit�cnica");
        
        Titulo t2 = new Titulo();
        t2.establecer_nombre("Magister en Docencia Matem�tica");
        t2.establecer_nombre_universidad("Universidad Valenciana");
        
        Docente docente = new Docente();
        docente.establecer_nombres("Luis V");
        docente.establecer_apellidos("Perez J");
        docente.establecer_asignatura_1(a1);
        docente.establecer_asignatura_2(a2);
        docente.establecer_tit_tercer_nivel(t1);
        docente.establecer_tit_cuarto_nivel(t2);
        System.out.println(docente);
        
        
    }
}