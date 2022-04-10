package StringManipulation;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        /*Soru 13 Interview Question
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
        Kural 1  4 ile bolunemeyen yillar artik yil degildir
        Kural 2  4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        Kural 3  4 ’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 ’un kati olan yillar artik yildir*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz : ");
        Short a = scan.nextShort();

        if (a > 999 && a < 10000) {
            if (a % 4 == 0) {
                if (a % 100 == 0) {
                    if (a % 400 == 0) {
                        System.out.println(a + " : Artık yıldır.");
                    } else {
                        System.out.println(a + " : Artık yıl değildir.");
                    }

                } else {
                    System.out.println(a + " : Artık yıldır.");
                }

            } else {
                System.out.println(a + " : Artık yıl değildir.");
            }
        }


    }
}
