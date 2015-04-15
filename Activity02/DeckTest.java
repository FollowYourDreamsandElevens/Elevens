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
    public void isEmptyFalse()
    {
        String[] testRank = {"A", "B"};
        String[] testSuit = {"C", "D"};
        int[] testValues = {1, 2};
        Activity02.Deck deck2 = new Activity02.Deck(testRank, testSuit, testValues);
        assertEquals(false, deck2.isEmpty());
    }
    
    @Test
    public void isEmptyTrue()
    {
        String[] testRank = {};
        String[] testSuit = {};
        int[] testValues = {};
        Activity02.Deck deck2 = new Activity02.Deck(testRank, testSuit, testValues);
        assertEquals(true, deck2.isEmpty());
    }


    @Test
    public void sizeTest()
    {
        String[] testRank = {"A", "B", "C"};
        String[] testSuit = {"D", "E", "F"};
        int[] testValues = {1, 2, 3};
        Activity02.Deck deck2 = new Activity02.Deck(testRank, testSuit, testValues);
        assertEquals(9, deck2.size());
    }

    @Test
    public void dealTest()
    {
        String[] testRank = {"A", "B", "C"};
        String[] testSuit = {"D", "E", "F"};
        int[] testValues = {1, 2, 3};
        Activity02.Deck deck2 = new Activity02.Deck(testRank, testSuit, testValues);
        assertNotNull(deck2.deal());
        assertNotNull(deck2.deal());
    }
    
    @Test
    public void dealTest2()
    {
        String[] testRank = {"A", "B"};
        String[] testSuit = {"D", "E"};
        int[] testValues = {1, 2};
        Activity02.Deck deck2 = new Activity02.Deck(testRank, testSuit, testValues);
        assertNotNull(deck2.deal());
        assertNotNull(deck2.deal());
        assertNotNull(deck2.deal());
        assertNotNull(deck2.deal());
        assertNull(deck2.deal());
    }
}







