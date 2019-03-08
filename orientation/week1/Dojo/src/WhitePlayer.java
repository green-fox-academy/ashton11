public class WhitePlayer extends Player {

        public WhitePlayer(){
            super.wins = false;
        }

        public boolean isWinner() {
            super.wins = true;
            return wins;
        }

}
