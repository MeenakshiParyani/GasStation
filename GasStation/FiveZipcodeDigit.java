
public class FiveZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public FiveZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateFourZipcodeDigits(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validZipcode() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void invalidZipcode() {
		// TODO Auto-generated method stub
		zip.setStateNoZipcodeDigits();
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
