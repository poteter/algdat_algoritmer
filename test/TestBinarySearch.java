import org.junit.Test;

import static algorithms.search.binarysearch.BinarySearch.rank;
import static org.junit.Assert.assertEquals;

public class TestBinarySearch {

    @Test
    public void testSort(){
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        int index = 3;
        assertEquals(index, rank(4, a));
    }
}
