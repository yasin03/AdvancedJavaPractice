package Projects.Z_HastaneOtomasyon;

public class Hasta {
    private String hastaAdi;
    private String hastaSoyadi;
    private int hastaId;

    public Hasta() {
    }

    public Hasta(String hastaAdi, String hastaSoyadi, int hastaId) {
        this.hastaAdi = hastaAdi;
        this.hastaSoyadi = hastaSoyadi;
        this.hastaId = hastaId;
    }

    public String getHastaAdi() {
        return hastaAdi;
    }

    public void setHastaAdi(String hastaAdi) {
        this.hastaAdi = hastaAdi;
    }

    public String getHastaSoyadi() {
        return hastaSoyadi;
    }

    public void setHastaSoyadi(String hastaSoyadi) {
        this.hastaSoyadi = hastaSoyadi;
    }

    public int getHastaId() {
        return hastaId;
    }

    public void setHastaId(int hastaId) {
        this.hastaId = hastaId;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "hastaAdi='" + hastaAdi + '\'' +
                ", hastaSoyadi='" + hastaSoyadi + '\'' +
                ", hastaId=" + hastaId +
                '}';
    }
}
