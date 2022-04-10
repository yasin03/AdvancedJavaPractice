package Projects.P02_javaBankATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class JavaBankAtm {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Lütfen kart numaranızı giriniz : ");
        String kartNo = scan.nextLine();
        System.out.println("Lütfen şifrenizi giriniz : ");
        String kartSifre = scan.nextLine();

        dogrulama(kartNo, kartSifre);


    }

    private static boolean dogrulama(String kartNo, String kartSifre) {
        boolean dogrulama = false;
        // doğrulama kodu

        if (dogrulama == true) {
            return dogrulama;
        } else {
            kayit(kartNo, kartSifre);
        }
        return dogrulama;
    }

    private static void cikis() {
    }

    private static void kayit(String kartNo, String kartSifre) {
        System.out.println("BANKAMIZDA KAYITLI DEĞİLSİNİZ.\nKAYIT OLMAK İSTERMİSİNİZ? EVET İÇİN 1, ÇIKIŞ İÇİN 0 GİRİNİZ : ");
        int cevap = scan.nextInt();
        if (cevap == 1) {
            kayit(kartNo, kartSifre);
        } else if (cevap == 0) {
            System.out.println("İYİ GÜNLER DİLERİZ...");
            cikis();
        } else {
            System.out.println("HATALI GİRİŞ YAPTINIZ TEKRAR DENEYİNİZ :");
        }
    }

    private static void giris() {
    }
}


