import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Esta clase define el boton de regreso para cuando entras a un menu
 */
public class BackBtn extends Buttons
{
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //run the Buttons class's act method and pass the name of this class to it.
        super.act(this.getClass().getName());
          Menus.titleSound.stop();
    }    
}
