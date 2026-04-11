import java.util.Scanner;

public class dongwoo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.println("행운의 숫자: " );
        String luckNum = sc.nextLine();
        System.out.println("금화의 무게: " );
        String goldWei = sc.nextLine();
        System.out.println("보유 포인트: " );
        long p = sc.nextLong();


        int num = Integer.parseInt(luckNum);
        double wei = Double.parseDouble(goldWei);


        System.out.println("행운의 숫자 보상: " + (num * 3));
        System.out.println("금화 무게 보상: " + (wei * 3));
        System.out.println("최종 포인트 보상:" + (p * 3));


    }
}
 /*
            카리스는 평화로운 마법 마을의 시장에 방문했습니다. 마침 시장에서는 1년에 단 한 번 열리는 '3배 뻥튀기 축제'가 한창이다.
            이 축제에서는 촌장님이 특별한 마법 계산기를 통해 참가자들의 자산을 3배로 늘려주는 파격적인 이벤트를 진행하고 있다.

            하지만 이 오래된 마법 계산기에는 작은 특징이 있어서, 참가자들이 제출하는 세 가지 값의 데이터 형태가 제각각으로 입력되고 있다.

                행운의 숫자: 참가자가 직접 양피지에 적어 낸 정수이다. 글씨로 적혀 있어 문자열(String) 형태로 들어온다.

                금화의 무게: 시장의 저울로 측정한 값으로, 소수점이 포함될 수 있다. 이 역시 영수증에 텍스트로 찍혀 있어 문자열(String) 형태로 들어온다.

                보유 포인트: 참가자의 마법 지갑에서 직접 전송된 점수로, 숫자 그 자체인 정수(int) 형태로 들어온다.

            당신은 촌장님의 부탁을 받은 일일 마법 프로그래머다. 마법 계산기에 입력된 세 가지 값을 각각 알맞은 숫자 타입(정수 및 실수)으로 올바르게 변환한 뒤,
            각각 3배로 연산하여 최종 보상 명세서를 출력하는 프로그램을 작성하시오.

            값 범위
                0 <= 행운의 숫자 <= 10000
                0 <= 보유 포인트 <= 1111111111

            -------------------

            입력 예시 1번
            행운의 숫자: 5
            금화의 무게: 3.7
            보유 포인트: 10

            출력 예시 1번
            행운의 숫자 보상: 15
            금화 무게 보상: 11.1
            최종 포인트 보상: 30

            -------------------

            입력 예시 2번
            행운의 숫자: 12
            금화의 무게: 7.9
            보유 포인트: 1111111111

            출력 예시 2번
            행운의 숫자 보상: 36
            금화의 무게 보상: 23.7
            최종 포인트 보상: 3333333333
         */
