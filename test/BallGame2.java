import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("src\\img\\ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("src\\img\\desk.jpg");

    double x = 100;
    double y = 100;

    double PI = Math.PI;
    double degree = PI / 3;

    public void paint(Graphics g){
        System.out.println("use paint func");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        x = x + 50 * Math.cos(degree);
        y = y + 50 * Math.sin(degree);

        if(y > 501 - 40 - 30 || y < 40 + 40){
            degree = - degree;
        }

        if(x < 40 || x > 856 - 40 - 30){
            degree = PI - degree;
        }

    }

    void launchFrame(){
        setSize(856, 501);
        setLocation(50, 50);
        setVisible(true);

        while (true){
            repaint();
            try{
                Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }
}
