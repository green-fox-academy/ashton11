import org.junit.Assert;
import org.junit.Test;

public class PlayerTests {

    BlackPlayer blackPlayer = new BlackPlayer();
    WhitePlayer whitePlayer = new WhitePlayer();
    @Test
    public void isWinner_blackWins_true(){
        Assert.assertTrue(blackPlayer.isWinner());
    }
    @Test
    public void isWinner_whiteWins_true(){
        Assert.assertTrue(whitePlayer.isWinner());
    }
}

