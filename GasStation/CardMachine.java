public class CardMachine  {
	
	CardState hasCard;     
	CardState noCard;
	CardState hasCorrectPin;
	
	CardState cardState;
	
	boolean correctPinEntered = false;
	
	public CardMachine(){
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		
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


	public void insertPin(int pinEntered){
		
		cardState.insertPin(pinEntered);
		
	}
	
	public CardState getYesCardState() { return hasCard; }
	public CardState getNoCardState() { return noCard; }
	public CardState getHasPin() { return hasCorrectPin; }
	
}