package Calismalar;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QManav {
    static Scanner scan = new Scanner(System.in);
    static List<String> urunler = new ArrayList<>(Arrays.asList("Elma", "Armut", "Muz", "Kiraz", "Cilek"));
    static List<Double> urunFiyatlar = new ArrayList<>(Arrays.asList(5.0, 8.5, 15.5, 22.0, 12.5));
    static double toplamTutar;


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        //System.out.println(urunListesi);
        //musteriSecim();
        System.out.println("----------------------------AİLE MANAVINA HOŞGELDİNİZ----------------------------");
        urunSec();


    }

    private static void urunSec() {

        System.out.println("\n1-Elma\n2-Armut\n3-Muz\n4-Kiraz\n5-Cilek\n\n Hangi üründen almak istiyorsunuz : ");
        int urun = scan.nextInt();
        System.out.println("Kaç kilo almak istiyorsunuz : ");
        double kilo = scan.nextDouble();
        double urunFiyat = kilo * urunFiyatlar.get(urun - 1);
        toplamTutar += urunFiyat;
        System.out.println("Aldığınız ürün : " + urunler.get(urun - 1) + " Fiyatı : " + urunFiyat);
        System.out.println("Tekrar ürün almak istermisiniz? 1-Evet  0-Hayır");
        int secim = scan.nextInt();
        if (secim == 1) {
            urunSec();
        } else {
            kasa();
        }

    }

    private static void kasa() {
        System.out.println("Aldığınız ürünlerin toplam fiyatı : " + toplamTutar);
    }
}

