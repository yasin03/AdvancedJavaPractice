package _15_Exceptions.Q02;

import java.util.Scanner;

public class OkulMain {
    /*
     4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
        ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */
    static Scanner scan = new Scanner(System.in);
    static Okul okulYeni = new Okul();

    public static void main(String[] args) {


        System.out.println("Okulun ismini giriniz : ");
        String okulAd = scan.nextLine();
        System.out.println("Kontenjanı giriniz : ");
        int maxOgr = scan.nextInt();
        okulYeni.setMaxOgrenciSayisi(maxOgr);
        okulYeni.setOkulAd(okulAd);
        scan.nextLine();

        ogrenciekle();
        System.out.println(okulYeni);


    }

    private static void ogrenciekle() {
        System.out.println("Öğrencinin adını giriniz : ");
        String ad = scan.nextLine();
        System.out.println("Öğrencinin soyadını giriniz : ");
        String soyad = scan.nextLine();

        try {
            System.out.println("Öğrencinin yaşını giriniz : ");
            int yas = scan.nextInt();
            if (yas < 0 || yas > 15) {
                throw new IndexOutOfBoundsException();
            }
            Ogrenci ogr = new Ogrenci(ad, soyad, yas);
            okulYeni.ogrenciList2.add(ogr);
            if (okulYeni.getMaxOgrenciSayisi() < okulYeni.ogrenciList2.size()) {
                throw new IllegalArgumentException();
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Öğrenci yaşı 0-15 yaş arasında olmalıdır.");
            ogrenciekle();
        } catch (IllegalArgumentException e) {
            System.out.println("Kontenjan doldu.Öğrenci ekleyemezsiniz.");

        }


    }
}
