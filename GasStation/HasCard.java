public class HasCard implements CardState {
	
	CardMachine cardMachine;
	Display d;
	
	public HasCard(CardMachine newCardMachine, Display d){
		
		cardMachine = newCardMachine;
		this.d = d;
		
	}

	public void insertCard() {
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		
		d.setText("You can only insert one card at a time");
		
	}

	public void ejectCard() {
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		
		d.setText("FakeCard !! \n Your card is ejected");
		cardMachine.setCardState(cardMachine.getNoCardState());
		
	}

	public void insertPin() {
    	d.clear();
    	d.setText("Help");
    	d.setText("Cancel");
		
		d.setText("Please Enter Zip Code");
		cardMachine.setCardState(cardMachine.getHasPin());
			
		}	
}