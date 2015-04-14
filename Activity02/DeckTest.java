package Activity02;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeckTest
{
    /**
     * Default constructor for test class DeckTest
     */
    public DeckTest()
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
    public void isEmptyTest()
    {
        Activity02.Deck deck2 = new Activity02.Deck({"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}, {"Clubs","Diamonds","Hearts","Spades"}, {1,2,3,4,5,6,7,8,9,10,11,12,13});
        assertEquals(false, deck2.isEmpty());
    }
    
    
}

