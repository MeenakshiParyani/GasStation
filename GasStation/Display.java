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
	}
  

    public void setText(String msg)
    {
  
    	GreenfootImage inner= new GreenfootImage(msg, 19, Color.YELLOW, new Color(0, 0, 0, 96));
    	 int wide = gi.getWidth();
	     int high = gi.getHeight();
	     int leftX = (wide - inner.getWidth())/2;
	     int topY = (high - inner.getHeight())/2;
	     
        gi.setColor(greenfoot.Color.BLACK);
        gi.setFont(gi.getFont().deriveFont(8f));
    	
    	if(msg=="OK")
    	{
    		gi.drawImage(inner, 170, 85);
	        setImage(gi);
    	}
    	else if(msg=="Cancel")
    	{
    	        gi.drawImage(inner, 140, 110);
    	        setImage(gi);
    	}
    	else if(msg=="Yes")
    	{	gi.drawImage(inner, 2, 85);
	        setImage(gi);
    	}
    	else if(msg=="No")
    	{
    		gi.drawImage(inner, 2, 110);
	        setImage(gi);
    	}
      
    	else if(msg=="Help")
    	{
    
    		gi.drawImage(inner, 2, 25);
	        setImage(gi);
	       
    	}
    	else
    	{
    		
    		
    		gi.setFont(gi.getFont().deriveFont(12f));
    	        gi.drawImage(inner, leftX, topY);
    	        setImage(gi);
    	        
    	        try {
        			Thread.sleep(200);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}
    	       
        
    	}
       
     }
    
    public void clear()
    {
    	gi.clear();
    }
    
    public void setText(int x, int y,String msg)
    {
    	giReceipt = new GreenfootImage(x,y);
    	giReceipt.clear();
    	giReceipt.setColor(greenfoot.Color.GRAY);
    	giReceipt.fill();
    	giReceipt.setColor(greenfoot.Color.BLACK);
    	giReceipt.setFont(giReceipt.getFont().deriveFont(12f));
    	giReceipt.drawString(msg,15,20);
		setImage(giReceipt);
        try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
    }    
}