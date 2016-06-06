package hellotvxlet;

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

public class HelloTVXlet implements Xlet, HActionListener, UserEventListener
{
    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug = true;
    
    private HStaticText tekstLabel, GameOverLabel, ScoreLabel;
    
    private MijnTimerTask objTimerTask; 

    
    public void actionPerformed(ActionEvent e){
     //System.out.println(e.getActionCommand());
    
    }
    
    public HelloTVXlet() {
      
    }

    public void initXlet(XletContext context) throws XletStateChangeException
    {
        
      if(debug) System.out.println("Xlet Initialiseren");
      this.actueleXletContext = context;
      
      
      HSceneTemplate sceneTemplate = new HSceneTemplate();
      
      sceneTemplate.setPreference(org.havi.ui.HSceneTemplate.SCENE_SCREEN_DIMENSION, 
              new HScreenDimension(1.0f, 1.0f), org.havi.ui.HSceneTemplate.REQUIRED);
      
      sceneTemplate.setPreference(org.havi.ui.HSceneTemplate.SCENE_SCREEN_LOCATION, 
              new HScreenPoint(0.0f, 0.0f), org.havi.ui.HSceneTemplate.REQUIRED);
     
    
      scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
            
      tekstLabel = new HStaticText("Frog Crossing");
      
      tekstLabel.setLocation(150,-50);
      tekstLabel.setSize(400,250);
      //tekstLabel.setBackground(new DVBColor(255,255,255,179));
      tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      
      GameOverLabel = new HStaticText("Game Over!");
      
      GameOverLabel.setLocation(150,50);
      GameOverLabel.setSize(400,250);
      //tekstLabel.setBackground(new DVBColor(255,255,255,179));
      GameOverLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      GameOverLabel.setVisible(false);

       
      
      
      
      
      objTimerTask = new MijnTimerTask(scene.getWidth());
      
      
      
         int score = objTimerTask.game.mScore;
                
    ScoreLabel = new HStaticText("Score: " + score);
      ScoreLabel.setLocation(450,-50);
      ScoreLabel.setSize(400,250);
      //tekstLabel.setBackground(new DVBColor(255,255,255,179));
      ScoreLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      ScoreLabel.setVisible(true);
      
        scene.add(tekstLabel);
        scene.add(GameOverLabel);
        scene.add(ScoreLabel);
        scene.add(objTimerTask.game.mKikker);
        
        for (int i = 0; i < 12; i++)
        {
           scene.add(objTimerTask.game.mBusArray[i]);
        }
        
        
      
        
        
        
      
    }

    public void startXlet() 
    {
        if(debug) System.out.println("Xlet Starten");
        scene.validate(); 
        scene.setVisible(true);
        Timer timer = new Timer();
        
        EventManager manager = EventManager.getInstance();
        UserEventRepository repository = new UserEventRepository("voorbeeld");
        repository.addKey(org.havi.ui.event.HRcEvent.VK_UP);
        repository.addKey(org.havi.ui.event.HRcEvent.VK_DOWN);
        repository.addKey(org.havi.ui.event.HRcEvent.VK_LEFT);
        repository.addKey(org.havi.ui.event.HRcEvent.VK_RIGHT);
        manager.addUserEventListener(this, repository);
        
        
        
        timer.scheduleAtFixedRate(objTimerTask, 0, 200);
        
        while(!objTimerTask.game.mGameOver)
        {
           // if(objTimerTask.game.spawned) scene.add(objTimerTask.game.busToAdd);
           // if(objTimerTask.game.busToDestroy != null)
            //{
              //  scene.remove(objTimerTask.game.busToDestroy);
              //  scene.invalidate();
           // }
           // scene.validate();
        }       
                if(objTimerTask.game.mGameOver)
                {
                    System.out.println("Game Over!");
                    timer.cancel();
                    objTimerTask.cancel();
                    GameOverLabel.setVisible(true);            
                }
        }


    public void userEventReceived(org.dvb.event.UserEvent e)
    {
        if(!objTimerTask.game.mGameOver)
        {
            if(e.getType() == KeyEvent.KEY_PRESSED)
            {System.out.println("Key Pressed");}
               
            switch(e.getCode())
            {
                case HRcEvent.VK_UP:
                    objTimerTask.game.mKikker.MoveUp();
                    objTimerTask.game.GetPoints(5);
                    ScoreLabel.setTextContent("Score: " + objTimerTask.game.mScore, HState.NORMAL_STATE);
                    break;
                case HRcEvent.VK_DOWN:
                   //Je kan niet achteruit springen
                    break;
                case HRcEvent.VK_LEFT:
                    objTimerTask.game.mKikker.MoveLeft();
                    break;
                case HRcEvent.VK_RIGHT:
                    objTimerTask.game.mKikker.MoveRight(scene.getWidth());
                    break;
            }
            objTimerTask.game.mKikker.DrawKikker();
      
        }
    }



    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}

