package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Hakan");
        list.add("Omer");
        list.add("Hasan");
        list.add("Mehmet");
        System.out.println(list);

        System.out.println(tekEleman(list));

    }

    private static List<String> tekEleman(List<String> list) {
        List<String>yeniliste = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i%2!=0){
                yeniliste.add(list.get(i));
            }
        }
        return yeniliste;
    }


}
