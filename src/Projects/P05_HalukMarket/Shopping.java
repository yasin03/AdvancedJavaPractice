package Projects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Shopping {
    static double totalPrice;
    static List<Products> product = new ArrayList<Products>();
    static List<Products> chart = new ArrayList<Products>();
    static Scanner scan = new Scanner(System.in);

    public void start() {
        Products p1 = new Products("1", "Domates", "2.10");
        Products p2 = new Products("2", "Patates", "3.20");
        Products p3 = new Products("3", "Biber", "1.50");
        Products p4 = new Products("4", "Soğan", "2.30");
        Products p5 = new Products("5", "Havuç", "3.10");
        Products p6 = new Products("6", "Elma", "1.20");
        Products p7 = new Products("7", "Muz ", "1.90");
        Products p8 = new Products("8", "Çilek", "6.10");
        Products p9 = new Products("9", "Kavun", "4.30");
        Products p10 = new Products("10", "Üzüm", "2.70");
        Products p11 = new Products("11", "Limon", "0.50");
        product.add(p1);
        product.add(p2);
        product.add(p3);
        product.add(p4);
        product.add(p5);
        product.add(p6);
        product.add(p7);
        product.add(p8);
        product.add(p9);
        product.add(p10);
        product.add(p11);

        System.out.println("----------MAİN MARKETE HOŞGELDİNİZ----------");
        System.out.println("Kodu\tÜrün Adı\tFiyatı\n----\t--------\t--------");
        for (Products w : product) {
            System.out.println(w.getProductNo() + "\t\t" + w.getProductName() + "\t" + w.getProductPrice());
        }
        select();
    }

    private void select() {
        System.out.println("\nLütfen almak istediğiniz ürün numarasını giriniz : ");
        String no = scan.next();
        System.out.println("Kaç kilo almak istersiniz : ");
        String kilo = scan.next();

        Products shoppingChart = new Products(no, kilo);
        chart.add(shoppingChart);

        shoppingPrint();

    }

    private void shoppingPrint() {
        System.out.println("Sepetinizdeki Ürünler : ");
        totalPrice=0.0;
        for (Products w:chart) {

            System.out.println(w.getProductWeight()+" kg, "+product.get(Integer.valueOf(w.getProductNo())-1).getProductName() +
                    " : "+(Double.valueOf(product.get(Integer.valueOf(w.getProductNo())-1).getProductPrice())*Double.valueOf(w.getProductWeight())));

            totalPrice+=(Double.valueOf(product.get(Integer.valueOf(w.getProductNo())-1).getProductPrice())*Double.valueOf(w.getProductWeight()));
        }
        System.out.println("Toplam tutar : "+ totalPrice);
        isContinue();
    }

    private void isContinue() {
        System.out.println("Alışverişe devam etmek istiyormusunuz? \nEvet için 'E' Hayır için 'H' giriniz:");
        char result = scan.next().toUpperCase().charAt(0);
        if (result == 'E') {
            select();
        }else if (result == 'H') {
            payment();
        }else {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
            isContinue();
        }
    }

    private void payment() {
        System.out.println("Ödemeniz gereken toplam alışveriş tutarı : "+totalPrice);
        System.out.println("Ödenen tutarı giriniz");
        double pay = scan.nextDouble();
        if (pay<totalPrice){
            System.out.println("Eksik ödeme yaptınız.");
            payment();
        }else if(pay==totalPrice){
            System.out.println("Main Marketi tercih ettiğiniz için teşekkür ederiz");
        }else if (pay>totalPrice){
            System.out.println("Para üstünüz : "+(pay-totalPrice)+"\nMain Marketi tercih ettiğiniz için teşekkür ederiz");
        }
    }
}
