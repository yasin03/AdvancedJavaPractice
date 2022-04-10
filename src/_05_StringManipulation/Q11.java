package _05_StringManipulation;

import java.nio.channels.Pipe;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int pick1=pickName.indexOf('A');
        int pick2=pickName.indexOf('L');
        int pick3=pickName.indexOf('I');
        System.out.println("" +pickName.charAt(pick1)+pickName.charAt(pick2)+pickName.charAt(pick3));



    }

}
