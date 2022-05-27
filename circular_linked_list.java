import java.util.LinkedList;

public class circular_linked_list {
    //--create a circulat linked list--
    Node head, tail;
    class Node{
        int data;
        Node next;
        Node tail;
        
        Node(int data) {
            this.data = data;
        }
    }
    //insert elements in to circular linked list
    void insertElements(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode; 
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    //display circular linked list
    void displayElements() {
        Node n1 = head;
        if(tail == null && head == null) {
            System.out.println("Circular Linked list is empty. Nothing to display");
        }
        else {
            do {
                System.out.print(n1.data + " ");
                n1 = n1.next;
            }while(n1 != head);
            System.out.println();
        }
    }
    //deleting from a linked list
    void deleteElement() {
        if(tail == head) {
            head = null;
            tail = null;
            System.out.println("empty cirucular queue");
        }
        else {
            head = head.next;
            tail.next = head;
        }
    }


    public static void main(String[] args){
        circular_linked_list list1 = new circular_linked_list();
        list1.insertElements(10);
        list1.insertElements(8);
        list1.insertElements(3);
        list1.insertElements(2);
        list1.insertElements(6);
        list1.displayElements();
        list1.deleteElement();
        list1.displayElements();
        list1.deleteElement();
        list1.displayElements();
        list1.deleteElement();
        list1.displayElements();
        list1.deleteElement();
        list1.displayElements();
        list1.deleteElement();
        list1.displayElements();

    }
    
}
