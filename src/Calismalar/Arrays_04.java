package Calismalar;

import java.util.Arrays;

public class Arrays_04 {
    public static void main(String[] args) {

        // Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir Array olarak yazdiran bir method yaziniz

        String arr[] = {"a", "b", "c", "d", "e", "c"};
        String istenen = "c";
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (istenen == arr[i]) {
                sayac++;
            }
        }
        String arr2[] = new String[arr.length-sayac];
        System.out.println(sayac);

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if ((istenen != arr[i])) {

                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
