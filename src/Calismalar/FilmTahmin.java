package Calismalar;

import java.util.*;

public class FilmTahmin {

/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {
        List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));


        Scanner scan = new Scanner(System.in);
        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int secim = scan.nextInt();
        String film2 = film.get(secim - 1);

        String secilenFilmArr[] = film2.split("");

        int tahmin = 0;
        int hak = secilenFilmArr.length * 2;
        boolean cıkıs = false;

        List<String> secilenFilm = new ArrayList<>();
        for (int i = 0; i < secilenFilmArr.length; i++) {
            secilenFilm.add(i, "-");
        }

        while (cıkıs != true) {

            System.out.println("\nTahmin Hakkınız : " + tahmin + "/" + hak);

            System.out.print("Lütfen bir harf giriniz : ");
            String harf = scan.next().toUpperCase().substring(0, 1);

            for (int i = 0; i < secilenFilmArr.length; i++) {
                if (secilenFilmArr[i].contains(harf)) {
                    secilenFilm.set(i, harf);
                }
            }
            for (String w : secilenFilm) {
                System.out.print(w);
            }
            tahmin++;
            if (!secilenFilm.contains("-")) {
                System.out.println("\nTebrikler "+tahmin+" kerede bildiniz..");
                cıkıs = true;
            }
            if (tahmin == secilenFilmArr.length * 2) {
                System.out.println("\nTahmin hakkınız kalmadı..");
                cıkıs = true;
            }
        }
    }
}

