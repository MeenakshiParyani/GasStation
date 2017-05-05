
public class NoZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public NoZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateOnePinDigit(digit);
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
