import java.util.Scanner;

public class dongwoo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;

        System.out.println("년도(4자리) 한칸뛰고 월 입력하세요");

        year = sc.nextInt();
        month = sc.nextInt();

            switch (month) {
                case (1),(3),(5),(7),(8),(10),(12):
                    System.out.print("31일입니다.");
                    break;
                case (4),(6),(9),(11):
                    System.out.println("30일입니다.");
                    break;
                case (2):
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        System.out.println("29일입니다.");
                    } else {
                        System.out.println("28일입니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 월을 입력했습니다.");
            }
        sc.close();
    }
}