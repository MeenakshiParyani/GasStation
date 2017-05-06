// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class Receipt here.	
 * 
 * @author Meenakshi
 * @version (a version number or a date)
 */
public class Receipt
{
	private boolean fuel;
	private FuelType fuelType;
	private String fuelPrice;
	private boolean carWash;
	private String carWashPrice;
	private String totalPrice;
	/**
	 * Act - do whatever the Card wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public Receipt(boolean fuel, FuelType fuelType, String fuelPrice, boolean carWash, String carWashPrice, String totalPrice) {

		this.fuel = fuel;
		this.fuelType = fuelType;
		this.fuelPrice = fuelPrice;
		this.carWash = carWash;
		this.carWashPrice = carWashPrice;
		this.totalPrice = totalPrice;

	}

	public void act() 
	{

	}



	public String generateReceipt() {

		playReceiptSoundInBackground();
		StringBuilder message = new StringBuilder("Welcome to Stallions Gas Station!");
		message.append("\n1 WASHINGTON STREET SAN JOSE CA 95112\n");
		message.append("-------------------------------------\n");
		if(fuel)
			message.append(fuelType.getLabel() + "           " + fuelPrice);
		if(carWash)
			message.append("\nCar Wash" + "                   " + carWashPrice);
		message.append("\n-------------------------------------\n");
		message.append("Subtotal" + "                   " + totalPrice);
		return message.toString();
	}

	private void playReceiptSoundInBackground() {
		GreenfootSound reciptSound = new GreenfootSound("printer.wav");
		reciptSound.play();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		reciptSound.stop();
	}    
}
