import java.util.*;

public class MonkeyWatcher {

    private int numRounds = 0;

    /**
     * Return number of rounds played
     * @return int number of rounds played
     */
    
    public int getRounds() {
	return numRounds;
    }

    /**
     * Increment number of rounds
	 // This method was altered for Exercise 5
     */
    
    public void incrementRounds() {
	if (numRounds >= 0){
	    numRounds += 1;
	}
	}
	    
}