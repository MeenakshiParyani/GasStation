import java.text.DecimalFormat;

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
	Clock c = new Clock();
	public boolean draw = false;

	
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
    	
    	int mouseX, mouseY;
    	   
     
        if(Greenfoot.mouseDragged(this))  
        {
        	//System.out.println("dragging");
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseX=mouse.getX();
            mouseY=mouse.getY();
            setLocation(mouseX, mouseY);
        }
    	Actor pumpNozel = getOneIntersectingObject(Car.class);
    	if(pumpNozel!=null && draw==true){
    		c.drawGas();
    	}
        
        this.getWorld().addObject(c, 448, 168);
        
        
        System.out.println(new DecimalFormat(("00.00")).format(c.gallons));

    }
    
	public void display() {
		world.addObject((Actor) this, 800, 150);
	}
 
}
