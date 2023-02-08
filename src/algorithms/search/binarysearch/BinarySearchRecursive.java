package algorithms.search.binarysearch;

import org.junit.jupiter.api.Test;

public class BinarySearchRecursive {
    @Test
    public static int rank(Integer[] a, Integer key){
        return rank(a, key, 0, a.length-1);
    }

    public static int rank(Integer[] a, Integer key, int lo, int hi){
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if(key < a[mid]) return rank(a, key, lo, mid - 1);
        else if(key > a[mid]) return rank(a, key, mid + 1, hi);
        else return mid;
    }
}
