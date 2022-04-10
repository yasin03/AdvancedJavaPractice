package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        int pin = 4210;
        if (pin >= 10000 || pin < 1000) {
            System.out.println("Girdiğiniz pin kodu 4 basamaklı olmalıdır..");
        } else {
            System.out.println("x");
        }
    }
}

