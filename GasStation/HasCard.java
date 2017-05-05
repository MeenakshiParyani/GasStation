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

	public void insertPin() {
		
			System.out.println("Please Enter Zip Code");
			cardMachine.setCardState(cardMachine.getHasPin());
			
		}	
}