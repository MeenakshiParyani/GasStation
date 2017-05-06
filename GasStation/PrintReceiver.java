import greenfoot.Greenfoot;

public class PrintReceiver implements Receiver {

	Display d = null;
	PrintReceipt p = null;
	boolean isCarwash;
	
	public PrintReceiver(Display d,PrintReceipt p, boolean isCarwash)
	{
		this.d = d;
		this.p = p;
		this.isCarwash = isCarwash;
	}
	@Override
	public void doOkAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doCancelAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doHelpAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doYesAction() {
		Greenfoot.delay(5);
		// TODO Auto-generated method stub
		d.clear();
    	d.setText("Please Wait...Printing!");
    	Greenfoot.delay(100);
    	p.printReciept();
	
	
	}

	@Override
	public void doNoAction() {
		// TODO Auto-generated method stub
		d.clear();
    	d.setText("ThankYou!");
    	Greenfoot.delay(100);
    	if(isCarwash)
    		Greenfoot.setWorld(new CarWashWorld());
    	else Greenfoot.setWorld(new MyWorld());
		
	}

}
