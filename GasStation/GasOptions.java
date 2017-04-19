import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasOptions extends Screen implements IDisplayComponent
{
	private World world;
	
	public GasOptions(World world) {
		this.world = world;
	}

	/**
     * Act - do whatever the GasOptions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void display() {
    	world.addObject(this, 725, 400);
    }
}
