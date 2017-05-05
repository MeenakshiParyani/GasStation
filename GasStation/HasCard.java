public class HasCard implements CardState {
	
	CardMachine cardMachine;
	
	public HasCard(CardMachine newCardMachine){
		
		cardMachine = newCardMachine;
		
	}

	public void insertCard() {
		
		System.out.println("You can only insert one card at a time");
		
	}

	public void ejectCard() {
		
		System.out.println("Your card is ejected");
		cardMachine.setCardState(cardMachine.getNoCardState());
		
	}

	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1234){
			
			System.out.println("You entered the correct ZipCode");
			cardMachine.correctPinEntered = true;
			cardMachine.setCardState(cardMachine.getHasPin());
			
		} else {
			
			System.out.println("You entered the wrong ZipCode");
			cardMachine.correctPinEntered = false;
			System.out.println("Your card is ejected");
			cardMachine.setCardState(cardMachine.getNoCardState());
			
		}	
	}	
}