import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OkButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OkCommand implements Command
{
	private Receiver rec;
	
	public OkCommand(Receiver rec) {
		this.rec = rec;
		// TODO Auto-generated constructor stub
	}
	
    public void execute() 
    {
        this.rec.doOkAction();
    }
}
