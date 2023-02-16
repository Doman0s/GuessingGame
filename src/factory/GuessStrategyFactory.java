package factory;

public class GuessStrategyFactory {

    public GuessStrategy guessStrategy(String strategyType) {
        switch (strategyType.toUpperCase()) {
            case "RANDOM":
                return new RandomGuessStrategy();
            case "SMART":
                return new SmartGuessStrategy();
            default:
                return null;
        }
    }
}
