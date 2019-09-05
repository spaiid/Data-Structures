import javax.xml.soap.Node;
import java.util.*;

public class LinkedList {

    Node head;

    static class Node{

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList add(LinkedList list, int data){

        Node n = new Node(data);
        n.next = null;

        if(list.head == null){
            list.head = n;
        }

        else {
            Node last = list.head;
            while(last.next != null){

                last = last.next;

            }
            last.next = n;
        }
        return list;
    }

    public static void remove(LinkedList list, int index){

        Node curr = list.head;
        Node prev = null;

        int count = 0;

        if(index == 0 && curr != null){
            list.head = curr.next;
        }

        while(curr != null) {
            if (count == index) {
                prev.next = curr.next;
                break;
            } else {
                prev = curr;
                curr = curr.next;
                count++;
            }
        }

    }

    public static void printList(LinkedList list){
        Node curr = list.head;

        while(curr != null) {

            System.out.println(curr.data);
            curr = curr.next;

            }

        }



    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.add(list, 1);
        list.add(list, 2);
        list.add(list, 3);

        printList(list);

        list.remove(list, 1);

        printList(list);

    }
}
