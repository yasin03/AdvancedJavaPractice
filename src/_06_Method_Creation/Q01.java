package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime =scan.next();

        System.out.println(kellimekontrol(kelime));


    }

    private static String kellimekontrol(String kelime) {
        String kalanharfler="";
        if (kelime.startsWith("gh")){
            kalanharfler = kelime;
        }else if (kelime.startsWith("g")){
            kalanharfler= kelime.charAt(0)+kelime.substring(2);
        }else if (kelime.charAt(1)=='h'){
            kalanharfler=kelime.substring(1);
        }
        else {
            kalanharfler=kelime.substring(2);
        }
        return kalanharfler;
    }



}

