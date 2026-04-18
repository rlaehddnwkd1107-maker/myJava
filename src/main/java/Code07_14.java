class Rabbit2 {
    private String shape;
    private int xPos;
    private int yPos;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape(){
        return this.shape;
    }

    public void setPosition(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    public int getX(){
        return this.xPos;
    }
    public int getY(){
        return this.yPos;
    }
}