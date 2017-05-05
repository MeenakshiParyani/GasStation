/**
 * Write a description of class CancelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoCommand implements Command
{
private Receiver rec;
	
	public NoCommand(Receiver rec) {
		this.rec = rec;
		// TODO Auto-generated constructor stub
	}
	
    public void execute() 
    {
        this.rec.doNoAction();
    }    
}
