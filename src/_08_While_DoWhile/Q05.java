package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        int sayi = 65431;
        int rakam = 0;
        int toplam = 0;

        do {
            rakam = (sayi % 10);
            toplam=toplam+rakam;
            sayi=sayi/10;

        }while (sayi>0);
        System.out.println(toplam);

    }

}
