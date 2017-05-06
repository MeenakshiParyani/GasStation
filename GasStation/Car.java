import java.util.ArrayList;
import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Screen implements IDisplayComponent 
{
	
		GreenfootImage gi = getImage();
		private List<IDisplayComponent> cars = new ArrayList();
		private World world;
		/**
	     * Act - do whatever the Card wants to do. This method is called whenever
	     * the 'Act' or 'Run' button gets pressed in the environment.
	     */
		public Car(World world)
		{
			this.world = world;
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			//int x = 100;
			world.addObject((Actor) this, 100, 520);
			for (IDisplayComponent car : cars) {
				
				car.display();
				//x += 100;
			}
		}

	    

    public void act() {
        // Add your action code here.
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    	if(getWorld().getObjects(Car.class).get(0).getX() <= 500) {
    		Greenfoot.playSound("sounds/car+driveby21.wav");
    		move(2);
    	}
    }
    
    public void moveCar() {
    	if(getWorld().getObjects(Car.class).get(0).getX() <= 1000) {
    		Greenfoot.playSound("sounds/car+driveby21.wav");
    		move(2);
    	}
    	//Greenfoot.setWorld(new MyWorld());
    }

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		cars.add( c );
	}
}
