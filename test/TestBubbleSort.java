import org.junit.Assert;
import org.junit.Test;
public class TestBubbleSort {

    @Test
    public void testSort(){
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,1,5,4};
        Assert.assertArrayEquals(a, BubbleSort.bubble(b));
    }
}
