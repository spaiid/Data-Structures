public class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }


    public void push(int item){
        if(isFull()){
            System.out.println("Stack is full.");
        }

        else{
            arr[++top] = item;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }

        return arr[top--];

    }

    public int peek(){
        if(isEmpty())
            System.out.println("Stack is empty.");

        return arr[top];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.peek());
    }

}
