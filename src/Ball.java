import java.awt.*;

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
    public void moveBall(Graphics g)
    {
        x+=xSpeed;
        y+=ySpeed;
    }
    public void checkBounce(Graphics g)
    {
      
        if(x >= 470)
        xSpeed = -xSpeed;
        if(x<=0)
            xSpeed = -xSpeed;
        if(y>= 450)
        ySpeed = -ySpeed;
        if(y<=0)
           ySpeed = -ySpeed;

    }



    public void moveRight()
{
    x =x +xSpeed;
}
}