import java.text.DecimalFormat;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clock here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock extends Actor
{

	public double gallons = 0;
	public double cost = 0;

	private long lastCurrentSecond;
	private long timeSaved = 0;

	public boolean fuellingDone = false;
	public boolean fuellingStart = false;
	public boolean tankFull = false;
	GreenfootImage gi ;
	String gallonsDone = "gallons";
	
	
	public Clock() {
		gi = new GreenfootImage(120,60);
	}


	public void setText(String msg)
	{
		gi.clear();
		gi.setColor(greenfoot.Color.YELLOW);
		gi.fill();

	   	GreenfootImage inner= new GreenfootImage(msg, 19, Color.BLACK, new Color(0, 0, 0, 96));
   	 int wide = gi.getWidth();
	     int high = gi.getHeight();
	     int leftX = (wide - inner.getWidth())/2;
	     int topY = (high - inner.getHeight())/2;
	     
       gi.setColor(greenfoot.Color.YELLOW);
       gi.setFont(gi.getFont().deriveFont(10f));
       gi.drawImage(inner, leftX, topY);
       setImage(gi);

		
		
	}

	public void act() {
		
		setText(this.gallonsDone);

	}
	
	
	public void drawGas(){
		setImage(gi);
		if (!tankFull) {
			if (gallons>18.00) {
				tankFull = true;
				stopDispense();
				this.gallonsDone = "Tank Full \n Put Back Nozzle in Holder";
			}
			else if ((System.currentTimeMillis() - lastCurrentSecond >= 100)) {
                lastCurrentSecond += 100;
		gallons = gallons + 0.01;
		PumpNozel p = getWorld().getObjects(PumpNozel.class).get(0);
		if(p.fuelType == 87) {
			cost = gallons * FuelType.REGULAR_UNLEADED.getPrice();
		} else if(p.fuelType == 89) {
			cost = gallons * FuelType.MID_UNLEADED.getPrice();
		} else if(p.fuelType == 93) {
			cost = gallons * FuelType.PREMIUM_UNLEADED.getPrice();
		}
		this.gallonsDone = "gallons:  "+ new DecimalFormat(("00.00")).format(gallons) + "\n" + "cost:   "+ new DecimalFormat(("00.00")).format(cost);
			}
		}
	}

	public void startClock() {

		//System.out.println("dispense started");
		lastCurrentSecond = System.currentTimeMillis() - timeSaved;
		//drawGas = true;
	}
	public void stopDispense() {
		timeSaved = System.currentTimeMillis() - lastCurrentSecond;
		fuellingDone = true;
	}
	public void resetClock() {
		//gallons = -0.1;
	}
}
