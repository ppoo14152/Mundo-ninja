import greenfoot.*; 

import java.awt.Color;
import java.applet.*;
import java.awt.*;

public class Score extends Actor

{
Font font1=new Font("Helvetica",Font.BOLD,35);
  public Score(String text)
  {
      GreenfootImage img_field = new GreenfootImage(180,50);
      img_field.setFont(font1);
      img_field.setColor(Color.red);
      img_field.drawString(text, 0, 55);
      setImage(img_field);
   }
      
  public void setText(String text)
   {
       GreenfootImage img_field = getImage();
       img_field.clear();
       img_field.drawString(text, 0, 45);
   }
}