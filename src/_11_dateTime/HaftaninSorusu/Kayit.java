package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    Scanner scan = new Scanner(System.in);
    List<Kullanici> kisiler = new ArrayList<Kullanici>();

    public List<Kullanici> kayitAl(){
        System.out.println("Lütfen kullanici adini giriniz : ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());
        kisiler.add(k1);

        return kisiler;
    }

}
