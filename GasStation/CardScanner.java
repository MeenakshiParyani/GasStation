import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardScanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardScanner extends Screen implements IDisplayComponent
{   CardMachine cm = null;
    private World world;
    Card c = null;
    CardMachine cardmachine;
    boolean f = true;
    ZipcodeMachine zipcodemachine;
    
    
    public CardScanner(World world) {
        this.world = world;
        this.cardmachine = new CardMachine();
        this.zipcodemachine = new ZipcodeMachine();
    }

    /**
     * Act - do whatever the CardScanner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Card.class) != null && f)
        {
        	f = false;
            c = (Card)getOneIntersectingObject(Card.class);
            getWorld().removeObject(c);
         
            System.out.println("c.getClass" + c.getClass());
            
        if ( c.getClass() == ChaseCC.class)
        {
            cardmachine.insertCard();
           // Greenfoot.delay(2);
            System.out.println("Insert Zip Code");
            
        }
        if ( c.getClass() == FakeCC.class)
        {
            cardmachine.insertCard();
           // Greenfoot.delay(1);
            cardmachine.ejectCard();
            Greenfoot.delay(3);
            getWorld().addObject(c, 350, 350);
            
        }
        if ( c.getClass() == DiscoverCC.class)
        {
            cardmachine.insertCard();
            //Greenfoot.delay(5);
            System.out.println("Insert Zip Code");

            
        }
        }
    }

    @Override
    public void display() {
        world.addObject(this, 550, 380);
    }
}
