package tictactoe.factory;

import tictactoe.model.BotDifficultyLevel;
import tictactoe.strategy.BotPlayingStrategy;
import tictactoe.strategy.LinearBotPlayingStrategy;

import java.util.Objects;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategyByDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        if(Objects.nonNull(difficultyLevel) && difficultyLevel == BotDifficultyLevel.EASY)
            return new LinearBotPlayingStrategy();
        return null;
    }
}
