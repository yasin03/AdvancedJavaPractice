package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        char i='A';
        do {
            if (!(i%2==0)){
                System.out.print(i+" ");
                i++;
                System.out.println(i);
            }
        }while (i<='Z');
        /*
        for (char i = 'A'; i < 'z'; i++) {
            if (!(i%2==0)){
                System.out.print(i+" ");
            }
        }
        */
    }

}
