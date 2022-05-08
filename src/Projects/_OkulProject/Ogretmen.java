package Projects._OkulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("13546686113","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("16464684466","Furkan, Karan, 1982, Türkçe");
        ogretmenlerMap.put("72831839787","Yeşim, Özkan, 1988, Fizik");
        ogretmenlerMap.put("65344695799","Süreyya, Boran, 1990, Matematik");
        ogretmenlerMap.put("46262464576","Alper, Gözde, 1990, Türkçe");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("------------------- ÖĞRETMEN MENÜ ------------------\n" +
                    "1- Öğretmenler Listesi Yazdır\n2- Soyisimden Öğretmen Bulma\n3- Branştan Öğretmen Bulma\n" +
                    "4- Bilgilerini Girerek Öğretmen Ekleme\n5- Kimlik No ile Kayıt Silme\nA- Ana Menü\nQ- Çıkış\n" +
                    "Lütfen Menüden Tercihinizi Yapınız :");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    ogretmenMenu();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();
                    break;
                case "5":
                    ogretmenSilme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, Tekrar deneyiniz..");
            }
        } while (!tercih.equalsIgnoreCase("q"));


    }

    public static void ogretmenSilme() throws InterruptedException {
        System.out.println("Silmek istediğiniz öğretmenin TC Nosunu giriniz : ");
        String tcNo =scan.nextLine();
        ogretmenlerMap.remove(tcNo);
        System.out.println(tcNo+" TC Nolu öğretmen silinmiştir.");
        Thread.sleep(2000);
        ogretmenListesiYazdir();
    }

    public static void ogretmenEkleme() throws InterruptedException {
        System.out.println("TC No : ");
        String tcNo = scan.nextLine();
        System.out.println("İsim : ");
        String isim = scan.nextLine();
        System.out.println("Soyisim : ");
        String soyisim = scan.nextLine();
        System.out.println("Doğum Yılı : ");
        String dogumYili = scan.nextLine();
        System.out.println("Branş : ");
        String brans = scan.nextLine();

        String eklenecekValue = isim+", "+soyisim+", "+dogumYili+", "+brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);

        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("------------------- EKLENEN ÖĞRETMEN  ------------------\n" +
                "TC No\t\tİsim\t\tSoyisim  D.Yılı   Branş \n--------------------------------------------------");
        System.out.printf("%11s %-11s %-8s %-8s %-10s\n",tcNo,isim,soyisim,dogumYili,brans);
        Thread.sleep(2000);

    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradığınız Öğretmenin Branşını Giriniz");
        String istenenBrans = scan.nextLine();
        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("------------------- BRANŞ İLE ÖĞRETMEN BULMA ------------------\n" +
                "TC No\t\tİsim\t\tSoyisim  D.Yılı   Branş \n--------------------------------------------------");
        for (Map.Entry<String,String> w : ogretmenEntrySet) {
            String wKey = w.getKey();
            String wValue = w.getValue();
            String wValueArr[]=wValue.split(", ");
            if (istenenBrans.equalsIgnoreCase(wValueArr[3])){
                System.out.printf("%11s %-11s %-8s %-8s %-10s\n",wKey,wValueArr[0],wValueArr[1],wValueArr[2],wValueArr[3]);
            }
        }
        Thread.sleep(2000);

    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("Aradığınız Öğretmenin Soyismini Giriniz");
        String istenenSoyisim = scan.nextLine();
        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("------------------- SOYİSİM İLE ÖĞRETMEN BULMA ------------------\n" +
                "TC No\t\tİsim\t\tSoyisim  D.Yılı   Branş \n--------------------------------------------------");
        for (Map.Entry<String,String> w : ogretmenEntrySet) {
            String wKey = w.getKey();
            String wValue = w.getValue();
            String wValueArr[]=wValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(wValueArr[1])){
                System.out.printf("%11s %-11s %-8s %-8s %-10s\n",wKey,wValueArr[0],wValueArr[1],wValueArr[2],wValueArr[3]);
            }
        }
        Thread.sleep(2000);

    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        System.out.println(ogretmenlerMap);
        //{13546686113=Ali, Can, 1980, Matematik, 46262464576=Alper, Gözde, 1990, Türkçe, 72831839787=Yeşim, Özkan, 1988, Fizik,
        // 16464684466=Furkan, Karan, 1982, Türkçe, 65344695799=Süreyya, Boran, 1990, Matematik}
        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("------------------- ÖĞRETMEN LİSTESİ ------------------\n" +
                "TC No\t\tİsim\t\tSoyisim  D.Yılı   Branş \n--------------------------------------------------");
        for (Map.Entry<String,String> w : ogretmenEntrySet) {
            String wKey = w.getKey();
            String wValue = w.getValue();
            String wValueArr[]=wValue.split(", ");
            System.out.printf("%11s %-11s %-8s %-8s %-10s\n",wKey,wValueArr[0],wValueArr[1],wValueArr[2],wValueArr[3]);
        }
        Thread.sleep(2000);

    }

}
