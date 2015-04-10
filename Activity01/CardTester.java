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
    /**
     * Default constructor for test class CardTest
     */
    public CardTester()
    {
        Card card1 = new Card("King","Hearts",10);
        Card card2 = new Card("King","Diamonds",10);
        Card card3 = new Card("Queen","Hearts",10);
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
     * Tests the 
     */
    @test
    public void testCard1(){
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
}
