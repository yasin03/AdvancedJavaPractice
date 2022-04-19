package Projects._HastaneOtomasyon;

import java.util.Scanner;

public class HastaneRunner extends Hastane {
    static Hastane hastane = new Hastane();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("\n========== TechPro Hospital Hoşgeldiniz ==========");
        System.out.println("Şikayetinizi seçiniz :");

        hastaKayit();
        sikayetListele();
        sikayetSecim();


    }

    private static void hastaKayit() {
        System.out.println("Lütfen isminizi soyisminiz giriniz : ");
        String isimsoyisim = scan.next();

        Hasta hasta = new Hasta(isimsoyisim);

    }


    private static void sikayetListele() {

        for (int i = 0; i < hastane.AktuelDurum.size(); i++) {
            System.out.println((i + 1) + " - " + hastane.AktuelDurum.get(i));
        }

    }
    private static void sikayetSecim() {
        int secim = scan.nextInt();


    }
}
