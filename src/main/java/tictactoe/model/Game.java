package tictactoe.model;

import tictactoe.strategy.GameWinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState status;
    private Player winner;
    private Player nextPlayer;
    private List<Move> recording;
    private List<Board> boardStatus;
    private GameWinningStrategy gameWinningStrategy;

    private Game(GameBuilder builder) {
        this.board = builder.board;
        this.players = builder.players;
        this.status = builder.status;
        this.winner = builder.winner;
        this.nextPlayer = builder.nextPlayer;
        this.recording = builder.recording;
        this.boardStatus = builder.boardStatus;
        this.gameWinningStrategy = builder.gameWinningStrategy;
    }

    public static GameBuilder builder(){
        return new GameBuilder();
    }

    public static Game build(GameBuilder builder){
        try{
            builder.valid();
        } catch (Exception e){
            //TODO
        }
        return new Game(builder);
    }

    public static class GameBuilder {
        private Board board;
        private List<Player> players;
        private GameState status;
        private Player winner;
        private Player nextPlayer;
        private List<Move> recording;
        private List<Board> boardStatus;
        private GameWinningStrategy gameWinningStrategy;

        private GameBuilder(){}
        public Board getBoard() {
            return board;
        }

        public GameBuilder board(Board board) {
            this.board = board;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder players(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameState getStatus() {
            return status;
        }

        public GameBuilder status(GameState status) {
            this.status = status;
            return this;
        }

        public Player getWinner() {
            return winner;
        }

        public GameBuilder winner(Player winner) {
            this.winner = winner;
            return this;
        }

        public Player getNextPlayer() {
            return nextPlayer;
        }

        public GameBuilder nextPlayer(Player nextPlayer) {
            this.nextPlayer = nextPlayer;
            return this;
        }

        public List<Move> getRecording() {
            return recording;
        }

        public GameBuilder recording(List<Move> recording) {
            this.recording = recording;
            return this;
        }

        public List<Board> getBoardStatus() {
            return boardStatus;
        }

        public GameBuilder boardStatus(List<Board> boardStatus) {
            this.boardStatus = boardStatus;
            return this;
        }

        public GameWinningStrategy getGameWinningStrategy() {
            return gameWinningStrategy;
        }

        public GameBuilder gameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategy = gameWinningStrategy;
            return this;
        }

        private boolean valid(){
            //TODO
            return true;
        }
    }
}
