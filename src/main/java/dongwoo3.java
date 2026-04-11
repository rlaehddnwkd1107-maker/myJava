import java.util.Scanner;

public class dongwoo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시: ");
        int h = sc.nextInt();
        System.out.print("분: ");
        int m = sc.nextInt();
        System.out.print("초: ");
        int s = sc.nextInt();
        System.out.print("영상길이(초): ");
        int l = sc.nextInt();

        int st = (h * 3600) + (m * 60) + s ;
        int vc = st / l;
        int tt = st % vc;

        if(tt <= vc * 0.5) {
            vc++;

        }
        System.out.print("시청 가능한 영상 개수: " + vc);

        sc.close();


    }
}
