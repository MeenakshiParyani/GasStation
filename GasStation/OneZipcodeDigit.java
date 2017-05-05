
public class OneZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public OneZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateNoPinDigits();
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateTwoPinDigits(digit);
	}

	@Override
	public void validPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidPin() {
		// TODO Auto-generated method stub
		
	}

}
