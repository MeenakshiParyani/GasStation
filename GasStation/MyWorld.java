import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000 , 600, 1);
        prepare();
    }
    
    public void prepare() {
    	
    	DiscoverCC card = new DiscoverCC(150, 80, Color.BLUE, "Discover Credit Card");
    	ChaseCC card1 = new ChaseCC(150, 80, Color.BLUE, "Chase Credit Card");
    	FakeCC card2 = new FakeCC(150, 80, Color.BLUE, "Fake Credit Card");
    	
        Buttons buttons1 = new Buttons(90, 50, Color.GRAY, "1");
        Buttons buttons2 = new Buttons(90, 50, Color.GRAY, "2");
		Buttons buttons3 = new Buttons(90, 50, Color.GRAY, "3");
		Buttons buttons4 = new Buttons(90, 50, Color.GRAY, "4");
		Buttons buttons5 = new Buttons(90, 50, Color.GRAY, "5");
		Buttons buttons6 = new Buttons(90, 50, Color.GRAY, "6");
		Buttons buttons7 = new Buttons(90, 50, Color.GRAY, "7");
		Buttons buttons8 = new Buttons(90, 50, Color.GRAY, "8");
		Buttons buttons9 = new Buttons(90, 50, Color.GRAY, "9");
		//Buttons buttons10 = new Buttons(90, 50, Color.GRAY, "");
		Buttons buttons11 = new Buttons(90, 50, Color.GRAY, "0");
		//Buttons buttons12 = new Buttons(90, 50, Color.GRAY, "<=|");
		Buttons buttonsB1 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB2 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB3 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB4 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB5 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB6 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB7 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsB8 = new Buttons(50, 30, Color.GRAY, "");
		Buttons buttonsA = new Buttons(90, 50, Color.YELLOW, "W1");
		Buttons buttonsB = new Buttons(90, 50, Color.YELLOW, "W1");
		Buttons buttonsC = new Buttons(90, 50, Color.YELLOW, "W1");
		addObject(buttonsB1,300,50);
        addObject(buttonsB2,300,90);
		addObject(buttonsB3,300,130);
        addObject(buttonsB4,300,170);
		addObject(buttonsB5,600,50);
        addObject(buttonsB6,600,90);
		addObject(buttonsB7,600,130);
        addObject(buttonsB8,600,170);
        
        addObject(buttons1,310,250);
        addObject(buttons2,450,250);
        addObject(buttons3,590,250);
        addObject(buttons4,310,320);
        addObject(buttons5,450,320);
        addObject(buttons6,590,320);
        addObject(buttons7,310,390);
        addObject(buttons8,450,390);
        addObject(buttons9,590,390);
        //addObject(buttons10,310,460);
        addObject(buttons11,450,460);
        //addObject(buttons12,590,460);
        
        addObject(buttonsA,310,530);
        addObject(buttonsB,450,530);
        addObject(buttonsC,590,530);
        
        addObject(card,100,100);
        addObject(card1,100,200);
        addObject(card2,100,300);
    }
    
    
}
