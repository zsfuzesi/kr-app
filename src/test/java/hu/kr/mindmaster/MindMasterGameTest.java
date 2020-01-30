package hu.kr.mindmaster;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MindMasterGameTest {

    private MindMasterGame mindMasterGame;

    @Before
    public void setUp(){
        mindMasterGame = new MindMasterGame();
        mindMasterGame.setMasterSet(
                Arrays.asList(
                        PegColor.RED,
                        PegColor.YELLOW,
                        PegColor.BLUE,
                        PegColor.GREEN));
    }

    @Test
    public void testNothing(){
        GuessResult guessResult =
            mindMasterGame.guess(
                Arrays.asList(
                        PegColor.WHITE,
                        PegColor.WHITE,
                        PegColor.WHITE,
                        PegColor.WHITE));

        assertEquals(guessResult.getBlackCount(),0);
        assertEquals(guessResult.getWhiteCount(),0);
    }

    @Test
    public void testOneWhite(){
        GuessResult guessResult =
            mindMasterGame.guess(
                Arrays.asList(
                        PegColor.RED,
                        PegColor.WHITE,
                        PegColor.WHITE,
                        PegColor.WHITE));

        assertEquals(guessResult.getBlackCount(),0);
        assertEquals(guessResult.getWhiteCount(),1);
    }
}
