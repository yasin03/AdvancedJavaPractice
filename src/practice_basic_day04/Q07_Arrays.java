package practice_basic_day04;

import java.util.Arrays;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};

        minSayiBulma(arr);


    }

    private static void minSayiBulma(int[][] arr) {
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sayac++;
            }
        }
        int yeniArr[] = new int[sayac];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                yeniArr[index] = arr[i][j];
                index++;
            }
        }
        Arrays.sort(yeniArr);
        System.out.println("Minimum sayı = " + yeniArr[0]);
    }
}
