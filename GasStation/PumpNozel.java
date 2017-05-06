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
	public boolean draw = true;
	public boolean dispenseStart = false;
	public boolean receiptCalled = false;
	public int fuelType = 87;
	public boolean carWash = false;


	public PumpNozel(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
	}


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
		Actor nozzleHolder  = getOneIntersectingObject(NozzleHolder.class);


		if(draw==true && pumpNozel!=null){
			c.drawGas();
			c.fuellingStart = true;

		}
		if(c.fuellingStart && nozzleHolder!=null){
			c.fuellingDone = true;
		}

		if(c.fuellingStart && c.fuellingDone && !receiptCalled){
			draw = false;
			carWash();
			callReceipt();
		}
		this.getWorld().addObject(c, 448, 168);
	}

	private void carWash() {
		
		

		
	}



	public void display() {
		world.addObject((Actor) this, 800, 150);
	}


	public void callReceipt(){
		System.out.println("called");
		c.fuellingDone = c.fuellingDone = false;
		receiptCalled = true;
		
		
		
}

}
