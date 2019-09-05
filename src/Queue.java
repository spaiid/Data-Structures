
import java.util.*;

    public class Queue {

        private int[] arr;
        private int front;
        private int back;
        private int capacity;
        private int count;

        Queue(int size) {

            arr = new int[size];
            front = 0;
            back = -1;
            capacity = size;
            count = 0;

        }

        public void add(int item) {
            if (isFull()) {
                System.out.println("Queue is full, cannot add to queue.");
                System.exit(1);
            }

            back = (back + 1) % capacity;
            arr[back] = item;
            count++;

        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty, cannot remove from queue.");
                System.exit(1);
            }

            front = (front + 1) % capacity;
            count--;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty, cannot peek queue.");
            }

            return arr[front];
        }

        public boolean isFull() {
            return (size() == capacity);
        }

        public boolean isEmpty() {
            return (size() == 0);
        }

        public int size() {
            return count;
        }




    public static void main(String[] args){

        Queue q = new Queue(10);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());

        q.remove();

        q.peek();

        System.out.println(q.peek());

    }




}
