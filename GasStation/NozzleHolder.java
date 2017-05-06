import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NozzleHolder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NozzleHolder extends Screen
{
    /**
     * Act - do whatever the NozzleHolder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	
	private World world;
	
	public NozzleHolder(World world) {
		this.world = world;
	}

    public void act() 
    {
        // Add your action code here.
    }   
    
    
    public void display() {
    	this.world.addObject(this, 900, 150);
    }
}
