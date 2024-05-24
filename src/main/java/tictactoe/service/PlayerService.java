package tictactoe.service;

import tictactoe.model.Cell;
import tictactoe.model.Move;
import tictactoe.model.Player;

import java.util.Scanner;

public class PlayerService {

    public Move decideMove(Player player){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row");
        int row = sc.nextInt();

        System.out.println("Please enter col");
        int col = sc.nextInt();

        //TODO : validate the move

        return Move.builder()
                .cell(new Cell(row,col))
                .playedBy(player)
                .build();
    }
}
