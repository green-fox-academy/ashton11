public class BlackPlayer extends Player {
    public BlackPlayer(){
        super.wins = false;
    }

    public boolean isWinner() {
        super.wins = true;
        return wins;
    }
}
