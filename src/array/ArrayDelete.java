package array;

public class ArrayDelete {
    public static int[] deleteEnd(int[] old){
        int[] newArray = new int[old.length-1];
        for(int i = 0; i < old.length-1; i++){
            newArray[i] = old[i];
        }
        return newArray;
    }

    public static int[] deleteStart(int[] old){
        int[] newArray = new int[old.length-1];
        for(int i = 1; i < old.length; i++){
            newArray[i-1] = old[i];
        }
        return newArray;
    }

    public static int[] deleteAtLocation(int location, int[] old){
        int[] newArray = new int[old.length - 1];
        for (int i = 0; i <= location; i++){
            if(i == location){
                System.out.println("if " + i);
                for (int j = i+1; j < newArray.length+1; j++){
                    newArray[j-1] = old[j];
                }
            }
            else {
                newArray[i] = old[i];
                System.out.println("else " + newArray[i]);
            }
        }
        return newArray;
    }
}
