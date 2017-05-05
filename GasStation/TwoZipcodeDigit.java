
public class TwoZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public TwoZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateOneZipcodeDigit(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateThreeZipcodeDigits(digit);
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
