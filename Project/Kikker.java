package hellotvxlet;

import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;


public class Kikker extends HComponent{
    
    public int mXPos, mYPos, mWidth, mHeight;
 
    public Kikker(int xpos, int ypos, int width, int height)
    {
        mXPos = xpos;
        mYPos = ypos;
        mWidth= width;
        mHeight = height;
        
        this.setBounds(mXPos, mYPos, mWidth, mHeight);
        
    }
    
    public void paint(Graphics g){
        g.setColor(new DVBColor(100,200,100,179));
        g.fillRect(0, 0, mWidth, mHeight);

    }
    
    public void MoveLeft()
    {
        if(mXPos - (mWidth/2 + 1) > 0 )
        {
         mXPos -= (mWidth/2 + 1);
        }
       
    }
    public void MoveRight(int scene_width)
    {
        if(mXPos + mWidth + (mWidth/2 + 1) < scene_width)
        mXPos += (mWidth/2 + 1);
    }
    public void MoveUp()
    {
        mYPos -= 30;
    }
  
    public void DrawKikker()
    {
        this.setLocation(mXPos, mYPos);
    }
    
}
