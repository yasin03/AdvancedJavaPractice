package practice_basic_day01;

public class Q05_EscapeSequences {
    public static void main(String[] args) {

         /*
      \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
              \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
              \\: prints a back slash :\ (ters slash) yazdirir
              \': prints single quote :' tek tirnak yazdirir.
              \": prints double quote :"" cift tirnak yazdirir.
     \: backslash
     /:front slash
     */

        //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdiriniz
        // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.
        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdiriniz
        //Soru-4 : "Zaruret" insani
        //         'kasif'  yapar   yazdiriniz
        // sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satir sonra ve satir basindan 1 tab ileride yazilsin.

        System.out.println("\"Hello\", \"World \\ /");
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
        System.out.println("\"Java\" ile hayat çok \'afilli\'");
        System.out.println("\"Zaruret insanı \n\t\'kaşif\' yapar\n\n\n\t\"TechProEd ile java cok kolay ...\"");


    }
    }
