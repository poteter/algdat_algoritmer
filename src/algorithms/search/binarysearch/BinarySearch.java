package algorithms.search.binarysearch;
public class BinarySearch {
    public static int rank(Integer key, Integer[] a){
        int lo = 0;
        int hi = a.length - 1;
        int iterations = 0;

        while(lo <= hi){
            iterations++;
            int mid = lo + (hi - lo) /2;

            if(key < a[mid]) hi = mid - 1;
            else if(key > a[mid]) lo = mid + 1;
            else return mid;
        }
        System.out.println("iterations : " + iterations);

        return -1;
    }
}
