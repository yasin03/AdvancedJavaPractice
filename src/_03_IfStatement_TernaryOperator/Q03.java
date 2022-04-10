package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu cm olarak giriniz : ");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu kg olarak giriniz : ");
        double kilo = scan.nextDouble();

        double vke = kilo/((boy/100)*(boy/100));

        if (vke<=20){
            System.out.println("Boyunuz : "+boy+"\nKilonuz : "+kilo+"\nVücuk Kitle Endeksiniz : "+vke);
            System.out.println("oldukca zayifsiniz");
        }else if (vke<=25){
            System.out.println("Boyunuz : "+boy+"\nKilonuz : "+kilo+"\nVücuk Kitle Endeksiniz : "+vke);
            System.out.println("Normal sinirlardasiniz");
        }else if (vke<=30){
            System.out.println("Boyunuz : "+boy+"\nKilonuz : "+kilo+"\nVücuk Kitle Endeksiniz : "+vke);
            System.out.println("Sisman kategorisindesiniz");
        }else if (vke>30){
            System.out.println("Boyunuz : "+boy+"\nKilonuz : "+kilo+"\nVücuk Kitle Endeksiniz : "+vke);
            System.out.println("Obez grubundasiniz.");
        }

    }

}
