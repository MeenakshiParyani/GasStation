import java.util.ArrayList;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor implements IDisplayComponent
{
    private boolean flag = true;
	private List<IDisplayComponent> components = new ArrayList<>();
	/**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    	if(flag) {
    		flag = false;
    		display();
    	}
    }
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
    }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (IDisplayComponent component : components) {
			component.display();
		}
	}
}
