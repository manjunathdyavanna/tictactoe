package tictactoe.strategy.bot;

import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
