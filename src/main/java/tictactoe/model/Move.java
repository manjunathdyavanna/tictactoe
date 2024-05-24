package tictactoe.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Move {
    private Cell cell;
    private Player playedBy;
}
