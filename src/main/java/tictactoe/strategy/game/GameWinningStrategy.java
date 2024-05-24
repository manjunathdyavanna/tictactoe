package tictactoe.strategy.game;

import tictactoe.model.Board;
import tictactoe.model.Cell;
import tictactoe.model.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastMovedPlayer, Cell lastMovedCell);
}
