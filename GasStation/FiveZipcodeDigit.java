
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
	public void validZipcode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidZipcode() {
		// TODO Auto-generated method stub
		zip.setStateNoZipcodeDigits();
	}

}
