/*
 En una matriz C de 24 x 6 se encuentran almacenadas 
 las calificaciones de 6 materias de un grupo de 24 estudiantes.  
 Elaborar un algoritmo que nos permita calcular e imprimir los siguiente:
 La nota promedio de cada estudiante
 El número de estudiantes que aprobaron cada materia
 El número de estudiantes que reprobaron cada materia
 La nota promedio de cada materia
 */
package punto21;

import java.text.DecimalFormat;

/**
 *
 * @author estiv
 */
public class Punto21 {

    
   static double [][] Scores = {{2.2,4.8,4.1,3.6,1.6,4.9},{2.1,4.8,4.4,3.6,2.6,4.9},{2.2,4.8,2.1,3.6,1.5,2.9},
                                {2.2,1.8,4.1,2.6,4.6,2.9},{2.2,4.8,4.1,3.6,4.6,3.9},{2.2,4.8,4.1,4.6,1.6,2.9},
                                {3.2,3.8,4.1,3.6,1.6,4.9},{1.2,3.8,2.1,4.6,3.6,4.9},{1.2,3.8,2.1,2.6,1.6,4.9},
                                {2.2,4.8,4.1,3.6,1.6,4.9},{2.2,1.8,2.1,1.6,1.6,4.9},{2.2,4.8,4.1,4.6,1.6,4.9},
                                {2.2,4.8,4.1,3.6,3.6,1.9},{2.2,3.8,4.1,3.6,1.6,4.9},{1.2,4.8,4.1,3.6,1.6,4.9},
                                {2.2,4.8,4.1,3.6,1.6,4.4},{2.2,4.8,4.2,3.0,3.6,4.3},{4.2,4.8,4.1,3.6,1.6,4.9},
                                {2.2,4.8,4.1,3.6,3.6,4.2},{2.2,4.8,4.1,3.6,1.6,4.9},{2.2,4.8,4.1,3.6,1.6,4.9},
                                {2.2,4.8,4.1,3.6,2.6,2.9},{3.2,4.8,4.1,3.6,1.6,4.9},{4.2,4.8,3.1,3.6,1.6,4.9}};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aprobados[]= {0,0,0,0,0,0};
        double materiaProm[] = {0,0,0,0,0,0};
        for(int i=0; i< Scores.length; i++){
            
            double prom = 0;
      
            for(int j=0; j< Scores[j].length; j++){
                if(Scores[i][j] >= 3){
                    aprobados[j]=aprobados[j]+1;
                }
                materiaProm[j] = materiaProm[j] + Scores[i][j];
                prom = prom + Scores[i][j];

            }
            prom=prom/6;
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("Promedio Estudiante " + "numero "+ (i+1) + ": " + df.format(prom));
        }
        
        for(int a=0; a< aprobados.length; a++){
            System.out.println("\n");
            System.out.println("numero de aprobados de la materia "+ (a+1) +": " + aprobados[a]);
            System.out.println("numero de reprobados de la materia "+ (a+1) +": " + (24-aprobados[a]));
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("promedio de la materia "+ (a+1) +": " + df.format(materiaProm[a]/Scores.length));
        }
        
    }
    
}
