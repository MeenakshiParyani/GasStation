
public class ThreeZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public ThreeZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateTwoPinDigits(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateFourPinDigits(digit);
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
