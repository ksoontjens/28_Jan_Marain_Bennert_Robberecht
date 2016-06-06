package hellotvxlet;

import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;


public class Bus extends HComponent
{
    int mXPos, mYPos, mWidth, mHeight, mSpeed;
 
    public Bus(int xpos, int ypos, int width, int height, int speed)
    {
        mXPos = xpos;
        mYPos = ypos;
        mWidth= width;
        mHeight = height;
        mSpeed = speed;
        
        this.setBounds(mXPos, mYPos, mWidth, mHeight);
        
    }
    
    public void paint(Graphics g)
    {
        g.setColor(new DVBColor(200,200,200,200));
        g.fillRect(0, 0, mWidth, mHeight);

    }
    public void MoveBus()
    {
        mXPos+= mSpeed;
    }

    public void DrawBus()
    {
        this.setLocation(mXPos, mYPos);
    }
  }
    

