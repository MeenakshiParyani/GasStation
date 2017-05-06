import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasOptions extends Screen implements IDisplayComponent
{
	private World world;
	
	public GasOptions(World world) {
		this.world = world;
	}

	/**
     * Act - do whatever the GasOptions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    	if(Greenfoot.mouseClicked(null)) {
    		if(mouse.getX() >= 650 && mouse.getX() <= 800 && mouse.getY() >= 350 && mouse.getY() <= 450) {
    			act1();
    		}
    	}
    }
    
    public void act1() {
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    		if(mouse.getX() >= 652 && mouse.getX() <= 696 && mouse.getY() >= 390 && mouse.getY() <= 445) {
    			System.out.println("87");
    			getWorld().getObjects(PumpNozel.class).get(0).draw = true;
    		}
    		if(mouse.getX() >= 701 && mouse.getX() <= 747 && mouse.getY() >= 390 && mouse.getY() <= 445) {
    			System.out.println("89");
    			getWorld().getObjects(PumpNozel.class).get(0).draw = true;
    		}
    		if(mouse.getX() >= 752 && mouse.getX() <= 798 && mouse.getY() >= 390 && mouse.getY() <= 445) {
    			System.out.println("93");
    			getWorld().getObjects(PumpNozel.class).get(0).draw = true;
    		}
    }
    
    public void display() {
    	world.addObject(this, 725, 400);
    }
}
