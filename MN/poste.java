import greenfoot.*;

/**
 * Write a description of class poste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poste extends Actor
{
    public int PIPE_SPEED = 0;
    int x, y;
    public Barra barra;
    public GreenfootImage pImage, bImage;
    
    public poste()
    {
        x = 0;
        y = 0;
        pImage = this.getImage();  
    }
    
    public void addBarra()
    {
        barra = new Barra();
        bImage = barra.getImage();
        int x = this.getX();
        int y = this.getY() - pImage.getHeight()/2;
        getWorld().addObject(barra, x , y);
    }
   
   public void act()
   {
 
     eliminarFinal();
   }
   
   /**
    * metodo que funciona para ir moviendo los postes o pipas
    */
   public void moverPIPES()
   {
       setLocation( getX() + PIPE_SPEED , getY());     
       barra.setLocation( barra.getX() + PIPE_SPEED ,barra.getY());
    }
    
    /**
     * Metodo que elimina los postes al llegar al final de la pantalla
     */
   public void eliminarFinal()
   {
       if(getX() == 0)
      {
        int rand = Greenfoot.getRandomNumber(150);
        this.setLocation(getWorld().getWidth() + pImage.getWidth()/2, getWorld().getHeight()/2 + pImage.getHeight() - rand);
        barra.setLocation(getWorld().getWidth() + bImage.getWidth()/2, this.getY() - pImage.getHeight()/2);
      } 
    }
    
    public void detener()
    {
       PIPE_SPEED = 0;
       setLocation( getX() + PIPE_SPEED , getY());     
       barra.setLocation( barra.getX() + PIPE_SPEED ,barra.getY());
    }
    
    public void mover()
    {
       PIPE_SPEED = -5;
       setLocation( getX() + PIPE_SPEED , getY());     
       barra.setLocation( barra.getX() + PIPE_SPEED ,barra.getY());
    }

}
