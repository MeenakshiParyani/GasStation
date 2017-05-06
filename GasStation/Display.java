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

   	
		gi = new GreenfootImage(189,142); 
		giReceipt = new GreenfootImage(250,300);
//		gi.setColor(greenfoot.Color.BLUE);
//       gi.fill();
//        setImage(gi);
              
	}
  

    public void setText(String msg)
    {
    //	gi.clear();

    	GreenfootImage inner= new GreenfootImage(msg, 19, Color.YELLOW, new Color(0, 0, 0, 96));
    	 int wide = gi.getWidth();
	     int high = gi.getHeight();
	     int leftX = (wide - inner.getWidth())/2;
	     int topY = (high - inner.getHeight())/2;
	     
        gi.setColor(greenfoot.Color.BLACK);
        gi.setFont(gi.getFont().deriveFont(8f));
    	
    	if(msg=="OK")
    	{
//    		 gi.drawString(msg,165,100);
//    	        setImage(gi);
    		gi.drawImage(inner, 170, 85);
	        setImage(gi);
    	}
    	else if(msg=="Cancel")
    	{
//    		 gi.drawString(msg,138,125);
//    	        setImage(gi);
    	        gi.drawImage(inner, 140, 110);
    	        setImage(gi);
    	}
    	else if(msg=="Yes")
    	{//    		 gi.drawString(msg,5,100);
//    	        setImage(gi);
    		gi.drawImage(inner, 2, 85);
	        setImage(gi);
    	}
    	else if(msg=="No")
    	{
//    		 gi.drawString(msg,5,125);
//    	        setImage(gi);
    		gi.drawImage(inner, 2, 110);
	        setImage(gi);
    	}
      
    	else if(msg=="Help")
    	{
    
    		gi.drawImage(inner, 2, 25);
	        setImage(gi);
	       
//    		 gi.drawString(msg,5,40);
//    	        setImage(gi);
    	}
    	else
    	{
    		gi.setFont(gi.getFont().deriveFont(10f));
    	        gi.drawImage(inner, leftX, topY);
    	        setImage(gi);
    	       
        
    	}
       
     }
    
    public void clear()
    {
    	gi.clear();
    }
    
    public void setText(int x, int y,String msg)
    {
    	giReceipt = new GreenfootImage(x,y);
    	gi.clear();
        gi.setColor(greenfoot.Color.WHITE);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.setFont(gi.getFont().deriveFont(12f));
        gi.drawString(msg,15,40);
		setImage(gi);
    }
    
    @Override
	public void display() {
		// TODO Auto-generated method stub

    	this.world.addObject(this, 448, 168);
	}
	/**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.

     	/*MouseInfo mouse = Greenfoot.getMouseInfo();
     	 if (Greenfoot.mouseClicked(null))
          {
          	System.out.println("x "+mouse.getX()+" y: "+mouse.getY());
          }*/
//    	if(Greenfoot.mousePressed(this))
//        {
//            World world = getWorld();
//            world.removeObject(this);
//        }
    }    
}