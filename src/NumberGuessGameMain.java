import factory.GuessStrategy;
import factory.GuessStrategyFactory;
import singleton.NumberGenerator;
import template.Game;
import template.NumberGuessingGame;

public class NumberGuessGameMain {
    public static void main(String[] args) {
        StrategyReader strategyReader = new StrategyReader();
        String strategyType = strategyReader.read();

        NumberGenerator numberGenerator = NumberGenerator.INSTANCE;
        GuessStrategyFactory factory = new GuessStrategyFactory();
        GuessStrategy guessStrategy = factory.guessStrategy(strategyType);

        Game game = new NumberGuessingGame(numberGenerator, guessStrategy);
        game.play();
    }
}
