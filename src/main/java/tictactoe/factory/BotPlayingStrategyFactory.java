package tictactoe.factory;

import lombok.NonNull;
import tictactoe.exception.BotPlayingStrategyException;
import tictactoe.model.enums.BotDifficultyLevel;
import tictactoe.strategy.bot.BotPlayingStrategy;
import tictactoe.strategy.bot.HardBotPlayingStrategy;
import tictactoe.strategy.bot.LinearBotPlayingStrategy;
import tictactoe.strategy.bot.MedBotPlayingStrategy;

import java.util.Objects;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategyByDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        if(Objects.isNull(difficultyLevel)){
            throw new BotPlayingStrategyException("Difficulty level cannot be empty to get the Bot");
        }

        return switch (difficultyLevel) {
            case EASY -> new LinearBotPlayingStrategy();
            case MEDIUM -> new MedBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}
