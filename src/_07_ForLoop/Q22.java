package _07_ForLoop;

public class Q22 {
    /*
    1
    232
    34543
    4567654

     */
    public static void main(String[] args) {

        int sayi=5;

        for (int i = 1; i <= sayi; i++) {

            int a=i;

            for (int j = 1; j < i; j++) {

                System.out.print(a++ +" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(a-- +" ");
            }

            System.out.println();

        }
    }
}
