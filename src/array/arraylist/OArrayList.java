package array.arraylist;

public class OArrayList{
    int size = 0;
    int[] array = new int[size];

    public void add(int a){
        size = array.length+1;
        int[] newArray = new int[size];

        for(int i = 0; i < newArray.length-1; i++){
            newArray[i] = array[i];
        }
        newArray[size-1] = a;
        array = newArray;
    }

    public int indexOf(int value){
        for(int i = 0; i < size; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        size = array.length-1;
        int[] newArray = new int[size];
        for (int i = 0; i <= index; i++){
            if(i == index){
                for (int j = i+1; j < newArray.length+1; j++){
                    newArray[j-1] = array[j];
                }
            }
            else {
                newArray[i] = array[i];
            }
        }
        array = newArray;
    }

    public int[] returnArray(){
        return array;
    }
}
