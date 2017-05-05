
public interface IZipcodeStateMachine {

	void backspace() ;
    void number( String digit ) ;
    void validPin() ;
    void invalidPin() ;

    void setStateNoPinDigits() ;
    void setStateOnePinDigit( String digit ) ;
    void setStateTwoPinDigits( String digit ) ;
    void setStateThreePinDigits( String digit ) ;
    void setStateFourPinDigits( String digit ) ;
    void setStateFivePinDigits( String digit ) ;
}
