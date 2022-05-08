package _15_Exceptions.Q02;

import java.util.ArrayList;
import java.util.List;

public class Okul {
     /*
      2- fieldları okulAd, maxOgrenciSayisi,
        ArrayList cinsinden Öğrencileri olan bir Okul pojo class create ediniz,
      */
    private String okulAd;
    private int maxOgrenciSayisi;

    public List<Ogrenci> ogrenciList2;
    public static List<Okul> okul = new ArrayList<>();

    public Okul() {
    }

    public Okul(String okulAd, int maxOgrenciSayisi, List<Ogrenci> ogrenciler) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciList2 = ogrenciler;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciList2;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciList2 = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciList2 +
                '}';
    }
}
