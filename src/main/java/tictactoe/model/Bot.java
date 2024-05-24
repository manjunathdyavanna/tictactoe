package tictactoe.model;

import lombok.Getter;
import lombok.Setter;
import tictactoe.factory.BotPlayingStrategyFactory;
import tictactoe.strategy.BotPlayingStrategy;

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
