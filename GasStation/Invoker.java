
public class Invoker {

	private Command cmnd;
	
	public Invoker(Command cmnd) {
		this.cmnd = cmnd;
	}
	
	public void execute() {
		this.cmnd.execute();
	}
}
