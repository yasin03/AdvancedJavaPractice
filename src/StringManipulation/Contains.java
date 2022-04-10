package StringManipulation;

public class Contains {
    public static void main(String[] args) {
        String mail="abcd@gmail.com";
        String aranan="@gmail.com";

        Boolean sonuc= mail.contains(aranan);

        if (!mail.contains(aranan)){
            System.out.println("Lütfen gmail adresi giriniz.. ");
        }else if (mail.lastIndexOf(aranan)==(mail.length()-aranan.length())){
            System.out.println("Email adresiniz kaydedildi.");
        }else {
            System.out.println("Lütfen yazımı kontrol ediniz");
        }

        System.out.println(mail.endsWith("@gmail.com"));
    }
}
