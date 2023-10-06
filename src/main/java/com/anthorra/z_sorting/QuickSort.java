
package com.anthorra.z_sorting;

import static java.lang.System.out;
import java.util.ArrayList;


public class QuickSort
{
    /**
     * Ez a függvény a gyorsrendezés / quicksort lépésenként részletezett változata  
     * @param array1 bemenő lista rendezésre
     * @param details ha true megmutatja a rendezés lépéseit
     * @return visszadja rendezett listát
     */
    
    public static ArrayList<Integer> quickSort(ArrayList<Integer> array1, boolean details)
    {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> retArray = new ArrayList<>();
        int pivot; 
        
        if(array1.size()<=1)
        {
            return array1;
        }
        
        //érdekes hogy mi szerint válaszom ezt ki?
        pivot = array1.get(array1.size()-1);
        
        if(details)
        {
        for(int i = 0; i < array1.size(); i++)
        {
            if(array1.get(i)==pivot)
            {out.print(" [" + array1.get(i) + "]");}
            else
            {out.print(" " + array1.get(i));}
        }
        out.println("");
        }
        
        for(int i = 0; i<array1.size();i++)
        {
            
            if(array1.get(i)<pivot)
                {less.add(array1.get(i));}
            else if(array1.get(i)==pivot)
                {equal.add(array1.get(i));}
            else
                {greater.add(array1.get(i));}
        }
        
        if(details)
        {
            out.print("less: ");
            less.forEach((n) -> out.print(" " + n));
            out.print("  equal: ");
            equal.forEach((n) -> out.print(" " + n));
            out.print("  greater: ");
            greater.forEach((n) -> out.print(" " + n));
            out.println("");
        }
        
        retArray.addAll(quickSort(less,details));
        retArray.addAll(equal);
        retArray.addAll(quickSort(greater,details));
        return retArray;
    }
    
/**
 * A gyors rendezési függvény a wiki pseudo kód alapján
 * @param array1 rendezendő tömb (csak Integer)
 * @return a visszatérő rendezett tömb
 */    
    
    public static ArrayList<Integer> quickSort(ArrayList<Integer> array1)
    {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> retArray = new ArrayList<>();
        int pivot; 
        
        if(array1.size()<=1)
        {
            return array1;
        }
        
        //érdekes hogy mi szerint válaszom ezt ki?
        pivot = array1.get(array1.size()-1);
        
        for(int i = 0; i<array1.size();i++)
        {
            
            if(array1.get(i)<pivot)
                {less.add(array1.get(i));}
            else if(array1.get(i)==pivot)
                {equal.add(array1.get(i));}
            else
                {greater.add(array1.get(i));}
        }
                
        retArray.addAll(quickSort(less));
        retArray.addAll(equal);
        retArray.addAll(quickSort(greater));
        return retArray;
    }
}

//QUICKSORT PSEUDO CODE:
/*
function quicksort(array)
     var list less, equal, greater
     if length(array) ≤ 1  
         return array  
     select a pivot value pivot from array
     for each x in array
         if x < pivot then append x to less
         if x = pivot then append x to equal
         if x > pivot then append x to greater
     return concatenate(quicksort(less), equal, quicksort(greater))

*/