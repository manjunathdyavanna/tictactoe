package tictactoe.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

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
