
public class ZipcodeMachine implements IZipcodeStateMachine {
	
	private IZipcodeState state ;
	private NoZipcodeDigit zip0;
	private OneZipcodeDigit zip1;
	private TwoZipcodeDigit zip2;
	private ThreeZipcodeDigit zip3;
	private FourZipcodeDigit zip4;
	private FiveZipcodeDigit zip5;
	
	private String d1, d2, d3, d4, d5 ;
	private int count;
	
	public ZipcodeMachine() {
		zip0 = new NoZipcodeDigit(this);
		zip1 = new OneZipcodeDigit(this);
		zip2 = new TwoZipcodeDigit(this);
		zip3 = new ThreeZipcodeDigit(this);
		zip4 = new FourZipcodeDigit(this);
		zip5 = new FiveZipcodeDigit(this);
		this.state = zip0;
	}
	
	public String getCurrentState()
    {
        return state.getClass().getName() ;
    }

	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		this.state.backspace();
	}

	@Override
	public void number(String digit) {
		// TODO Auto-generated method stub
		this.state.number(digit);
	}

	@Override
	public void validPin() {
		// TODO Auto-generated method stub
		this.state.validPin();
	}

	@Override
	public void invalidPin() {
		// TODO Auto-generated method stub
		this.state.invalidPin();
	}

	@Override
	public void setStateNoPinDigits() {
		// TODO Auto-generated method stub
		this.count = 0;
		this.state = zip0;
		this.d1 = "" ;
        this.d2 = "" ;
        this.d3 = "" ;
        this.d4 = "" ;
        this.d5 = "" ;
        display() ;
	}

	@Override
	public void setStateOnePinDigit(String digit) {
		// TODO Auto-generated method stub
		this.count = 1;
		this.state = zip1;
		if(digit == null)
			this.d2 = "*";
		else this.d1 = digit;
        this.d3 = "*" ;
        this.d4 = "*" ;
        this.d5 = "*" ;
        display() ;
	}

	@Override
	public void setStateTwoPinDigits(String digit) {
		// TODO Auto-generated method stub
		this.count = 2;
		this.state = zip2;
		if(digit == null)
			this.d3 = "*";
		else this.d2 = digit;
        this.d4 = "" ;
        this.d5 = "" ;
        display() ;
	}

	@Override
	public void setStateThreePinDigits(String digit) {
		// TODO Auto-generated method stub
		this.count = 3;
		this.state = zip3;
		if(digit == null)
			this.d4 = "*";
		else this.d3 = digit;
        this.d5 = "" ;
        display() ;
	}

	@Override
	public void setStateFourPinDigits(String digit) {
		// TODO Auto-generated method stub
		this.count = 4;
		this.state = zip4;
		if(digit == null)
			this.d5 = "*";
		else this.d4 = digit;
        display() ;
	}

	@Override
	public void setStateFivePinDigits(String digit) {
		// TODO Auto-generated method stub
		this.count = 5;
		this.state = zip5;
		this.d5 = digit;
        display() ;
	}
	
	public void display() {
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
	}

}
