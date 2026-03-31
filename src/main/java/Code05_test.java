import java.util.Scanner;

public class Code05_test {
    public static void main(String[] args){
        Scanner dw = new Scanner(System.in);
        long num;

        num = dw.nextLong();

        if(num%2 == 0){
            System.out.println("짝수입니다.");

        }
        else{
            System.out.println("홀수입니다.");
        }

        dw.close();
    }
}
