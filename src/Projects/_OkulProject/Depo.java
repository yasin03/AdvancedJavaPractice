package Projects._OkulProject;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {

            System.out.println("---------------- YILDIZ KOLEJİ ----------------\n" +
                    "------------------- ANA MENÜ ------------------\n" +
                    "1- Okul Bilgilerini Görüntüle\n2- Öğretmen Menü\n3- Öğrenci Menü\nQ- Çıkış\nLütfen Menüden Tercihinizi Yapınız :");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    okulBilgileriniYazdir();
                    break;
                case "2":
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":
                    break;
                case "q":
                case "Q":
                    projeDurdur();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, Tekrar deneyiniz..");
            }
        } while (!tercih.equalsIgnoreCase("q"));

    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("---------------- YILDIZ KOLEJİ ----------------\n" +
                " Adres : " + Okul.adres + "\n Telefon : " + Okul.telefon + "\n");
        Thread.sleep(2000);
    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden çıktınız.");
    }


}
