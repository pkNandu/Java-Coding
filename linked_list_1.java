import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class linked_list_1 {
    public static void main(String [] args) {
        //--creating an linked list in java--
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.add(0);//adding elements in linked list
        l1.add(1);
        l1.add(2);
        l1.add(3);// adding elements in linked list
        l1.add(4);
        l1.add(5);

        // l1.add(0, 0);
        l1.remove(2);//remove elements from linked list
        l1.removeFirst();
        l1.removeLast();

        Iterator it = l1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println("size : "+ l1.size());//size of linked list
        boolean b1 = l1.contains(7);//check element is in linked list or not
        System.out.println("is 7 in linked list : " + b1);

        //copy elements from stack to linked list
        System.out.println("copy elements from stack to linked list");
        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();

        //push element in to stack
        s1.push("hello");
        s1.push("hai");
        //copy s1 to l2
        l2.addAll(s1);
        
        Iterator it1 = l2.iterator();
            while(it1.hasNext()) {
                System.out.println(it1.next());
            }
        

    }
}
