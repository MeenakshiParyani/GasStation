
public class FiveZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public FiveZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateFourPinDigits(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidPin() {
		// TODO Auto-generated method stub
		zip.setStateNoPinDigits();
	}

}
