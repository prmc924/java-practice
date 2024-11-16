package javarevision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Jay Vaghani
 */
public class CollectionExample {

    public static void main(String[] args) {
        ArrayList<String> colourList = createArrayList();
        System.out.println(colourList);
        boolean result = checkColourIsAvailableInList(colourList, "red");
        System.out.println(result);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(38);
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Prime");
    }

    public static boolean checkColourIsAvailableInList(ArrayList<String> list, String colourName){
        for ( String colour : list){
            if (colour.equalsIgnoreCase(colourName)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> createArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Green");
        list.add("White");
        list.add("Red");
        list.add("Black");
        list.add("Purple");
        return list;
    }


}
