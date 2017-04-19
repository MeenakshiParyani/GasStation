import java.util.ArrayList;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWashArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashArea extends Screen implements IDisplayComponent
{
	private World world;
	
	public CarWashArea(World world) {
		this.world = world;
	}
	/**
     * Act - do whatever the CarWashArea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void display() {
		world.addObject((Actor) this, 900, 525);
	}
}
