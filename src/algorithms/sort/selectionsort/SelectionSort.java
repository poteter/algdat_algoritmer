package algorithms.sort.selectionsort;
public class SelectionSort{

    public static int[] selection(int[] input){
        for (int i = 0; i < input.length; i++){
            int smallest = input[i];
            System.out.print(smallest + " ");
            for (int j = i; j < input.length; j++){
                if (smallest > input[j]){
                    smallest = j;
                }
            }
            int a = input[smallest];
            int b = input[i];
            System.out.println(a);
            System.out.println(b);
            input[i] = a;
            input[smallest] = b;
        }
        System.out.println();
        return input;
    }
}
