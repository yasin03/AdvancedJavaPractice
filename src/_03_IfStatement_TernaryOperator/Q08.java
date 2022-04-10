package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kaç adet ürün aldığınızı giriniz : ");

		int adet = scan.nextInt();
		System.out.println("Lütfen ürünün liste fiyatını giriniz : ");
		double fiyat = scan.nextDouble();

		System.out.println("Müşteri Kartınız Varmı? \n Evetse E , Hayırsa H giriniz : ");
		char kart = scan.next().charAt(0);

		if (kart=='E'){
			//karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
			if (adet>=10){
				fiyat=fiyat - (fiyat*0.20);
				System.out.println("fiyat = " + fiyat);
			}else {
				fiyat=fiyat - (fiyat*0.15);
				System.out.println("fiyat = " + fiyat);
			}
		}else if(kart=='H'){
			if (adet>=10){
				fiyat=fiyat - (fiyat*0.15);
				System.out.println("fiyat = " + fiyat);
			}else {
				fiyat=fiyat - (fiyat*0.10);
				System.out.println("fiyat = " + fiyat);
			}
		}
	}

}
