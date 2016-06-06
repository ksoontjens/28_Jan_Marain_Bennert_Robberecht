/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.*;
import java.util.Random;


import java.awt.Rectangle;

/**
 *
 * @author student
 */
public class Game 
{
    public Kikker mKikker;
    public Bus[] mBusArray = new Bus[12];
    public boolean mGameOver = false;
    public boolean spawned = false;
    public int mScore = 0;
    private Random rand = new Random();
    
    public Game()
    {
        CreateObjects();
    }
    
    public void CreateObjects()
    {   
        int i;
        for (i  = 0; i < 12; i++)
        {
            
            switch(i)
            {
                case 0:
                case 1:
                    mBusArray[i] = new Bus((rand.nextInt(500 - 50) + 1) +50 , 440, 100, 50, (rand.nextInt(25 - 5)+1 ) + 5);
                    break;
                case 2:
                case 3:
                    mBusArray[i] = new Bus((rand.nextInt(500 - 50) + 1) +50 , 380, 100, 50, (rand.nextInt(25 - 5)+1 ) + 5);
                    break;
                case 4 :
                case 5:
                    mBusArray[i] = new Bus((rand.nextInt(500 - 50) + 1) +50 , 320, 100, 50, (rand.nextInt(25 - 5)+1 ) + 5);
                    break;
                case 6:
                case 7:
                    mBusArray[i] = new Bus((rand.nextInt(500 - 50) + 1) +50 , 260, 100, 50, (rand.nextInt(25 - 5)+1 ) + 5);
                    break;
                case 8:
                case 9:
                    mBusArray[i] = new Bus((rand.nextInt(500 - 50) + 1) +50 , 200, 100, 50, (rand.nextInt(25 - 5)+1 ) + 5);
                    break;
                case 10:
                case 11:
                    mBusArray[i] = new Bus((rand.nextInt(500 - 50) + 1) +50 , 140, 100, 50,(rand.nextInt(25 - 5)+1 ) + 5);
                    break;
            }
            mBusArray[i].DrawBus();
            
        }
        
               
        //   mBus = new Bus(300,200, 100, 50, 1);
  
        mKikker = new Kikker(300, 500, 25, 50);
    }
   public void GetPoints(int pointsToAdd)
   {
    mScore += pointsToAdd;
   }
    
    public boolean CheckHit(int sceneWidth)
    {
        Rectangle rectangleFrog = mKikker.getBounds();
        
        for(int i = 0; i<12; i++)
        {
        
                if(mBusArray[i] != null)
                {
                        Rectangle rectangleBus = mBusArray[i].getBounds();
                        if(rectangleFrog.intersects(rectangleBus))
                            {
                                mGameOver = true;
                                return mGameOver;
                            }
                        else if (mBusArray[i].getBounds().x + mBusArray[i].mWidth >= sceneWidth)
                        {
                            mBusArray[i].mXPos =  (0 - mBusArray[i].mWidth);
                        }
                }
                            
        }
        if (rectangleFrog.getLocation().y < 100)
                        {
                            mKikker.mXPos = 300;
                            mKikker.mYPos = 560;
                        }
        
        
        return mGameOver;
    }
    
    public void MoveBusses()
    {
        for(int i = 0; i < 12; i++)
        {
            mBusArray[i].MoveBus();
        }
    }
        
        
 
}
    





