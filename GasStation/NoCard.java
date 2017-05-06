import greenfoot.Greenfoot;

public class NoCard implements CardState {
	
	CardMachine cardMachine;
	Display d;
	
	public NoCard(CardMachine newCardMachine, Display d){
		
		cardMachine = newCardMachine;
		this.d=d;
		
	}

	public void insertCard() {
		
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		d.setText("Processing...Please wait!");
		Greenfoot.delay(100);
		cardMachine.setCardState(cardMachine.getYesCardState());
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
		
	}

	public void ejectCard() {
		
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		d.setText("You didn't enter a card");
		
	}

	public void insertPin() {
		
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		d.setText("You have not entered your card");
		
	}
}