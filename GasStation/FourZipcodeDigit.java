
public class FourZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public FourZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateThreePinDigits(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateFivePinDigits(digit);
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
