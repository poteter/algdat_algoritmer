import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import array.arraylist.*;
import stack.*;

import static algorithms.search.binarysearch.BinarySearchRecursive.rank;
import static algorithms.search.binarysearch.BinarySearch.rank;
import static algorithms.sort.selectionsort.SelectionSort.selection;
import static array.ArrayDelete.*;
import static array.ArrayAdd.*;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println("is stack empty : " + stack.empty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("top : " + stack.top());
        System.out.println("size of stack : " + stack.size());
        System.out.println("pop : " + stack.pop());
        System.out.println("size of stack : " + stack.size());
        System.out.println("top : " + stack.top());
        stack.push(6);
        System.out.println("top : " + stack.top());
        System.out.println("is stack empty : " + stack.empty());
        System.out.println("size of stack : " + stack.size());
        stack.push(2);
        System.out.println("push 3");
        stack.push(3);
        System.out.println("size : " + stack.size());
        System.out.println("push 6");
        stack.push(6);
    }

    public void safe(){
        int[] testArray = {1,2,3,5,6,7,8,9};
        int[] testArrayRnd = {5,3,8,1,3,2,9};
        //int[] newArray = addStart(9, testArray);
        //int[] newArray = addEnd(9, testArray);
        //int[] newArray = addAtLocation(4, 3, testArray);
        //int[] newArray = deleteEnd(testArray);
        //int[] newArray = deleteStart(testArray);
        //int[] newArray = deleteAtLocation(3, testArray);
        //for(int i = 0; i < newArray.length; i++){
        //    System.out.print(newArray[i] + " ");
        //}
        //for(int i : selection(testArrayRnd)){
        //    System.out.print(i + " ");
        //}
        OArrayList arrayList = new OArrayList();

        arrayList.add(12);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(12334);
        for (int i : arrayList.returnArray()){
            System.out.println(i);
        }

        System.out.println();
        arrayList.remove(arrayList.indexOf(3));
        for (int i : arrayList.returnArray()){
            System.out.println(i);
        }

        System.out.println();
        arrayList.add(2112);
        for (int i : arrayList.returnArray()){
            System.out.println(i);
        }
    }

    public static void speedTest(){
        Integer[] largeIntArray = Objects.requireNonNull(readIntFile()).toArray(new Integer[0]);
        Arrays.sort(largeIntArray);

        for (int i = 0; i<10; i++) {
            long startTimeRecursion = System.nanoTime();
            System.out.println("\nKey   : " + 6583 + "\nIndex : " + rank(largeIntArray, 6583));
            long endTimeRecursion = System.nanoTime();
            long elapsedTimeRecursion = (endTimeRecursion - startTimeRecursion); // milliseconds
            System.out.println("BinarySearchRecursion execution time : " + elapsedTimeRecursion);

            long startTime = System.nanoTime();
            runBinary(6583, largeIntArray);
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime); // milliseconds
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