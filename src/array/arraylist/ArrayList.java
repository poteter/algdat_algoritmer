package array.arraylist;

public class ArrayList {
    int size = 0;
    int[] array = new int[size];

    public void add(int a){
        this.size = this.array.length+1;
        int[] newArray = new int[this.size];

        for(int i = 0; i < newArray.length-1; i++){
            newArray[i] = this.array[i];
        }
        newArray[this.size-1] = a;
        this.array = newArray;
    }

    public int[] returnArray(){
        return this.array;
    }
}
