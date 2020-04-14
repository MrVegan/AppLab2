package appvar10;

import java.util.ArrayList;


public class Transposition {
    
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, indexMin, indexMax;
    
    public String startTransposition(String s){
        String s1[] = s.split(" ");
        ArrayList<Integer> listInt = new ArrayList<>();
        for (String oneS : s1) {
            listInt.add(Integer.parseInt(oneS));
        }        
        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) > max ) {
                max = listInt.get(i);
                indexMax = i;
            }
            if (listInt.get(i) < min ) {
                min = listInt.get(i);
                indexMin = i;
            }                
        } 
        if (indexMax < indexMin) 
            listInt = fillNewArray(indexMax, indexMin, listInt);
        else 
            listInt = fillNewArray(indexMin, indexMax, listInt);;
        
        return listInt.toString();
    }
    
    private  ArrayList<Integer> fillNewArray(int start, int end, ArrayList<Integer> listInt){
        int temp;
        ArrayList<Integer> smallArray = new ArrayList<>();
        for (int i = start; i<end+1; i++)
            smallArray.add(listInt.get(i));        
        int n = smallArray.size(); 
        for (int i = 0; i < n/2; i++) {		
            temp = smallArray.get(n-i-1);
            smallArray.set(n-i-1, smallArray.get(i));
            smallArray.set(i, temp);		    
        }    
        for (int i = 0; i<smallArray.size(); i++)
            listInt.set(i+start,smallArray.get(i));    
        
        return listInt;
    }
    
    
    
}
