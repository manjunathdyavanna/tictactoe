package tictactoe.strategy.game;

import tictactoe.model.Board;
import tictactoe.model.Cell;
import tictactoe.model.Player;

public class OptimisedGameWinningStrategy implements GameWinningStrategy {

    @Override
    public boolean checkWinner(Board board, Player lastMovedPlayer, Cell lastMovedCell){
        return true;
    }
}
