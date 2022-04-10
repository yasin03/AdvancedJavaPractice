package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        int sayac = 0;

        for (int i = 2; i < 100; i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    kontrol++;
                    break;
                }
            }
            if (kontrol==0){
                System.out.print(i+" ");
            }
        }

    }
}
