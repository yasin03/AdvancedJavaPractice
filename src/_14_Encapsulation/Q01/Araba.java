package _14_Encapsulation.Q01;

public class Araba {

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {
    }

    public Araba(String model, String color, int motor, int year) {
        this.model = model;
        this.renk = color;
        this.motor = motor;
        this.yil = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
