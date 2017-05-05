import java.nio.channels.GatheringByteChannel;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
	private double gallons;
	private double fuelPrice;
	private boolean carWash;
	private double carPrice;
	private double carWashPrice;
	private double totalPrice;
	/**
	 * Act - do whatever the Card wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public Receipt(boolean fuel, FuelType fuelType, double gallons, double fuelPrice, boolean carWash, double carWashPrice, double totalPrice) {

		this.fuel = fuel;
		this.gallons = gallons;
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
		message.append("-------------------------------------");
		message.append("\n 1 WASHINGTON STREET\nSAN JOSE\nCA 95112\n");
		message.append("-------------------------------------\n");
		if(fuel)
			message.append(fuelType + "           " + fuelPrice);
		if(carWash)
			message.append("\nCar Wash" + "           " + carWashPrice);
		message.append("-------------------------------------\n");
		message.append("Subtotal" + "           " + totalPrice);
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
