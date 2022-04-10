package Calismalar;

import java.util.Arrays;

public class Arrays_03 {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        String str = "Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin";

        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        System.out.println(Math.min(8,2));

    }
}
