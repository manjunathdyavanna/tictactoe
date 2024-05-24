package tictactoe.strategy.bot;

import tictactoe.model.*;
import tictactoe.model.enums.CellState;

public class LinearBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move decideMove(Player player, Board board) {
        for(int i=0;i<board.getBoard().size();i++){
            for(int j=0;j<board.getBoard().size();j++){
                if(board.getBoard().get(i).get(j).getState().equals(CellState.EMPTY)){
                    return Move.builder().cell(new Cell(i, j)).playedBy(player).build();
                }
            }
        }
        return null;
    }
}
