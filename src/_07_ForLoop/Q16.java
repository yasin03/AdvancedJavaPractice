package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */


        int sayi = 5;

        System.out.println("* ");
        for (int i = 0; i < sayi; i++) {
            System.out.print("* ");

                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
            System.out.println("* ");
        }
        for (int i = 0; i < sayi; i++) {
            System.out.print("*  ");
        }

    }

}
