import java.util.Iterator;
import java.util.Stack;

public class stack_1 {
    public static void main(String[] args) {
        //--creating stack---
        Stack<Integer> s1 = new Stack<>();
        s1.push(2);//insert element in to stack
        s1.push(3);
        s1.push(5);
        s1.push(20);
        s1.push(56);
        System.out.println(s1);
        s1.pop();//delete element from stack
        System.out.println(s1);
        System.out.println(s1.peek());//peek operation (last element of stack)
        boolean status = s1.empty();//is stack empty
        System.out.println(status);
        int index = s1.search(20);//search element
        System.out.println(index);
        Iterator it = s1.iterator();//iterate over stack
        while(it.hasNext()) {
            Object s2 = it.next();
            System.out.println(s2);

        }
        System.out.println(s1.size());//size of stack
        s1.sort(null);//sort a stack
        System.out.println(s1);

    }
}
