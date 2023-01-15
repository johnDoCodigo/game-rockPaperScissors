public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Player 1");
        Player playerTwo = new Player("Player 2");

        Game game = new Game(playerOne, playerTwo);

        game.play();
    }
}