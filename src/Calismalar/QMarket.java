package Calismalar;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanc = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static double ciro = 0;

    public static void main(String[] args) {
        int gun = 0;

        while (gun < 7) {
            System.out.print(gunler.get(gun) + " gününün hasılatını giriniz : ");
            double hasılat = scan.nextDouble();
            gunlukKazanc.add(hasılat);
            ciro += hasılat;
            gun++;
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();

    }

    private static void getOrtalamaninAltindaKazancGünleri() {
        List<String> alt = new ArrayList<>();
        double ort = ciro / 7;
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) < ort) {
                alt.add(gunler.get(i));
            }
        }
        System.out.println(alt);
    }

    private static void getOrtalamaninUstundeKazancGünleri() {
        List<String> ust = new ArrayList<>();
        double ort = ciro / 7;
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) >= ort) {
                ust.add(gunler.get(i));
            }
        }
        System.out.println(ust);

    }

    private static void getOrtalamaKazanc() {
        System.out.println("Bir Haftalık Ortalama Kazancınız : " + (ciro / 7));
    }
}