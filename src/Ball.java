import java.awt.*;
import javax.swing.*;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;
    private String Color;

    public Ball(int x, int y, int size,int xSpeed,int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Ball(String Color){
        this.Color = Color;
    }
    public int getSize(){
        return size;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return x;
    }
    public void drawBall(Graphics cow)
    {

        cow.fillOval(x,y,size,size);

    }
    public void moveBall()
    {
        x+=ySpeed;
        y+=ySpeed;
    }
    public void checkBounce()
    {
        //if(x >= getWidth())
        //x--;
        if(x>=0)
            x++;
        //if(y>=getHeight())
        //x--;
        if(y>=0)
            x++;

    }
public void moveRight()
{
    x =x +xSpeed;
}
}