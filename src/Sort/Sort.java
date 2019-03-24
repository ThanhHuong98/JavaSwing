package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort{
    private ArrayList<Integer>listInt;

    public Sort(){
        listInt =new ArrayList<Integer>();
    }

    public void setItemSort(String strNumber){
        //Split strNumber by space-while
        String arrayNumber[]= strNumber.split("\\s+");
        try {
            for(int i =0;i<arrayNumber.length;i++){
                listInt.add(Integer.parseInt(arrayNumber[i]));
            }
        }catch (NullPointerException e){
            System.out.println("Not data input");
        }
    }
    public void sort(){
        try {
            Comparator c = Collections.reverseOrder();
            Collections.sort(listInt,c);
            Collections.reverse(listInt);
        }catch (NullPointerException e){
            //
        }
    }
    public String toString(){
        String str = listInt.get(0).toString();
        for(int i =1;i<listInt.size();i++){
            str+=" " +listInt.get(i).toString();
        }
        return str;
    }
}
