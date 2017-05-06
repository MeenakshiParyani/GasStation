import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWashWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashWorld extends World
{

    /**
     * Constructor for objects of class CarWashWorld.
     * 
     */
    public CarWashWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000 , 600, 1);
        GreenfootImage bg = new GreenfootImage("bg1.jpeg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
       
      //  super(1500 , 1000, 1);
     //   prepare();
    }
    
    
    public void prepare()
    {
    	CarWashArea carWashArea = new CarWashArea(this);
    //	CarWash carWash = new CarWash();
    	Car dirtyCar = new DirtyCar(this);
    //	Car cleanCar = new CleanCar(this);
    	Screen screen = new Screen();
    	
    //	System.out.println("Helllloooooooo");
    	// composite pattern for cars
    	Car car = new Car(this);
    	car.addSubComponent(dirtyCar);
    	

    	// composite pattern for screen
    	screen.addSubComponent(carWashArea);
    	screen.addSubComponent(dirtyCar);
    	
    	addObject(screen, 30, 50);
    }
}
