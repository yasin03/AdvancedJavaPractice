package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz..:");
        int sayi1 = scan.nextInt();
        int i = 1;
        do {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            } else {

            }

            i++;
        } while (i != sayi1);
    }
}
