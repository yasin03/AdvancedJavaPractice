package StringManipulation;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
/*        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        Kullanicidan
        bir sifre girmesini isteyin
        Eger
        ilk harf buyuk harf ise “A" olup olmadigini kontrol edin Ilk harf A ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
                Eger
        ilk harf kucuk harf ise “z" olup olmadigini kontrol edin Ilk harf z ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz : ");
        String sifre = scan.nextLine();

        char ilkharf = sifre.charAt(0);

        if (ilkharf>='A' && ilkharf<='Z'){
            if (ilkharf=='A'){
                System.out.println("aGecerli Sifre");
            }
            else {
                System.out.println("aGecersiz Sifre");
            }
        }else if (ilkharf>='a' && ilkharf<='z'){
            if (ilkharf=='z'){
                System.out.println("zGecerli Sifre");
            }
            else {
                System.out.println("zGecersiz Sifre");
            }
        }else {
            System.out.println(" Hatalı şifre girdiniz ");

        }
    }
}
