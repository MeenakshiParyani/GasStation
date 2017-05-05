
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
		zip.setStateOneZipcodeDigit(digit);
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
