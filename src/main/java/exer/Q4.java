package exer;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 7; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

