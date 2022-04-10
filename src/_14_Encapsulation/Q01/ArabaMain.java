package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda = new Araba();
        Araba toyota = new Araba("Corolla","Gri",1600,2010);
        Araba volkswagen = new Araba("Passat","Siyah",1400,2012);

        System.out.println(toyota);
        System.out.println("Seçtiğiniz araç markası : "+volkswagen.getModel()+", rengi : "+
                volkswagen.getRenk()+", motor hacmi : "+volkswagen.getMotor()+
                ", üretim yılı : "+volkswagen.getYil());


    }
}
