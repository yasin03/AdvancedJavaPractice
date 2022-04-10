package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplama için 1 \nÇıkarma için 2 \n" +
                "Bölme için 3 \nÇarpma için 4");

        System.out.println("Hangi işlemi yapmak istiyorsunuz : ");
        int islem = scan.nextInt();

        System.out.println("Lütfen işlem yapmak istediğiniz iki sayıyı giriniz : ");


        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (islem == 1) {
            System.out.println("Toplama işleminin sonucu : " + num1 + " + " + num2+" = " + (num1 + num2));
        }else if (islem == 2) {
            System.out.println("Çıkarma işleminin sonucu : " + num1 + " - " + num2+" = " + (num1 - num2));
        }else if (islem == 3) {
            System.out.println("Bölme işleminin sonucu : " + num1 + " / " + num2+" = " + (num1 / num2));
        }else if (islem == 4) {
            System.out.println("Çarpma işleminin sonucu : " + num1 + " x " + num2+" = " + (num1 * num2));
        }else{
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz!");
        }
    }

}
