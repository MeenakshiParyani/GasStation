import greenfoot.Greenfoot;

public class PumpReceiver implements Receiver {

	Display d = null;
	
	public PumpReceiver(Display d)
	{
		this.d = d;
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
		d.clear();
		d.setText("Yes");
		d.setText("No");
    	d.setText("Help");
    	d.setText("Do you want to \n print Receipt?");
		// TODO Auto-generated method stub
	;	
	}

	@Override
	public void doNoAction() {
		// TODO Auto-generated method stub
		d.clear();
		d.setText("Yes");
		d.setText("No");
    	d.setText("Help");
    	d.setText("Do you want to \n print Receipt?");
		
	}

}
