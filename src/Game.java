public class Game {

    private Player playerOne;
    private Player playerTwo;

    private int rock = 0;
    private int scissors = 1;
    private int paper = 2;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        int playerOneChoice = playerOne.getPlayerChoice();
        int playerTwoChoice = playerTwo.getPlayerChoice();
        determineWinner(playerOneChoice, playerTwoChoice);
    }

    private void determineWinner(int playerOneChoice, int playerTwoChoice) {
        if (playerOneChoice == playerTwoChoice) {
            System.out.println(playerOne.getName() + " has chosen " + resolveChoice(playerOneChoice));
            System.out.println(playerTwo.getName() + " has chosen " + resolveChoice(playerTwoChoice));
            System.out.println("This game is a tie!");
        } else if (isPlayerOneWinner(playerOneChoice, playerTwoChoice)) {
            System.out.println(playerOne.getName() + " has chosen " + resolveChoice(playerOneChoice));
            System.out.println(playerTwo.getName() + " has chosen " + resolveChoice(playerTwoChoice));
            System.out.println(playerOne.getName() + " is a winner!");
        } else {
            System.out.println(playerOne.getName() + " has chosen " + resolveChoice(playerOneChoice));
            System.out.println(playerTwo.getName() + " has chosen " + resolveChoice(playerTwoChoice));
            System.out.println(playerTwo.getName() + " is a winner!");
        }
    }

    private boolean isPlayerOneWinner(int playerOneChoice, int playerTwoChoice) {
        return (playerOneChoice == rock && playerTwoChoice == scissors) ||
                (playerOneChoice == scissors && playerTwoChoice == paper) ||
                (playerOneChoice == paper && playerTwoChoice == rock);
    }

    private String resolveChoice(int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Scissors";
            case 2:
                return "Paper";
            default:
                return "invalid choice";
        }
    }
}

