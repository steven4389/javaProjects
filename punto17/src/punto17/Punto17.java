/*
Diseñe un algoritmo que recorra una lista de números, 
mire cuántos de estos son pares, a continuación, coloque 
en las primeras posiciones los números pares de menor a
mayor y luego los impares de mayor a menor. Por ejemplo,
si se entrega Lista = [5, 21, 6, 45, 1, 2, 4] debe 
entregar Lista = [2, 4, 6, 45, 21, 5, 1].

 */
package punto17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author estiv
 */
public class Punto17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[] = {5, 21, 6, 45, 1, 2, 4};

        Stack pares = new Stack();
        Stack inpares = new Stack();
        
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares.push(a[i]);
            }else{
                inpares.push(a[i]);
            }
            
        }
        
        ArrayList<Integer> Pares = new ArrayList(pares);
        Integer[] par = new Integer[Pares.size()];
        par = Pares.toArray(par);
        
        ArrayList<Integer> inPares = new ArrayList(inpares);
        Integer[] inpar = new Integer[inPares.size()];
        inpar = inPares.toArray(inpar);
        
        System.out.println(pares);
        System.out.println(inpares);
        
        Stack completeList = new Stack();
        
        Arrays.sort(par);
        System.out.println("\npares ordenados ASCENDENTEMENTE ");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i]);
            System.out.print("  ");
            completeList.push(par[i]);
        }
        Arrays.sort(inpar);
        System.out.println("\ninpares ordenados DESCENDENTEMENTE");
        for (int i = inpar.length - 1; i >= 0; i--) {
            System.out.print(inpar[i]);
            System.out.print("  ");
            completeList.push(inpar[i]);
        }

        System.out.println("\nLista ordenada:");
        System.out.println(completeList);
        
    }

}
