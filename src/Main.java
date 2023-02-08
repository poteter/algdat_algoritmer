import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static algorithms.search.binarysearch.BinarySearchRecursive.rank;
import static algorithms.search.binarysearch.BinarySearch.rank;
import static algorithms.sort.bubblesort.BubbleSort.bubble;

public class Main {
    public static void main(String[] args) {
        Integer[] largeIntArray;
        largeIntArray = readIntFile().toArray(new Integer[0]);
        Arrays.sort(largeIntArray);

        for (int i = 0; i<10; i++){
            long startTimeRecursion = System.nanoTime();
            System.out.println("\nKey   : " + 6583 +  "\nIndex : " + rank(largeIntArray, 6583));
            long endTimeRecursion = System.nanoTime();
            long elapsedTimeRecursion = (endTimeRecursion - startTimeRecursion);
            System.out.println("BinarySearchRecursion execution time : " + elapsedTimeRecursion);

            long startTime = System.nanoTime();
            runBinary(6583, largeIntArray);
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime);
            System.out.println("BinarySearch execution time : " + elapsedTime);
            System.out.println();
        }
    }

    public static void runBinary(Integer k, Integer[] input){
        System.out.println("\nKey   : " + k +  "\nIndex : " + rank(k, input));
    }

    public static int[] runBubble(){
        int[] input = {22,11,43,23,56,87,765,432,1,23,21,4,2,5,7,8,9,4,2,21,32,43,1,13,14,88};

        for (int i : bubble(input)){
            System.out.print(i + " ");
        }

        return input;
    }

    public static ArrayList<Integer> readIntFile(){
        String filePath = "E:\\skole\\semester2\\algdat\\sample_Data\\large_data_set.txt";
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