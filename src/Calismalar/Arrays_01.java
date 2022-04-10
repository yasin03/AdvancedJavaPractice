package Calismalar;

public class Arrays_01 {
    public static void main(String[] args) {
       // Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
       // yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

        int arr[][]={ {1,2,3,7}, {4,5,6,2} };

        arrayCarp(arr);

    }

    private static void arrayCarp(int[][] arr) {
        int sonuc =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sonuc*=arr[i][j];
                System.out.println(arr[i][j]);
            }
        }
        System.out.println(sonuc);


    }
}
