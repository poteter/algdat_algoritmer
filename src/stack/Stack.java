package stack;

public class Stack {
    private int size;
    private int top = -1;
    private int[] intStack;

    public Stack(int size){
        this.size = size;
        this.intStack = new int[this.size];
    }

    public void push(int input){
        if((top + 1) == size) System.out.println("Stack overflow");
        else{
            top += 1;
            intStack[top] = input;
        }
    }

    public int pop(){
        if(top < 0) System.out.println("Stack empty");
        else{
            int temp = intStack[top];
            intStack[top] = 0;
            top -= 1;
            return temp;
        }
        return -1;
    }

    public int top(){
        if(top < 0) System.out.println("Stack empty");
        else{
            return intStack[top];
        }
        return -1;
    }

    public boolean empty(){
        if(top < 0) return true;
        else{
            return false;
        }
    }

    public int size(){
        if(top < 0) System.out.println("Stack empty");
        else{
            return top + 1;
        }
        return -1;
    }
}
