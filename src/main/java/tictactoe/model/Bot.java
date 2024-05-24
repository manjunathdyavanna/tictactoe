package tictactoe.model;

import lombok.Getter;
import lombok.Setter;
import tictactoe.factory.BotPlayingStrategyFactory;
import tictactoe.model.enums.BotDifficultyLevel;
import tictactoe.model.enums.PlayerType;
import tictactoe.strategy.bot.BotPlayingStrategy;

@Getter
@Setter
public class Bot extends Player{
    private BotDifficultyLevel difficultyLevel;
    private BotPlayingStrategy strategy;

    public Bot(String name, char symbol, BotDifficultyLevel difficultyLevel){
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
        this.strategy = BotPlayingStrategyFactory.getStrategyByDifficultyLevel(difficultyLevel);

    }
}
