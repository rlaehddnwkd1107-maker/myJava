import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        Scanner dw = new Scanner(System.in);

        int[] nums = new int[12];

        for (int i = 0; i < nums.length; i++) {
            System.out.print((i + 1) + "번째 숫자 입력: ");
            nums[i] = dw.nextInt();
        }

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("가장 큰 값: " + max);

        dw.close();
    }
}