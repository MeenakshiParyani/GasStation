import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardScanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardScanner extends Screen implements IDisplayComponent
{
	private World world;
	
	public CardScanner(World world) {
		this.world = world;
	}

	/**
     * Act - do whatever the CardScanner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

	@Override
	public void display() {
		world.addObject(this, 550, 380);
	}
}
