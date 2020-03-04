// Dan Albert Solis
// 2/25/20
// Generics

import java.util.*;

class Generic {

    /**
     * Sort method that extends comparable type generic, takes and sorts an array list
     * of type generics
     *
     * @param list
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E temp; //temp E variable to hold an object in place for swapping

        for (int i = 0; i < list.size() - 1; i++){  //current1 for loop
            for (int j = i + 1; j < list.size(); j++){ //current2 for loop
                if (list.get(i).compareTo(list.get(j)) > 0){ //if value at list[i] is bigger than list[j], swap
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }

        }

    }
}
public class genericTest{
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 4, 3)); //arrayList of Integers
        ArrayList<Double> arr2 = new ArrayList<>(Arrays.asList(3.4, 1.2, -12.3)); //arrayList of Doubles
        ArrayList<String> arr3 = new ArrayList<>(Arrays.asList("Bob", "Alice", "Ted" ,"Carol")); //arrayList of Strings

        Generic generic = new Generic(); //generic class instantiated
        generic.sort(arr1); //sort is called for the three array lists
        generic.sort(arr2);
        generic.sort(arr3);


        //Arrays are printed
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        System.out.println(arr3.toString());




    }
}
