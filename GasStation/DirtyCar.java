import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DirtyCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DirtyCar extends Car
{
   
	public DirtyCar(World world)
	{
		super(world);
	}

	/**
     * Act - do whatever the DirtyCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
Screen screen = new Screen();
    public void act() 
    {
        // Add your action code here.
    	// System.out.println("hellooo");
    	move(2);
    	inShed();
    }    
    
    public void inShed()
    {
    	Actor carShed = getOneObjectAtOffset(30, 0, CarWashArea.class);
    	if(carShed!=null)
    	{
    		World world;
    		world=getWorld();
    		world.removeObject(this);
    		
    		//List<DirtyCar> obj=
    				
    				if(world.getObjects(DirtyCar.class).isEmpty())
    		{
    			System.out.println(world.getObjects(DirtyCar.class));
    			CarWash carWash = new CarWash(world);
    
    		
    		//	screen.addSubComponent(carWash);
    			world.addObject(carWash, world.getWidth()/2, world.getHeight()/2);
    			carWash.addToWorld(world);
    			
    				
    		}
    	}
 
    }
}
