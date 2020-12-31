import processing.core.PApplet;

import java.util.Vector;

public class processingOop extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    private Vector<Ball> balls = new Vector<Ball>();

    public static void main(String[] args) {
        PApplet.main("processingOop",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        clearScreen();
        System.out.print(1);
        System.out.print(balls);
        for(int postionAndSpeed = 1;postionAndSpeed < 5; postionAndSpeed++){
            balls.add(new Ball(postionAndSpeed,postionAndSpeed));
        }
    }

    @Override
    public void draw() {
        for(int ball = 0;ball < 4; ball++){
            balls.get(ball).moveBall();
        }
    }

    private void clearScreen() {
        background(255);
    }

    private class Ball {

        public static final int START = 0;
        public static final int TOTALPART = 5;
        public static final int DIAMETER = 20;
        private int speedOfBall;
        private int yPosition;
        private int xPosition;

        public Ball(int part, int speedOfBall) {
            this.xPosition = START;
            this.yPosition = HEIGHT * part / TOTALPART;
            this.speedOfBall = speedOfBall;
        }

        public void moveBall(){
            drawBall(xPosition,yPosition,DIAMETER);
            this.xPosition += this.speedOfBall;
        }
    }

    private void drawBall(int xPosition, int yPosition, int diameter) {
        ellipse(xPosition,yPosition,diameter,diameter);
    }
}
