import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PrintReceipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceipt extends Screen implements IDisplayComponent
{
    private World world;
	
	public PrintReceipt(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
	}

	/**
     * Act - do whatever the PrintReceipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void display() {
    	world.addObject(this, 350, 410);
    }
}
