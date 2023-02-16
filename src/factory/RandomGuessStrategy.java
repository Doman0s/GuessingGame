package factory;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGuessStrategy implements GuessStrategy {

    @Override
    public int nextGuess() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }
}
