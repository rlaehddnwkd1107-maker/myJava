import java.util.Scanner;

public class dongwoo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호입력(-직접입력): ");
        String in = sc.nextLine();


        String f = in.substring(0, 6);
        String b = in.substring(7);
        String c = in.substring(7, 8);


        System.out.println("앞자리: " + f);
        System.out.println("뒷자리: " + b);
        System.out.println("성별코드: " + c);

        sc.close();
    }
}