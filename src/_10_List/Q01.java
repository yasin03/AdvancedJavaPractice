package _10_List;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> input = new ArrayList<>();
        input.add("Ali");
        input.add("Veli");
        input.add("Ayse");
        input.add("Fatma");
        input.add("Hakan");
        input.add("Omer");
        input.add("Hasan");
        input.add("Mehmet");
        ArrayList<String> input2 = new ArrayList<>();

        System.out.println(input);

        for (int i = 0; i < input.size(); i++) {
            if (!(input.get(i).toLowerCase().contains("a"))) {
                input2.add(input.get(i));
            }
        }
        System.out.println(input2);
    }
}
