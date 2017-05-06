public class HasPin implements CardState {
	
	CardMachine cardMachine;
	Display d;
	
	public HasPin(CardMachine newCardMachine, Display d){
		
		cardMachine = newCardMachine;
		this.d =d;
	}

	public void insertCard() {
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		
		d.setText("You already entered a card");
		
	}

	public void ejectCard() {
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
	
		d.setText("Your card is ejected");
		cardMachine.setCardState(cardMachine.getNoCardState());
		
	}

	public void insertPin() {
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
	
		d.setText("You already entered Pin");
		
	}	
}