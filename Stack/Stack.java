
public class Stack{
    private int[] arr;
    private int top = -1;
    public Stack(){
        arr = new int[5];
    }

    public Stack(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isfull(){
        return top == arr.length-1;
    }

    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("stack is full");
            //block execution of code java
        }
        top++;
        arr[top] = item;

    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
            //block execution of code java
        }
        int rv = arr[top];
        top--;
        return rv;
    }

    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
            //block execution of code java
        }
        int rv = arr[top];
        return rv;
    }

    public int size(){
        return top + 1;
    }

    public void Display(){
        for(int i=0;i<top+1;i++){
            System.out.print(arr[i]);
        }
    }
}