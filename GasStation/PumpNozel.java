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
	public int fuelType = 0;
	public boolean carWash = false;
	Display d  =null;
	Receiver pr =null;
	Receiver prr = null;
	YesCommand yc = null;
    Invoker in = null;
    NoCommand nc =null;
    boolean isCarwash = false;
    boolean isCar = true;
    boolean isPrint = false;

	public PumpNozel(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
		
	}


	public void act() 
	{



		int mouseX, mouseY;


		if(Greenfoot.mouseDragged(this))  
		{
			MouseInfo mouse = Greenfoot.getMouseInfo();
			mouseX=mouse.getX();
			mouseY=mouse.getY();
			setLocation(mouseX, mouseY);
		}
		Actor pumpNozel = getOneIntersectingObject(Car.class);
		Actor nozzleHolder  = getOneIntersectingObject(NozzleHolder.class);


		if(fuelType > 0 && draw==true && pumpNozel!=null){
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
		
		if (receiptCalled)
		{
	        MouseInfo mouse = Greenfoot.getMouseInfo();
	        d=getWorld().getObjects(Display.class).get(0);
			PrintReceipt p = getWorld().getObjects(PrintReceipt.class).get(0);
	        
			this.prr = new PrintReceiver(d,p);
	   	 	if (Greenfoot.mousePressed(null)  )
	   			 {
	   	 			if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 180 && mouse.getY() <= 196)
	   	 			{
	   	 				if(!isPrint) {
	   	 				this.yc = new YesCommand(pr);
	   	 				in = new Invoker(yc);
	   	 				in.execute();
	   	 				isCarwash = true;
	   	 				isCar = false;
	   	 				isPrint = true;
	   	 				} else {
	   	 				this.yc = new YesCommand(prr);
	   	 				in = new Invoker(yc);
	   	 				in.execute();
	   	 				isCarwash = true;
	   	 				}
					 
	   	 			}
	   	 			if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 208 && mouse.getY() <= 225)
	   	 			{
	   	 				if(!isPrint) {
	   	 				System.out.println("No");
	   	 				this.nc = new NoCommand(pr);
	   	 				in = new Invoker(nc);
	   	 				in.execute();
	   	 				isCarwash = false;
	   	 				isCar = false;
	   	 				isPrint = true;
	   	 				} else {
	   	 				this.nc = new NoCommand(prr);
	   	 				in = new Invoker(nc);
	   	 				in.execute();
	   	 				isCarwash = false;
	   	 				}
	   	 				
					 
	   	 			}
				if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 121 && mouse.getY() <= 136)
				 {
					 System.out.println("Help");
				 }
			}
		}	
		
		this.getWorld().addObject(c, 725, 259);
	}

	private void carWash() {
		
		

		
	}



	public void display() {
		world.addObject((Actor) this, 800, 150);
	}


	public void callReceipt(){
		
		d=getWorld().getObjects(Display.class).get(0);
		this.pr = new PumpReceiver(d);
    	d.clear();
    	d.setText("Yes");
    	d.setText("No");
    	d.setText("Help");
    	d.setText("Do you want to wash car?");
    	

	
    	
		c.fuellingDone = c.fuellingDone = false;
		receiptCalled = true;
		
		
}

}
