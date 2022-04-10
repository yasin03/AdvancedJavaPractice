package Calismalar;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class C01_ForLoopRandom {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();

        //57
        int sayi = rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        System.out.println("\nBilgisayar 1-100 arasında rastgele bir sayı seçmiştir..");

        Scanner scan = new Scanner(System.in);
        System.out.print("Bilgisayarın seçtiği sayıyı tahmin etmeye çalışın : ");

        //16
        int tahmin = scan.nextInt();
        int sayac = 1;
        while (!(tahmin == sayi)) {
            if (tahmin < sayi) {
                System.out.print("Tahmininiz küçük tekrar deneyin. : ");
                tahmin = scan.nextInt();
            } else {
                System.out.print("Tahmininiz büyük tekrar deneyin. : ");
                tahmin = scan.nextInt();
            }
            sayac+=1;
        }
        System.out.println(sayac+ " kerede buldunuz..");

    }
}
