public class Exam04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int star;

            if (i <= 4) {
                star = i;
            } else {
                star = 8 - i;
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}