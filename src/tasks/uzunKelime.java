package tasks;

public class uzunKelime {
    /*
     * Kullanicidan gelen cumleyi parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        String str = "Kullanicidan.. gelen?? cumleyi,,,,, parametre olarak alan";

        System.out.println(LongestWord(str));

    }

    private static String LongestWord(String str) {
        System.out.println(str);
        str=str.replaceAll("[^a-z A-Z_0-9]","");
        System.out.println(str);
        String[] words = str.split(" ");
        int max = words[0].length();
        String word="";
        for (int i = words.length - 1; i >= 0; i--) {
            max = Math.max(max, words[i].length());
        }
        for (int i= words.length-1; i>=0; i--) {
            if (words[i].length()==max) word = words[i];
        }
        return word;
    }
}
