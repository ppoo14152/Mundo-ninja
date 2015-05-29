import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ola extends Actor
{
    /**
     * Act - do whatever the Ola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int dir;
    public void act() 
    {
         mover(580,575);
    }    
    
    public void mover(int y1, int y2)
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
            setLocation(getX(), getY() + 1);
        }
        if(dir == 1)
        {
            setLocation(getX(), getY() - 1);
        }
       
    }
}
