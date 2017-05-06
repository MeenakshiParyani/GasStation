public class PrintReceiver implements Receiver {

	Display d = null;
	PrintReceipt p = null;
	
	public PrintReceiver(Display d,PrintReceipt p)
	{
		this.d = d;
		this.p = p;
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
		
		// TODO Auto-generated method stub
		d.clear();
    	d.setText("Please Wait...Printing!");
    	p.printReciept();
	
	
	}

	@Override
	public void doNoAction() {
		// TODO Auto-generated method stub
		d.clear();
    	d.setText("ThankYou!");
		
	}

}
