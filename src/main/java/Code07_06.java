class Rabbit{
    String shape;
    int xPos;
    int yPos;


    Rabbit(){
        shape = "토끼";
    }
    void setPosition(int x, int y){
        xPos = x;
        yPos = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        Rabbit rabbit = new Rabbit();

        System.out.printf("토끼 객체의 기본모양은 [%s]입니다.", rabbit.shape);
    }
}
