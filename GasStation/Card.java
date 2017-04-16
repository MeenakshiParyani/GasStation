import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
	GreenfootImage gi = getImage();
	/**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	
	public Card(int x, int y, Color color, String text){
        gi.scale( x, y ) ; 
        gi.clear();
        gi.setColor(color);
        gi.fill();
        gi.setColor(Color.WHITE);
        gi.drawString(text,  25, 45);
    }
	
    public void act() 
    {
        // Add your action code here.
    }    
}
