import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static algorithms.search.binarysearch.BinarySearchRecursive.rank;
import static algorithms.search.binarysearch.BinarySearch.rank;

public class Main {
    public static void main(String[] args) {
        Integer[] largeIntArray;
        largeIntArray = readIntFile().toArray(new Integer[0]);
        Arrays.sort(largeIntArray);

        for (int i = 0; i<10; i++){
            long startTimeRecursion = System.nanoTime();
            System.out.println("\nKey   : " + 6583 +  "\nIndex : " + rank(largeIntArray, 6583));
            long endTimeRecursion = System.nanoTime();
            long elapsedTimeRecursion = (endTimeRecursion - startTimeRecursion) / 1000000; // milliseconds
            System.out.println("BinarySearchRecursion execution time : " + elapsedTimeRecursion);

            long startTime = System.nanoTime();
            runBinary(6583, largeIntArray);
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime) / 1000000; // milliseconds
            System.out.println("BinarySearch execution time : " + elapsedTime);
            System.out.println();
        }
    }

    public static void runBinary(Integer k, Integer[] input){
        System.out.println("\nKey   : " + k +  "\nIndex : " + rank(k, input));
    }

    public static ArrayList<Integer> readIntFile(){
        String filePath = "dataSets/large_data_set.txt";
        ArrayList<Integer> resultArray = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()){
                resultArray.add(Integer.parseInt(scanner.next()));
            }
            scanner.close();
            fileReader.close();
            return resultArray;
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}