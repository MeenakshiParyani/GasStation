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

        Card card = new Card(this);
        GasStation gasStation = new GasStation(this);
        PumpNozel pumpNozel = new PumpNozel(this);
        Car car = new Car(this);
        CarWashArea carWashArea = new CarWashArea(this);
        Screen screen = new Screen();

        DiscoverCC discoverCreditCard = new DiscoverCC(this);
        ChaseCC chaseCreditCard = new ChaseCC(this);
        FakeCC fakeCreditCard = new FakeCC(this);
	Display display = new Display(this);
        // composite pattern for all card objects
        card.addSubComponent(discoverCreditCard);
        card.addSubComponent(chaseCreditCard);
        card.addSubComponent(fakeCreditCard);

        PrintReceipt printer = new PrintReceipt(this);
        CardScanner scanner = new CardScanner(this);
        Buttons buttons = new Buttons(this);
        Display messages = new Display(this);
        GasOptions fuelType =new GasOptions(this);

        //composite pattern for all gas station components
        gasStation.addSubComponent(messages);
        gasStation.addSubComponent(scanner);
        gasStation.addSubComponent(printer);
        gasStation.addSubComponent(buttons);
        gasStation.addSubComponent(fuelType);

        //composite pattern for the whole screen        

        screen.addSubComponent(gasStation);
        screen.addSubComponent(carWashArea);
        screen.addSubComponent(card);
        screen.addSubComponent(pumpNozel);
        screen.addSubComponent(car);
	 screen.addSubComponent(display);
        

        addObject(screen, 50, 50);
    }
    
    
}
