abstract  class Rabbit8{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}
class HouseRabbit8 extends Rabbit8{
    @Override
    void sleep(){
        System.out.println("집도끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit8 extends Rabbit8 {
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit8 hRabbit8 = new HouseRabbit8();
        MountainRabbit8 mRabbit8 = new MountainRabbit8();

        hRabbit8.sleep();
        mRabbit8.sleep();
    }
}
