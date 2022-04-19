package _17_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanalrı set'e convert edn bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(72);
        array.add(23);
        array.add(34);
        array.add(45);
        System.out.println(array);


        elementEkle(set,array);
        printSet(set);
    }

    private static <set> void printSet(Set set) {
        System.out.println(set);
    }

    private static void elementEkle(Set<Integer> set, ArrayList<Integer> array) {

        for (Integer i : array) {
            set.add(i);
        }
    }
}
