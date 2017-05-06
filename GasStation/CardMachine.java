public class CardMachine  {
	
	CardState hasCard;     
	CardState noCard;
	CardState hasCorrectPin;
	
	CardState cardState;
	Display d = null;
	
	boolean correctPinEntered = false;
	
	public CardMachine(Display d){
		this.d =d;
		hasCard = new HasCard(this,d);
		noCard = new NoCard(this,d);
		hasCorrectPin = new HasPin(this,d);
		
		cardState = noCard;
				
	}


	
	void setCardState(CardState newCardState){
		
		cardState = newCardState;
		
	}
	
	public void insertCard() {
		
		cardState.insertCard();
		
		
	}

	public void ejectCard() {
		
		cardState.ejectCard();
		
	}


	public void insertPin(){
		
		cardState.insertPin();
		
	}
	
	public CardState getYesCardState() { return hasCard; }
	public CardState getNoCardState() { return noCard; }
	public CardState getHasPin() { return hasCorrectPin; }
	
}