import processing.core.PApplet;

public class processingProcedural extends PApplet {

    public static final int HEIGHT = 640;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 20;
    int firstCircleMover = 0;
    int secondCircleMover = 0;
    int thirdCircleMover = 0;
    int fourthCircleMover = 0;

    public static void main(String[] args) {
        PApplet.main("processingProcedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        drawCircle(WIDTH/5,HEIGHT/5,DIAMETER);
        clearScreen();
    }

    @Override
    public void draw() {
        drawCircle(firstCircleMover,HEIGHT/5,DIAMETER);
        drawCircle(secondCircleMover,HEIGHT*2/5,DIAMETER);
        drawCircle(thirdCircleMover,HEIGHT*3/5,DIAMETER);
        drawCircle(fourthCircleMover,HEIGHT*4/5,DIAMETER);
        firstCircleMover += 1;
        secondCircleMover += 2;
        thirdCircleMover +=3 ;
        fourthCircleMover +=4 ;
    }

    private void clearScreen() {
        background(255);
    }

    private void drawCircle(int xPos, int yPos, int diameter) {
        ellipse(xPos, yPos, diameter, diameter);
    }
}
