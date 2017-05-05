
public interface IZipcodeStateMachine {

	void backspace() ;
	void cancel() ;
	void enter() ;
    void number( String digit ) ;
    boolean validZipcode() ;
    void invalidZipcode() ;

    void setStateNoZipcodeDigits() ;
    void setStateOneZipcodeDigit( String digit ) ;
    void setStateTwoZipcodeDigits( String digit ) ;
    void setStateThreeZipcodeDigits( String digit ) ;
    void setStateFourZipcodeDigits( String digit ) ;
    void setStateFiveZipcodeDigits( String digit ) ;
	void authenticateZipcode();
}
