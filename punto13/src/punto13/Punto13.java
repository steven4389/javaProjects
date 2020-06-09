/*
    Se entrega una tabla con el nombre de N estudiantes en su primera Columna,
    la nota del primer examen en la segunda, la nota del segundo examen en la 
    tercera y la nota del tercer examen en la cuarta, desarrolle un algoritmo 
    que imprima el nombre de cada estudiante, junto con el promedio de calificación 
    y si este es mayor o igual a 3 indicar que ha ganado la materia, en caso 
    contrario indicar que la ha perdido

 */
package punto13;

import punto13.estudiante;

/**
 *
 * @author estiv
 */
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        estudiante objeto = new estudiante("Carlos", 3.4, 4.2, 3.0, 2.1);

        estudiante[] arrayEstudiantes = new estudiante[5];

        arrayEstudiantes[0] = new estudiante("Carlos", 3.4, 4.2, 3.0, 2.1);
        arrayEstudiantes[1] = new estudiante("Miguel", 2.4, 1.2, 2.0, 3.1);
        arrayEstudiantes[2] = new estudiante("Pedro", 4.4, 1.2, 2.0, 4.1);
        arrayEstudiantes[3] = new estudiante("Aristides", 2.4, 3.2, 3.0, 2.1);
        arrayEstudiantes[4] = new estudiante("Serbulo", 3.4, 4.2, 4.0, 1.1);

        for (estudiante e : arrayEstudiantes) {
            double prom = (e.getNota1() + e.getNota2() + e.getNota3() + e.getNota4()) / 4;

            String Estado = "";

            if (prom<3) {
                Estado= "has perdido la materia";
            }else{
                Estado= "has ganado la materia";
            }

            System.out.println(e.getNombre() + " " + prom + " " + Estado);
        }
    }

}
