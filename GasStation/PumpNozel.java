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
    	
    	int mouseX, mouseY;
    	   
        // this becomes true when the object is clicked and draggged using mouse
        
        if(Greenfoot.mouseDragged(this))  
        {
        	System.out.println("dragging");
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseX=mouse.getX();
            mouseY=mouse.getY();
            setLocation(mouseX, mouseY);
        }
        
        dispenseGas();

        
    }
    
	public void display() {
		world.addObject((Actor) this, 800, 150);
	}
    
    public void dispenseGas(){
    	
    	Actor pumpNozel = getOneObjectAtOffset(0, 0, Car.class);
    	System.out.println(pumpNozel);
		Clock c = new Clock();
    	if(pumpNozel==null){
    		System.out.println("entered");
    		c.drawGas = true;

    	}
    	else{
    		c.drawGas = false;
    	}


        this.getWorld().addObject(c, 448, 168);

    	
    }
    
}
