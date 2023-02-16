package factory;

public class SmartGuessStrategy implements GuessStrategy {

    private int min = 0;
    private int max = 99;

    @Override
    public int nextGuess() {
        return (min + max) / 2;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
