import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Screen implements IDisplayComponent
{
	GreenfootImage gi, giReceipt;
	private World world;
	
    public Display(World world) 
    {
    	this.world = world;
		// TODO Auto-generated constructor stub

		gi = new GreenfootImage(189,142); 
		giReceipt = new GreenfootImage(250,300);
	}
  

    public void setText(String msg)
    {
    	gi.clear();
        gi.setColor(greenfoot.Color.WHITE);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.setFont(gi.getFont().deriveFont(17f));
    	
    	if(msg=="OK")
    	{
    		 gi.drawString(msg,153,100);
    	        setImage(gi);
    	}
    	if(msg=="Cancel")
    	{
    		 gi.drawString(msg,133,130);
    	        setImage(gi);
    	}
    	if(msg=="Yes")
    	{
    		 gi.drawString(msg,113,100);
    	        setImage(gi);
    	}
         // Where 12 is the desired size.
    	else
    	{
    		gi.drawString(msg,15,40);
    		setImage(gi);
        
    	}
       
     }
    
    public void setText(int x, int y,String msg)
    {
    	giReceipt = new GreenfootImage(x,y);
    	gi.clear();
        gi.setColor(greenfoot.Color.WHITE);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.setFont(gi.getFont().deriveFont(17f));
        gi.drawString(msg,15,40);
		setImage(gi);
    }
    
    @Override
	public void display() {
		// TODO Auto-generated method stub
		world.addObject((Actor) this, 448, 168);
	}
	/**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    	 if (Greenfoot.mouseClicked(null))
         {
         	System.out.println("x "+mouse.getX()+" y: "+mouse.getY());
         }
//    	if(Greenfoot.mousePressed(this))
//        {
//            World world = getWorld();
//            world.removeObject(this);
//        }
    }    
}
