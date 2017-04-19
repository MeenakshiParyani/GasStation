import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends GasStation
{
    
    public Buttons(World world) {
		super(world);
		// TODO Auto-generated constructor stub
	}
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("sounds/a.wav");
        }
        
    }    
}
