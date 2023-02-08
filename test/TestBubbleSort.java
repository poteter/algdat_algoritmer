import org.junit.Assert;
import org.junit.Test;

import static algorithms.sort.bubblesort.BubbleSort.bubble;

public class TestBubbleSort {

    @Test
    public void testSort(){
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,1,5,4};
        Assert.assertArrayEquals(a, bubble(b));
    }
}
