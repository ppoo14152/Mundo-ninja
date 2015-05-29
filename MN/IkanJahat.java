import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanJahat extends Actor
{
    int dy = -20;
    static final int g = 2;
    int permiteSalto = 0;
    public int totaljp = -1, niv=1;
    public int var = 0;
    public int pul = 0, ave =0, pico=0;

    Score score_field = new Score("Score:" + totaljp);
    Nivel nivel_field = new Nivel("Nivel:" + niv);
    
    /**
     * En el metodo act se identifica si el ninja esta sobre un palo y si esta sobre uno
     * puede saltar si no es asi no le permite saltar, aqui tambien */
    public void act() 
    {
         if(siTocaBarra() == true)
         {
         setLocation(getX(),getY());
         permiteSalto=1;
         if(var==0)
         {
         totaljp++;
         var=1;
        }
         score_field.setText("Score: " +totaljp);
         nivel_field.setText("Nivel: " +niv);
        // brincar();
        }
              //brincar();
              
        if(permiteSalto==1)
         brincar();    
         niveles();
         if(!siTocaBarra()== true)
         {
         caer();
         var=0;
         checaPierde(); 
      
        }
    }   

    public void brincar()
    {
        Actor Score;
        getWorld().addObject(score_field, 120, 30);
        getWorld().addObject(nivel_field, 500, 30);

        if(Greenfoot.isKeyDown("space")== true)
        {     
           dy=-20; 
           setLocation(getX(), getY()+dy);
           Greenfoot.playSound("eating.wav");
        }
         dy = dy + g;
    }
    
        public void caer()
    {
         //brincar();
        setLocation(getX(), getY()+dy);
        dy = dy + g;
        if(!Greenfoot.isKeyDown("space")== true)
            permiteSalto=0;
    }
    
        public boolean siTocaBarra(){
        if(isTouching(Barra.class))
            return true;
        else
            return false;
    }
    
     public int getXNinja()
    {
        return this.getX();
    }
    
    public int getYNinja()
    {
        return this.getY();
    }
    
        public void checaPierde()
    {
        if(isTouching(Ola.class)){
            getWorld().addObject(new gameOver(),400,300);
            Greenfoot.stop();
            Greenfoot.playSound("loose.mp3");
        }
        if(isTouching(Pulpo.class)){
            getWorld().addObject(new gameOver(),400,300);
            Greenfoot.stop();
            Greenfoot.playSound("loose.mp3");
        }
            
        if(isTouching(Ave.class)){
            getWorld().addObject(new gameOver(),400,300);
            Greenfoot.stop();
            Greenfoot.playSound("loose.mp3");
        }
        
        if(isTouching(Picos.class)){
            getWorld().addObject(new gameOver(),400,300);
            Greenfoot.stop();
            Greenfoot.playSound("loose.mp3");
        }
    }
    
       public void niveles()
       {
           Pulpo pu1 = new Pulpo();
           Ave a1 = new Ave(); 
           Picos p1 = new Picos();
           
           if(totaljp == 3 && pul == 0)
           {
               getWorld().addObject(pu1,10,570);
               pul=1;
               niv++;
           }
           
           if(totaljp == 6 && ave == 0)
           {
               getWorld().addObject(a1,999,50);
               ave=1;
               niv++;
           }
           
           if(totaljp == 9 && pico == 0)
           {
               getWorld().addObject(p1,400,10);
               pico=1;
               niv++;
           }
           
        }

    }

        