package practice_basic_day04;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        boslukHaricCharacter(str);

    }

    private static void boslukHaricCharacter(String str) {
        String yenistr=str.replaceAll("\\s","");
        String[] array = {};
        array=yenistr.split("");

        System.out.println(array.length);
    }
}
