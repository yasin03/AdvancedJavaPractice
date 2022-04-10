package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanici {
    String name;
    LocalDateTime tarih;

    public Kullanici() {
    }

    public Kullanici(String name, LocalDateTime tarih) {
        this.name = name;
        this.tarih = tarih;
    }
}
