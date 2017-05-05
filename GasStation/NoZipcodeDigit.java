
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
	public void validZipcode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidZipcode() {
		// TODO Auto-generated method stub
		
	}

}
