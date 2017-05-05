public interface CardState {
    // Different states expected
    // HasCard, NoCard, HasPin, NoCash

    void insertCard();
    void ejectCard();
    void insertPin();
}
