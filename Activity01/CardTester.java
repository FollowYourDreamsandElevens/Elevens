package Activity01;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
    Card card1 = new Card("King","Hearts",10);
    Card card2 = new Card("King","Diamonds",10);
    Card card3 = new Card("King","Hearts",10);
    /**
     * Default constructor for test class CardTest
     */
    public CardTester()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSuit(){
        assertEquals("Hearts",card1.suit());
        assertEquals("Diamonds",card2.suit());
        assertEquals("Hearts",card3.suit());
    }

    @Test
    public void testRank(){
        assertEquals("King",card1.rank());
        assertEquals("King",card2.rank());
        assertEquals("King",card3.rank());
    }

    @Test
    public void testPointValue(){
        assertEquals(10,card1.pointValue(),0);
        assertEquals(10,card2.pointValue(),0);
        assertEquals(10,card3.pointValue(),0);
    }

    @Test
    public void testMatches(){
        assertEquals(false, card1.matches(card2));
        assertEquals(true, card1.matches(card3));
    }

    @Test
    public void testToString(){
        assertEquals("King of Hearts (point value = 10)",card1.toString());
        assertEquals("King of Diamonds (point value = 10)", card2.toString());
        assertEquals("King of Hearts (point value = 10)", card3.toString());
    }
}
