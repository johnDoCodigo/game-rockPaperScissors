public class Player {

    // comment added

    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getPlayerChoice() {
        return (int)Math.floor(Math.random() * 3); // generates 3 random numbers
    }

}

