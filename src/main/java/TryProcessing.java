import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ballOneX = 0;
    int ballTwoX = 0;
    int ballThreeX = 0;
    int ballFourX = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        //paintWhite();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(ballOneX, HEIGHT / 5, DIAMETER, DIAMETER);
        ballOneX++;
        ellipse(ballTwoX, 2 * HEIGHT / 5, DIAMETER, DIAMETER);
        ballTwoX += 2;
        ellipse(ballThreeX, 3 * HEIGHT / 5, DIAMETER, DIAMETER);
        ballThreeX += 3;
        ellipse(ballFourX, 4 * HEIGHT / 5, DIAMETER, DIAMETER);
        ballFourX += 4;
    }

    private void paintWhite() {
        background(255);
    }
}
