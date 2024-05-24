package tictactoe.model;

import lombok.Getter;
import lombok.Setter;
import tictactoe.model.enums.CellState;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
    private List<List<Cell>> board;

    public Board(int dimension){
        this.board = new ArrayList<>();
        for(int i=0;i<dimension;i++){
            this.board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void display(){
        for(int i=0;i<board.size();i++){
            for(int j=0;j<board.size();j++){
                if(board.get(i).get(j).getState().equals(CellState.EMPTY)){
                    System.out.print("|   |");
                } else if(board.get(i).get(j).getState().equals(CellState.BLOCKED)){
                    System.out.print("|XXX|");
                } else {
                    System.out.println("| " + board.get(i).get(j).getPlayedBy().getSymbol() + " |");
                }
            }
            System.out.println();
        }
    }

}
