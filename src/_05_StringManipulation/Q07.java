package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir isim giriniz : ");
        String isim = scanner.next();
        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);

       // isim.length() == 3 ? ():

    }


}