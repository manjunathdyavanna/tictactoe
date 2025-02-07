package tictactoe.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private int row;
    private int col;
    private CellState state;
    private Player playedBy;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.state = CellState.EMPTY;
    }
}
