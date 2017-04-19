import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Screen implements IDisplayComponent {
	private World world;
	
	public Car(World world) {
		this.world = world;
	}
	/**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }

	public void display() {
		world.addObject((Actor) this, 150, 525);
	} 
}
