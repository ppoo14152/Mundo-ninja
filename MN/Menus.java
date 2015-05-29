import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Universe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Menus extends World
{

    /**
     * Constructor for objects of class Universe.
     * 
     */
      public static GreenfootSound titleSound;
      
    public Menus()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      
        super(800, 600, 1);
        if (this.getClass().getName().equalsIgnoreCase("MenuScreen"))
        {
            addObject(new StartBtn(), 100, 100);
            addObject(new StoryBtn(), 150, 220);
            addObject(new HelpBtn(),  100, 300);
               titleSound = new GreenfootSound("title-theme.mp3");
               titleSound.stop();
        titleSound.setVolume(70);
        titleSound.playLoop();
        }
        else
        {
            addObject(new BackBtn(), 100, 500);
        }
    }
}
