
public class ThreeZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public ThreeZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateTwoZipcodeDigits(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateFourZipcodeDigits(digit);
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
