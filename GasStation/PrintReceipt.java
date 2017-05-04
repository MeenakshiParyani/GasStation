import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.awt.Font;

/**
 * Write a description of class PrintReceipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceipt extends Screen implements IDisplayComponent
{
	private World world;
	public static double reguarUnleaded = 2.49;
	public static double midUnleaded = 3.14;
	public static double premiumUnleaded = 4.29;


	public PrintReceipt(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Act - do whatever the PrintReceipt wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		// Add your action code here.
	}

	public void display() {
		this.world.addObject(this, 350, 410);
	}

	public  void calculateReceipt(double gallons, boolean carWash, int gasType) {

		double finalPrice = 0.0;

		switch(gasType){
		case 87: finalPrice = gallons*reguarUnleaded;break;
		case 89: finalPrice = gallons*midUnleaded;break;
		case 91: finalPrice = gallons*premiumUnleaded; break;
		default: finalPrice = gallons*reguarUnleaded;
		}

		if(carWash==true){
			double discount = 10.0;
			finalPrice=finalPrice - discount*finalPrice; 		
		}


		System.out.println(finalPrice);

		Receipt r = new Receipt(getWorld());
		r.display();

	}
}


