package exer;

public class Q2 {
    public static void main(String[] args) {
//        for (int i= 1; i <= 4; i++) {
//
//            switch (i) {
//                case 1:
//                    System.out.print("   ");
//                    break;
//                case 2:
//                    System.out.print("  ");
//                    break;
//                case 3:
//                    System.out.print(" ");
//                    break;
//                default:
//                    System.out.print("");
//                    break;
//
//            }
//
//
//            for (int j = 1; j <= (i * 2) -1 ; j++ ) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//
//}
//        int k = 4;
//        for (int j = 1; j <= k; j++) {
//            String str = "";
//
//            for (int i = 0; i <k-j ; i++)
//              str += " ";
//            for (int i = 0; i <j*2-1; i++)
//              str += "*";
//
//            System.out.println(str);
//        }
//    }
//}
        for (int i= 1; i <= 4; i++) {
            for(int j=4; j>i; j--)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) -1 ; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}