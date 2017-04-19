import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PumpNozel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PumpNozel extends Screen implements IDisplayComponent
{	
	private World world;
	
	public PumpNozel(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
	}

	/**
     * Act - do whatever the PumpNozel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    @Override
	public void display() {
		// TODO Auto-generated method stub
		world.addObject((Actor) this, 920, 150);
	}
}
