package StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class krediKarti {
    public static void main(String[] args) {
        /*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
                isim soyisim M***** B*******
                kart no **** **** **** 1234
                */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.print("Lütfen soyisminizi giriniz : ");
        String soyad = scan.nextLine();

        System.out.print("Lütfen kart numaranızı yazınız : ");
        String kart = scan.nextLine();

        String isimyeni= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w" , "*");

        String soyadyeni= soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w" , "*");

        String kartyeni = kart.substring(0,4).replaceAll("\\d","*")+" "+kart.substring(4,8).replaceAll("\\d","*")+
                " "+kart.substring(8,12).replaceAll("\\d","*")+" "+kart.substring(12,16);
        System.out.println(isimyeni+" "+soyadyeni+"\n"+kartyeni);
    }
}
