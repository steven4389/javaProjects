/*
    Se tiene en memoria la matrizA de tamaño (P x L) que contiene datos numéricos. 
    Se pide calcular e imprimir: 
    El promedio de cada columna impar 
    El promedio de los valores mayores a 23 de cada fila par.

 */
package punto23;

import java.util.Stack;

/**
 *
 * @author estiv
 */
public class Punto23 {

    static double[][] matrizA = {{22.32, 4.8, 14.1, 3.6, 1.6, 24.9}, {2.1, 4.8, 24.4, 23.6, 2.6, 4.9}, {12.2, 14.8, 22.1, 43.6, 41.5, 42.9},
    {22.32, 4.8, 14.1, 3.6, 1.6, 24.9}, {2.1, 4.8, 24.4, 23.6, 2.6, 4.9}, {12.2, 14.8, 22.1, 43.6, 41.5, 42.9},
    {21.32, 4.8, 64.1, 5.6, 1.6, 24.9}, {2.1, 4.8, 24.4, 23.6, 2.6, 4.9}, {12.2, 14.8, 22.1, 43.6, 41.5, 42.9},
    {12.32, 4.8, 44.1, 3.6, 1.6, 24.9}, {5.1, 31.8, 24.4, 23.6, 2.6, 4.9}, {12.2, 14.8, 22.1, 43.6, 41.5, 42.9},
    {22.32, 4.8, 24.1, 3.6, 1.6, 24.9}, {2.1, 4.8, 24.4, 23.6, 2.6, 4.9}, {12.2, 14.8, 22.1, 13.6, 41.5, 42.9},
    {12.32, 4.8, 54.1, 3.6, 1.6, 24.9}, {2.1, 4.8, 24.4, 23.6, 2.6, 4.9}, {12.2, 14.8, 22.1, 33.6, 41.5, 42.9},
    {11.2, 4.8, 64.1, 3.6, 1.6, 24.9}, {2.1, 4.8, 24.4, 27.6, 2.6, 4.9},{2.32, 4.8, 4.1, 3.6, 1.6, 2.9}, 
    {12.2, 14.8, 22.1, 43.6, 41.5, 42.9}, {2.1, 4.8, 24.4, 23.6, 2.6, 4.9},  {12.2, 14.8, 72.1, 73.6, 41.5, 42.9}};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double promImpares[];
        promImpares = new double[(matrizA[0].length) / 2];

        double promFilasParesMayor23[];
        promFilasParesMayor23 = new double[(matrizA.length)];
        Stack filas = new Stack();
        
        for (int i = 0; i < matrizA.length; i++) {

            int cont = 0;
            for (int j = 0; j < matrizA[j].length; j++) {

                if (j % 2 != 0) {
                    promImpares[j - (j - cont)] = promImpares[j - (j - cont)] + matrizA[i][j];
                    cont++;
                }

                if (i % 2 == 0) {
                    if (matrizA[i][j] > 23) {
                        
                        promFilasParesMayor23[i] = promFilasParesMayor23[i] + matrizA[i][j];
                        filas.push(promFilasParesMayor23);
                    }
                }

            }

        }

        for (int i = 0; i < promImpares.length; i++) {
            System.out.println("promedio de la columna " + (2 * i + 1) + ":" + promImpares[i] / matrizA.length);
        }
        System.out.println("\n");
     
         for (int i = 0; i < promFilasParesMayor23.length; i++) {
             
            System.out.println("promedio de la fila " + i + ":" + promFilasParesMayor23[i]/matrizA[0].length);
        }
       
    }

}
