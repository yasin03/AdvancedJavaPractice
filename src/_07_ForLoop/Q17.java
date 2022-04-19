package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        
        int row = 5;
        for (int i = row; i >0 ; i--) {
            for (int j = 0; j < row-i ; j++) {
                System.out.print("  ");
            }
            for (int t = 0; t < 2*i-1 ; t++) {
                System.out.print(t+" ");
            }
            System.out.println();
        }

    }
}


