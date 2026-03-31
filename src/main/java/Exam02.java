import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner dw = new Scanner(System.in);

        String a = dw.nextLine();
        String b = dw.nextLine();

        String result = (a + b).toLowerCase().replace(" ", "");

        System.out.println(result);

        dw.close();
    }
}
