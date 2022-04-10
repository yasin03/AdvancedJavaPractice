package Calismalar;

public class Arrays_02 {
    public static void main(String[] args) {
        // Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int arr[][] = {{1, 2, 3}, {4, 5}, {6,2}};

        arraySonElemanCarp(arr);


    }

    private static void arraySonElemanCarp(int[][] arr) {
        int sonuc=1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < 1; j++) {

                sonuc*=arr[i][arr[i].length-1];

                System.out.print(arr[i][arr[i].length-1] +" ");
            }
        }
        System.out.println("\n"+sonuc);
    }
}
