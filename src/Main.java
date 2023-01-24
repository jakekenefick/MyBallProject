import javax.swing.*;
import java.awt.*;
public class Main
{
    public static void main(String[]args)
    {
      System.out.println("Made a comment in replit");
      System.out.println("Made a comment in intelJ");
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        //DrawPanel myPanel = new DrawPanel();
        BallPanel bPanel = new BallPanel();
        // myFrame.add(myPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);
  




    }
}