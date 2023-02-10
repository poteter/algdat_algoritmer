package array;
public class ArrayAdd {
    public static int[] add(int a, int[] old){
        int[] newArray = new int[old.length + 1];
        for (int i = 1; i < old.length; i++){
            newArray[i] = old[i];
        }
        newArray[newArray.length - 1] = a;
        return newArray;
    }

    public static int[] addAtLocation(int a, int location, int[] old){
        int[] newArray = new int[old.length + 1];
        for (int i = 0; i <= location; i++){
            if(i == location){
                newArray[i] = a;
                System.out.println("if " + i);
                for (int j = i+1; j < newArray.length; j++){
                    newArray[j] = old[j-1];
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
