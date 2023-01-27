import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

// Creating my own Panel class that inherits from JPanel
public class BallPanel extends JPanel
{
    int x = 80;// variable to control the x
    int xAdd = 1; // variable to control how far to move each time
    int y = 80;
    int yAdd = 1;
    ArrayList<Ball> balls = new ArrayList<Ball>(20);
    public BallPanel()
    {
        int i = 0;
        Ball b = null;
        while (i < 21) {
            b = new Ball((int) (Math.random() * 300) + 1, (int) (Math.random() * 300) + 1, (int) (Math.random() * 40) + 1, (int) (Math.random() * .25) + 1, (int) (Math.random() * .25) + 1);
            i++;
            balls.add(b);
        }
        setPreferredSize(new Dimension(400,400));
    }






    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package
    protected void paintComponent(Graphics g) {

        // calling the paintComponent method I overroad

            int z = 0;
            while(z <21) {
             super.paintComponent(g);
                balls.drawBall();
                setFocusable(true);
            }
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int z = e.getKeyCode();
                if (z == 68) {
                   // balls.moveRight();
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        try {
            Thread.sleep(50);

        } catch (Exception blah) {
            System.out.println(blah.toString());
        }

        repaint(); // calls paintComponent again


        // If the ball hits the right edge change what we add each time


        // update the location of the ball

        // pause the program


    }



}
