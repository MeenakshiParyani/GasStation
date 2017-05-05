
public class FourZipcodeDigit implements IZipcodeState {

	IZipcodeStateMachine zip;
	
	public FourZipcodeDigit(IZipcodeStateMachine zip) {
		this.zip = zip;
	}
	
	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		zip.setStateThreeZipcodeDigits(null);
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		zip.setStateFiveZipcodeDigits(digit);
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
