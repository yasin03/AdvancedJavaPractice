package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.print("Lütfen bir sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int sonuc=1;
        list.add(sonuc);
        list.add(sonuc);

        for (int i = 1; i <sayi-1 ; i++) {

            sonuc=list.get(i-1)+ list.get(i);
            list.add(sonuc);
        }
        System.out.println(list);


    }
}
