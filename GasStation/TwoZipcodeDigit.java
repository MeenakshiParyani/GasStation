
public class TwoZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public TwoZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateOnePinDigit(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateThreePinDigits(digit);
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
