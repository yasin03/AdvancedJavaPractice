package _17_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */

    static Random rand = new Random(20);
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listeOrtak = new ArrayList<>();

        list1=arrListHazırla(10,0,20);
        list2=arrListHazırla(5,0,20);


        System.out.println(list1);
        System.out.println(list2);
        listeOrtak=list1;

        // listeOrtak.retainAll(list2);
        // System.out.println("Ortak elemanlar : "+listeOrtak);

        // listeOrtak.removeAll(list2);
        // System.out.println("Farklı elemanlar : "+listeOrtak);


        listeOrtak.addAll(list2);
        System.out.println("Ortak Elemanlar : "+listeOrtak);
        Collections.sort(listeOrtak);
        System.out.println(listeOrtak);
        Collections.reverse(listeOrtak);
        System.out.println(listeOrtak);
    }


    public static int getRandom(int min , int max){

        return (int) (Math.random()*(max-min+1));
    }
    private static ArrayList<Integer> arrListHazırla(int size, int min, int max) {
        ArrayList<Integer> yeniList = new ArrayList<Integer>();

        for (int i=0; i<size; i++) {
            yeniList.add(getRandom(min, max));
        }
        return yeniList;
    }


}
