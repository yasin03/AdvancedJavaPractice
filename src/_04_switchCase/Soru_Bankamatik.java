package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {
        System.out.println("*****************************\nATM'YE HOŞGELDİNİZ\n1- Bakiye Öğrenme\n2- Para Yatırma\n3- Para Çekme\n4- Çıkış");
        int secim2 = scan.nextInt();

        secim();


    }

    private static void secim() {
        System.out.println("Yapacağınız işlemi seçiniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatır();
                break;
            case 4:
                cıkıs();
                break;
        }
    }

    private static void paraYatır() {
        System.out.println("yatırmak istediğiniz tutarı giriniz : ");
        int yatan = scan.nextInt();
        bakiye += yatan;
        bakiyeSorgulama();

    }

    private static void paraCek() {
        System.out.println("çekmek istediğiniz tutarı giriniz : ");
        int cekilen = scan.nextInt();
        if (cekilen > bakiye) {
            System.out.println("Bakiyeniz Yetersiz..");
        } else {
            bakiye -= cekilen;
            bakiyeSorgulama();
        }


    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("************************************");
        System.out.println("İşleme devam etmek istiyorsanız :1 çıkış için : 0 basınız.");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else {
            cıkıs();
        }
    }

    private static void cıkıs() {
        System.out.println("Çıkışınız yapıldı yine bekleriz");
    }
}

