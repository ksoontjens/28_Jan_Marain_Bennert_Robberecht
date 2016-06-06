/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.TimerTask;
import javax.tv.xlet.*;
import javax.tv.xlet.*;
import org.havi.ui.*;
import org.dvb.ui.*;
import org.dvb.event.*;
import java.awt.event.*;
import org.havi.ui.event.*;
import java.util.Timer;
import java.util.*;
import java.lang.Object;
import java.lang.Thread;


public class MijnTimerTask extends TimerTask {
    private int scenewidth;
    public MijnTimerTask(int Scenewidth)
    {
    scenewidth = Scenewidth;
    }
    public Game game = new Game();
    public void run()
    {
         
       System.out.println("Timer Tick");
        
  
        if(game.CheckHit(scenewidth))
        {
           System.out.println("Game Over");
           this.cancel();
        }
        for(int i = 0; i < 12; i++ )
        {
            game.mBusArray[i].MoveBus();
            game.mBusArray[i].DrawBus();
        }
       

    }
    
    public void AddToScene(HScene scene)
    {
       
    }
}

