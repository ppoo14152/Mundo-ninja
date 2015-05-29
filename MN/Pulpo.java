import greenfoot.*;

/**
 * Write a description of class Pulpo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pulpo extends Enemigo
{
    int dir=0;
    int saltoCont = 0;
    int velmov = 5;
    int dy= -25;
    int g=2;
    /**
     * Act - do whatever the Pulpo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        move(velmov);
        if(getX()==210){
        velmov=0;
        salta(570,150);
       }
       if(getX()==750)
         velmov=-10;
       /*if(!Greenfoot.isKeyDown("space")== true)
        setLocation(getX()+1,getY());
        */
       if(isTouching(IkanJahat.class)){
            getWorld().addObject(new gameOver(),400,300);
            Greenfoot.stop();
        }
     
    }    
    
    public void salta(int y1, int y2)
    {
      
        if(getY() == y1)
        {
            dir=1;
        }
        if(getY() == y2)
        {
            dir=0;
        }
        if (dir == 0)
        {
            setLocation(getX(), getY() - dy);
        }
        if(dir == 1)
        {
            setLocation(getX(), getY() + dy+1);
        }
        if(getY()==570){
            setLocation(220,570);
            velmov=10;
            dy=-25;
        }
        dy= dy+g;
            
    }
    
}
