import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Esta clase define el boton de inicio del juego.
 */
public class StartBtn extends Buttons
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //run the Buttons class's act method and pass the name of this class to it.
        super.act(this.getClass().getName());
         Menus.titleSound.playLoop();
    }    
}
