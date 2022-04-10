package StringManipulation;

import java.util.Scanner;

public class sifre2 {
    public static void main(String[] args) {
/*        Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin

                Ilk harf buyuk harf olmali
                Son harf kucuk harf olmali
                Sifre bosluk icermemeli
                Sifre uzunlugu en az 8 karakter olmali */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sifrenizi giriniz : ");
        String sifre = scan.nextLine();

       /* if ((sifre.contains("\\s"))){
            System.out.println("şifre boşluk içermemeli");
        }else if (sifre.length()<8){
            System.out.println("şifre 8 karakterden büyük olmalı");
        }else if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            System.out.println("şifrenin ilk harfi büyük olmalı");
        }else if ((sifre.charAt(sifre.length()-1)>='a') && (sifre.charAt(sifre.length()-1)<='z')){
            System.out.println("şifrenin son harfi küçük olmalı");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }*/


       if ((!(sifre.contains("\\s"))) && (sifre.length()>=8) && (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') &&
                (sifre.charAt(sifre.length()-1)>='a') && (sifre.charAt(sifre.length()-1)<='z')  ){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }
}
