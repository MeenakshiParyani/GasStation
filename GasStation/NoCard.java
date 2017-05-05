import greenfoot.Greenfoot;

public class NoCard implements CardState {
	
	CardMachine cardMachine;
	
	public NoCard(CardMachine newCardMachine){
		
		cardMachine = newCardMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Processing...Please wait!");
		cardMachine.setCardState(cardMachine.getYesCardState());
		
		
	}

	public void ejectCard() {
		
		System.out.println("You didn't enter a card");
		
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You have not entered your card");
		
	}
}