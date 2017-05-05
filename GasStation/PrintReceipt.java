import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.awt.Font;
import java.util.List;

/**
 * Write a description of class PrintReceipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceipt extends Screen implements IDisplayComponent
{
	private World world;
	private static double carWashPrice = 40.0;

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

	/*public void display() {
		//this.world.addObject(this, 350, 410);
		GreenfootImage txt = new GreenfootImage(900,60);
		txt.setColor(Color.RED);
		txt.fill();
		txt.drawString(message.toString(), 550, 60);
		setImage(txt);

		List<GasStation> gs = this.world.getObjects(GasStation.class);
		GasStation g = gs.get(0);
		g.ok = false;
	}*/

	public  void printReciept( boolean fuel, double gallons, boolean carWash, FuelType fuelType, List<DiscountType> discountTypes) {

		double totalPrice = 0.0;
		double carWashPrice = 0.0;
		//Calculate price based on fuel type
		double fuelPrice = gallons * fuelType.getPrice();
		// Give discounts based on card type
		for(DiscountType discountType : discountTypes){
			carWashPrice = PrintReceipt.carWashPrice * discountType.getDiscountPercent();
		}
		totalPrice = carWashPrice + fuelPrice;
		
		Receipt receipt = new Receipt(fuel, fuelType, gallons, fuelPrice, carWash, carWashPrice, totalPrice);
		System.out.println(receipt.generateReceipt());

	}

}


