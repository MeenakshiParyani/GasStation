import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends GasStation
{
    
    GreenfootImage gi = getImage();
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Buttons(int x, int y, Color color, String text){
        gi.scale( x, y ) ; 
        gi.clear();
        gi.setColor(color);
        gi.fill();
        gi.setColor(Color.BLACK);
        gi.drawString(text,  40, 25);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("sounds/a.wav");
        }
        
    }    
}
