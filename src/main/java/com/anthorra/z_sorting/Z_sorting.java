
package com.anthorra.z_sorting;

import static java.lang.System.out;
import java.time.Instant;
import java.util.ArrayList;

public class Z_sorting {

    public static void main(String[] args) 
    {
        ArrayList<Integer> tomb1 = new ArrayList<>();
        //ArrayList<Integer> tomb2 = new ArrayList<Integer>();
        tomb1.add(57);
        tomb1.add(5);
        tomb1.add(99);
        tomb1.add(24);
        tomb1.add(2);
        tomb1.add(88);
        tomb1.add(67);
        tomb1.add(158);
        tomb1.add(61);
        tomb1.add(34);
        tomb1.add(89);
        
        /*for(int i = 0; i<=10 ;i++)
        {
            tomb1.add((i+10)*2);
        }*/
        
        /*
        for(int j = 0; j<= 10; j++)
        {
            tomb2.add((j+4)*3);
        }
        */
        
        //PRINTING ARRAY1
        out.println("Tömb 1 elemei: ");
        for(int i=0;i<tomb1.size();i++)
        {
            out.print(tomb1.get(i) + ", ");
        }
        out.println("");
        
        //PRINTING ARRAY2
        /*
        out.println("Tömb 2 elemei: ");
        for(int j=0;j<tomb2.size();j++)
        {
            out.print(tomb2.get(j) + ", ");
        }
        */
        
        out.println("kezdés: " + Instant.now());
        out.println("");
        
        
        ArrayList<Integer> tomb1Rend = new ArrayList<>(QuickSort.quickSort(tomb1, true));
        
        
        out.println("");
        out.println("Tömb 1 rendezett elemei: ");
        for(int i=0;i<tomb1Rend.size();i++)
        {
        
            out.print(tomb1Rend.get(i) + ", ");
        }
        out.println("");
        out.println("befejezés: " + Instant.now());
              
    }
}
