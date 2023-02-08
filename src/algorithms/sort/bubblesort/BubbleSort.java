package algorithms.sort.bubblesort;
public class BubbleSort {
    public static int[] bubble(int[] input){
        boolean swap = true;
        while (swap){
            swap = false;
            for(int i = 0; i < input.length-1; i++){
                if(input[i] > input[i+1]){
                    int a = input[i];
                    int b = input[i+1];

                    input[i] = b;
                    input[i+1] = a;
                    swap = true;
                }
            }
        }
        return input;
    }
}
