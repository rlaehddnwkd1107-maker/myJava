import java.util.Scanner;

public class Code09_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];
        float[] fltAry = new float[2];
        float hap = 0;

        System.out.print("숫자: ");
        numAry[0] = s.nextInt();
        System.out.print("숫자: ");
        numAry[1] = s.nextInt();
        System.out.print("숫자: ");
        numAry[2] = s.nextInt();
        System.out.print("숫자: ");
        numAry[3] = s.nextInt();

        System.out.print("소수: ");
        fltAry[0] = s.nextFloat();
        System.out.print("소수: ");
        fltAry[1] = s.nextFloat();



        hap = numAry[0] + numAry[1] + numAry[2] + numAry[3] + fltAry[0] + fltAry[1];
        System.out.println("합계 ==> " + hap);

        s.close();
    }
}
