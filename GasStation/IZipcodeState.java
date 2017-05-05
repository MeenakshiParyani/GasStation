
public interface IZipcodeState {

	void backspace() ;
	void cancel() ;
	void enter() ;
    void number( String digit ) ;
    boolean validZipcode() ;
    void invalidZipcode() ;
}
