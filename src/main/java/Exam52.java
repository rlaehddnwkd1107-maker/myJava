import java.util.Scanner;

public class Exam52 {
    public static void main(String[] args){
        Scanner dw = new Scanner(System.in);

        long num;

        System.out.println("숫자를 입력하세요 ==>");
        num = dw.nextLong();

        if ( num % 15 == 0 ){
            System.out.println("3의배수와 5의 배수입니다.");}
        else if ( num % 3 == 0 ){
            System.out.println("3의배수입니다.");}
        else if ( num % 5 == 0 ){
            System.out.println("5의배수입니다.");}
        else {
            System.out.println("두수의 배수가 아닙니다.");}

        dw.close();
    }
}
