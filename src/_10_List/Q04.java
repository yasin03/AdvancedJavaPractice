package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner scan = new Scanner(System.in);
        List<Integer> not = new ArrayList<>();
        int toplam = 0, ort = 0, i = 1, gecen = 0, gecemeyen = 0;

        do {
            System.out.println("Lütfen " + i + ". öğrencinin notunu giriniz : ");
            not.add(scan.nextInt());
            i++;
        } while (i <= 5);

        System.out.println(not);

        for (int j = 0; j <= (not.size() - 1); j++) {
            toplam += not.get(j);
        }
        ort = (toplam / not.size());
        System.out.println("ortalama = " + ort);

        for (int j = 0; j <= not.size() - 1; j++) {
            if (not.get(j) < ort) {
                gecemeyen++;
            } else {
                gecen++;
            }
        }
        System.out.println("Ortalamayı geçen öğrenci sayısı : " + gecen + "\nOrtalamayı geçemeyen öğrenci sayısı : " + gecemeyen);


    }
}
