package Activity09;

import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards  ) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        if (containsPairSum11(selectedCards) || containsJQK(selectedCards)){
            return true;
        }
        else{
            return false;}
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        //cycle through cards w/ for loop
        //if rank = Ace check for 10, if 2 check 9, if 3 check 8, if 4 check 7, if 5 check 6, if 6 check 5, etc
        //if rank = JQK check fo QK, KJ, QJ
        boolean returnFinal = false;
        for (int j = 0; j<BOARD_SIZE; j++)
        {
            Card cardCheck = cardAt(j);
            int valueCheck = cardCheck.pointValue();
                for (int k = 0; k<BOARD_SIZE; k++)
                {
                    Card cardCheck2 = cardAt(k);
                    int valueCheck2 = cardCheck2.pointValue();
                    if (j != k && (valueCheck+valueCheck2 == 11)){
                    returnFinal = true;}
                }
        }
        return returnFinal;
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        int numberOfCards = selectedCards.size();
        boolean returnTF = false;
        if (numberOfCards == 2){
            int card1Index = selectedCards.get(0);
            int card2Index = selectedCards.get(1);
            Card card1 = cardAt(card1Index);
            Card card2 = cardAt(card2Index);
            int card1Value = card1.pointValue();
            int card2Value = card2.pointValue();
            if (card1Value + card2Value == 11){
                return true;}
            else {
                return false;}
        }
        else{
            return false;}
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        int numberOfCards = selectedCards.size();
        if (numberOfCards == 3){  
            int card1Index = selectedCards.get(0);
            int card2Index = selectedCards.get(1);
            int card3Index = selectedCards.get(2);
            Card card1 = cardAt(card1Index);
            Card card2 = cardAt(card2Index);
            Card card3 = cardAt(card3Index);
            String card1Rank = card1.rank();
            String card2Rank = card2.rank();
            String card3Rank = card3.rank();
            boolean option1 = (card1Rank.equals("jack") && card2Rank.equals("queen") && card3Rank.equals("king"));
            boolean option2 = (card1Rank.equals("jack") && card2Rank.equals("king") && card3Rank.equals("queen"));
            boolean option3 = (card1Rank.equals("queen") && card2Rank.equals("jack") && card3Rank.equals("king"));
            boolean option4 = (card1Rank.equals("queen") && card2Rank.equals("king") && card3Rank.equals("jack"));
            boolean option5 = (card1Rank.equals("king") && card2Rank.equals("queen") && card3Rank.equals("jack"));
            boolean option6 = (card1Rank.equals("king") && card2Rank.equals("jack") && card3Rank.equals("queen"));
            if (option1 || option2 || option3 || option4 || option5 || option6){
                return true;}
            else {
                return false;}
        }
        else{
            return false;}
    }
}
