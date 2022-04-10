package _10_List;

import java.util.ArrayList;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

        simteriMi(arr);






    }

    private static void simteriMi(int[] arr) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for (int i = 0; i < (arr.length/2) ; i++) {

            list1.add(arr[i]);
        }
        System.out.println(list1);
        for (int i = arr.length-1; i >= (arr.length/2) ; i--) {

            list2.add(arr[i]);
        }
        System.out.println(list2);

        if (list1.equals(list2)){
            System.out.println("Girilen liste simetrik");
        }else {
            System.out.println("Girilen liste simetrik değil");
        }
    }

}
