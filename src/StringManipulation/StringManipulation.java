package StringManipulation;

public class StringManipulation {
    public static void main(String[] args) {
        String cumle = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String kelime = "alican";

        int ilkKullanim = cumle.lastIndexOf(kelime);
        int ikinciKullanim = cumle.lastIndexOf(kelime,ilkKullanim-1);

        if (ilkKullanim==-1){
            System.out.println("Girilen kelime cümle içinde kullanılmamış");
        }else if (ikinciKullanim==-1){
            System.out.println("Girilen kelime cümle içinde 1 kez kullanılmis");
        }else {
            System.out.println("Girilen kelime cümle içinde 1 den fazla kullanılmis");
        }



        /*int ilkKullanim=cumle.indexOf(kelime);
        int ikinciKullanim = cumle.indexOf(kelime,ilkKullanim+1);

        if (ilkKullanim==-1){
            System.out.println("Girilen kelime cümle içinde kullanılmamış");
        }else if (ikinciKullanim==-1){
            System.out.println("Girilen kelime cümle içinde 1 kez kullanılmis");
        }else {
            System.out.println("Girilen kelime cümle içinde 1 den fazla kullanılmis");
        }*/


    }
}
