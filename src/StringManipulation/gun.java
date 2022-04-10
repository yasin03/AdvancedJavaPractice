package StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class gun {
    public static void main(String[] args) {
//        Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
//        isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
//        gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz : \nPazartesi \nSalı \nÇarşamba \nPerşembe \nCuma \nCumartesi \nPazar");
        String gun = scan.nextLine().toLowerCase();

        String ilkHarf = gun.substring(0,1);
        String ikinciHarf = gun.substring(1,2);
        String ucuncuHarf = gun.substring(2,3);

         if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("çarşamba")||gun.equals("perşembe")||gun.equals("cuma")||gun.equals("cumartesi")||gun.equals("pazar")){
             System.out.println(ilkHarf.toUpperCase()+ikinciHarf+ucuncuHarf);
         }else {
             System.out.println("Gecerli gun ismi giriniz");
         }



    }
}
