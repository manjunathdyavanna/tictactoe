package tictactoe.model;

import lombok.Getter;
import lombok.Setter;
import tictactoe.model.enums.PlayerType;

@Getter
@Setter
public class Player {
    private char symbol;
    private String name;
    private PlayerType type;

    public Player(String name, char symbol, PlayerType type){
        this.symbol = symbol;
        this.name = name;
        this.type = type;
    }
}
