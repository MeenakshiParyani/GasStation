
public class OneZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public OneZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateNoZipcodeDigits();
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateTwoZipcodeDigits(digit);
	}

	@Override
	public void validZipcode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidZipcode() {
		// TODO Auto-generated method stub
		
	}

}
