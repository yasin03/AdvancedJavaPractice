package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer> sayilar = new ArrayList<>();
        int toplam=0;
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(4);

        System.out.println(sayilar);

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=(sayilar.get(i)*sayilar.get(i));
        }
        System.out.println("toplam = " + toplam);
    }
}
