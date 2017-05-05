
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
	public boolean validZipcode() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidZipcode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		zip.setStateNoZipcodeDigits();
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		zip.authenticateZipcode();
	}

}
