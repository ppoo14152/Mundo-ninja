import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    int pipeCounter = 0;
    int NinjaTocando = 0;
    public GreenfootImage nImage, pImage;
    public IkanJahat n1;
    public poste p1, p2, p3, p4;
    
   // public Score score_field;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
          prepare();
  }
        
  
  public void act()
    {
                if(!n1.siTocaBarra())
        {
            p1.mover();
            p2.mover();
            p3.mover();
            p4.mover();
        }
        else
        {
            p1.detener();
            p2.detener();
            p3.detener();
            p4.detener();
        }
        
    }
    
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
         n1 = new IkanJahat();
       
        p1 = new poste();
        p2 = new poste();
        p3 = new poste();
        p4 = new poste();
        Ola w1 = new Ola();
        n1 = new IkanJahat(); 
        nImage = n1.getImage();
        pImage = p1.getImage();
        addObject(n1, 200, 300);
        Ola2 w2 = new Ola2();
        Ola3 w3 = new Ola3();
        //Pulpo pu1 = new Pulpo();
        Barra b1 = new Barra();
        Barra b2 = new Barra();
        Barra b3 = new Barra();
        Barra b4 = new Barra();
        //Ave a1 = new Ave();  
        gameOver go= new gameOver();

        addObject(w1, 500, 570);
        int varX = n1.getXNinja();
        int varY = n1.getY() + nImage.getHeight()/2 + pImage.getHeight()/2;
        addObject(p1,varX ,varY );
        p1.addBarra();
        addObject(p2,varX +200 , getHeight()/2  - Greenfoot.getRandomNumber(150) + 200);
        p2.addBarra();
        addObject(p3,varX +450 , getHeight()/2  - Greenfoot.getRandomNumber(150) + 200);
        p3.addBarra();
        addObject(p4,varX + 750 , getHeight()/2  - Greenfoot.getRandomNumber(150) + 200);
        p4.addBarra();
        
       // addObject(a1,999,50);
        
        addObject(w2, 485, 588);
       // addObject(pu1,10,570);
        addObject(w3, 500, 628);
    }
    
        private void createPipes()
    {
                poste p1 = new poste();
        
        GreenfootImage image = p1.getImage();
        addObject (p1,getWidth(), getHeight()/2 + image.getHeight() - Greenfoot.getRandomNumber(100));
        p1.addBarra();
       
    }

}

