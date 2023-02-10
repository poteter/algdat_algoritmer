package algorithms.sort.selectionsort;
public class SelectionSort{

    public static int[] selection(int[] input){
        int n = input.length;
        for (int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(input[j] < input[min]){
                    min = j;
                }
            }
            int temp = input[min];
            input[min] = input[i];
            input[i] = temp;
        }
        return input;
    }
}
