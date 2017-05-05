import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CancelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CancelCommand implements Command
{
private Receiver rec;
	
	public CancelCommand(Receiver rec) {
		this.rec = rec;
		// TODO Auto-generated constructor stub
	}
	
    public void execute() 
    {
        this.rec.doCancelAction();
    }    
}
