import org.junit.Assert;
import org.junit.Test;

import static algorithms.search.binarysearch.BinarySearchRecursive.rank;
import static algorithms.sort.bubblesort.BubbleSort.bubble;
import static org.junit.Assert.assertEquals;

public class TestMain {

    @Test
    public void testSearchAndSort(){
        int[] toBeSorted = {3,4,2,1,5,6};
        Integer[] rankArray = {1,2,3,4,5,6};
        int[] bubbleArray = {1,2,3,4,5,6};;
        int key = 3;
        int expectedIndex = 2;

        assertEquals(expectedIndex, rank(rankArray, key));

        Assert.assertArrayEquals(bubbleArray, bubble(toBeSorted));
    }
}
