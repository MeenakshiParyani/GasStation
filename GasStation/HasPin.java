public class HasPin implements CardState {
	
	CardMachine cardMachine;
	
	public HasPin(CardMachine newCardMachine){
		
		cardMachine = newCardMachine;
		
	}

	public void insertCard() {
		
		System.out.println("You already entered a card");
		
	}

	public void ejectCard() {
		
		System.out.println("Your card is ejected");
		cardMachine.setCardState(cardMachine.getNoCardState());
		
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You already entered a zipcode");
		
	}	
}