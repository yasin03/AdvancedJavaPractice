package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */
        int sayi = 153, toplam = 0, rakam = 0, sayi2;
        sayi2 = sayi;
        do {
            rakam = sayi % 10;
            toplam += (rakam * rakam * rakam);
            sayi /= 10;
        } while (sayi > 0);
        System.out.println(toplam);
        System.out.println(sayi2);

        if (sayi2 == toplam) {
            System.out.println("Girdiğiniz sayı Armstrong sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı Armstrong sayı değildir.");
        }

    }
}
