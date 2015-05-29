import greenfoot.*; 
/**
 * Esta clase es la que controla los botones que aparecen en el menu principal
 */
public class Buttons extends Actor
{
    /**
     * Este metodo realiza distintas funciones
     * Coloca las imagenes de los botones en la pantalla
     * Checa si algun boton ha sido presionado y si es asi te envia a la pantalla correspondiente
     */
    public void act(String buttonName) 
    {
       
        if (Greenfoot.mouseMoved(this)) {
            setImage(buttonName + "_over.png");
        } else if (Greenfoot.mouseMoved(null)) {
            setImage(buttonName + ".png");
        }
        if (Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
        }
        if (Greenfoot.mouseClicked(null) || Greenfoot.mouseDragEnded(null)) {
            setImage(buttonName + ".png"); 
        }
        if (Greenfoot.mouseClicked(this)) {
            setImage(buttonName + ".png");
            Greenfoot.delay(5); 
            if      (buttonName.equalsIgnoreCase("StartBtn")) Greenfoot.setWorld(new Level1());
            else if (buttonName.equalsIgnoreCase("StoryBtn")) Greenfoot.setWorld(new StoryScreen());
            else if (buttonName.equalsIgnoreCase("HelpBtn"))  Greenfoot.setWorld(new HelpScreen());
            else if (buttonName.equalsIgnoreCase("BackBtn"))  Greenfoot.setWorld(new MenuScreen());
        }
    }
}