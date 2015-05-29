import greenfoot.*;

/**
 * Write a description of class Ave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ave extends Enemigo
{
    int x=0;
    /**
     * Act - do whatever the Ave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * En este caso el Act de la clase enemigo lo utilizamos como un ciclo, 
     * nos ayuda a incrementar una variable la cual funciona en el metodo cambiarImagen
     * que aparece despues
     */
    public void act() 
    {
        x++;
        move(-8);
        cambiarImagen();
    }    
    /**
     * Este metodo ayuda a cambiar la imagen del enemigo ave, para que mientras
     * va volando se vea un tipo de animacion.
     */
    public void cambiarImagen()
    {
        if(x==5){
            setImage("izq2.png");
            }
            if(x==10){
            setImage("izq3.png");
            }
            if(x==15){
            setImage("izq4.png");
            }
            if(x==20){
            setImage("izq1.png");
            x=0;
            }
        if(getX()<2)
            setLocation(999,50);
    }
}
















