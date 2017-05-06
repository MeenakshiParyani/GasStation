import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		world.addObject((Actor) this, 350, 410);
	}

	/**
	 * Act - do whatever the PrintReceipt wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		
	}

	public  void printReciept() {

		List<DiscountType> discountTypes = new ArrayList<DiscountType>();
		double totalPrice = 0.0;
		double carWashPrice = 0.0;
		double fuelPrice1 = 0.0;
		double carWashPrice1 = 0.0;
		//Calculate price based on fuel type
		double fuelPrice = getWorld().getObjects(Clock.class).get(0).cost;
		// Give discounts based on card type
		String a = getWorld().getObjects(GasOptions.class).get(0).getCard().getClass().getCanonicalName();
		if(a == "ChaseCC")
			discountTypes.add(DiscountType.CHASE_CC);
		else if(a == "DiscoverCC")
			discountTypes.add(DiscountType.DISCOVER_CC);
		if(getWorld().getObjects(PumpNozel.class).get(0).isCarwash)
			discountTypes.add(DiscountType.CAR_DISCOUNT);
		
		int f = getWorld().getObjects(PumpNozel.class).get(0).fuelType;
		FuelType ft = null;
		if(f == 87)
			ft = ft.REGULAR_UNLEADED;
		else if(f == 89)
			ft = ft.MID_UNLEADED;
		else if(f == 93)
			ft = ft.PREMIUM_UNLEADED;
		
		for(DiscountType discountType : discountTypes){
			if(discountType.equals(DiscountType.CAR_DISCOUNT))
				carWashPrice1 = this.carWashPrice * discountType.getDiscountPercent();
			else
				fuelPrice1 = fuelPrice * discountType.getDiscountPercent();
		}
		totalPrice = this.carWashPrice + fuelPrice - carWashPrice1 - fuelPrice1;
		String fPrice = new DecimalFormat("#.##").format(fuelPrice);
		String cwPrice = new DecimalFormat("#.##").format(carWashPrice);
		String tPrice = new DecimalFormat("#.##").format(totalPrice);
		
		StringBuilder message = new StringBuilder("  Welcome to Stallions Gas Station!");
		message.append("\n1 WASHINGTON STREET \n SAN JOSE CA 95112\n");
		message.append("-----------------------------------------------------------------\n");
		message.append(ft.getLabel() + "           " + new DecimalFormat("##.##").format(fuelPrice));
		message.append("\nCar Wash" + "                        " + new DecimalFormat("##.##").format(this.carWashPrice));
		message.append("\n-----------------------------------------------------------------\n");
		message.append("Subtotal" + "                        " + new DecimalFormat("##.##").format((this.carWashPrice + fuelPrice)));
		message.append("\n-----------------------------------------------------------------");
		if(carWashPrice1 > 0)
			message.append("\nCar Wash Discount" + "           "+ "-" + new DecimalFormat("##.##").format(carWashPrice1) );
		if(fuelPrice1 > 0)
			message.append("\nCard Discount" + "                " +"-" + new DecimalFormat("##.##").format(fuelPrice1) );
		message.append("\n-----------------------------------------------------------------\n");
		message.append("Total" + "                       " + new DecimalFormat("##.##").format(totalPrice));
		message.append("\n-----------------------------------------------------------------");
		Display d = getWorld().getObjects(Display.class).get(0);
        Display display = new Display(getWorld());
        getWorld().addObject(display, 100, 400);
        display.setText(200, 250, message.toString());
        System.out.println(message.toString());
        playReceiptSoundInBackground();
        d.clear();
        d.setText("Thank You!");
        getWorld().getObjects(Car.class).get(0).moveCar();
       // Greenfoot.setWorld(new CarWashWorld());
	}
	
	public void playReceiptSoundInBackground() {
		GreenfootSound reciptSound = new GreenfootSound("printer.wav");
		reciptSound.play();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		reciptSound.stop();
	}

}


