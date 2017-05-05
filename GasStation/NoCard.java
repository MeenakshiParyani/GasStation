import greenfoot.Greenfoot;

public class NoCard implements CardState {
	
	CardMachine cardMachine;
	
	public NoCard(CardMachine newCardMachine){
		
		cardMachine = newCardMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Processing...Please wait!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cardMachine.setCardState(cardMachine.getYesCardState());
		
		
	}

	public void ejectCard() {
		
		System.out.println("You didn't enter a card");
		
	}

	public void insertPin() {
		
		System.out.println("You have not entered your card");
		
	}
}