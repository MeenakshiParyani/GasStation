import java.util.ArrayList;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Screen implements IDisplayComponent
{
	GreenfootImage gi = getImage();
	private List<IDisplayComponent> cards = new ArrayList();
	private World world;
	/**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public Card(World world) {
		this.world = world;
	}
	
    public void act() 
    {
            int mouseX,mouseY ;
        
        if (Greenfoot.mouseDragged(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseX= mouse.getX();
            mouseY=mouse.getY();
            setLocation(mouseX,mouseY);
        }
    
    }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int x = 100;
		for (IDisplayComponent card : cards) {
			world.addObject((Actor) card, 100, x + 50);
			x += 100;
		}
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		cards.add( c );
	}    
}
