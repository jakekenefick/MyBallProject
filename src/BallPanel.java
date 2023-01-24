import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Creating my own Panel class that inherits from JPanel
public class BallPanel extends JPanel
{
    int x = 80;// variable to control the x
    int xAdd = 1; // variable to control how far to move each time
    int y = 80;
    int yAdd = 1;

    public BallPanel()
    {
        setPreferredSize(new Dimension(400,400));
    }
    int i = 0;
        while(i < 21){
    Ball b = new Ball((int)(Math.random()*300)+1,(int)(Math.random()*300)+1,(int)(Math.random()*40)+1,(int)(Math.random()*.25)+1,(int)(Math.random()*.25)+1);
    i++;


}


    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package
    protected void paintComponent(Graphics g)
    {

        // calling the paintComponent method I overroad
        Ball y = new Ball(20,20,20,20,30);

        super.paintComponent(g);
        y.drawBall(g);
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
             System.out.println(e.getKeyCode());
             int z = e.getKeyCode();
                     if(z == 68)
                     {
                         y.moveRight();
                     }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        try
        {
            Thread.sleep(50);

        }
        catch(Exception blah)
        {
            System.out.println(blah.toString());
        }

        repaint(); // calls paintComponent again


        // If the ball hits the right edge change what we add each time



        // update the location of the ball

        // pause the program






    }



}
