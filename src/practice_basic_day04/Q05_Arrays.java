package practice_basic_day04;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int arr[]={23,12,43,57,568,9,789,9,26,4567,679,47};
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {
                sayac++;
            }

        }
        System.out.println(sayac);

    }
}
