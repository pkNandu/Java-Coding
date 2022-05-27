//--Queue class--
class QueueUsingArray {
    int front_Q, rear_Q;
    int capacityOfQueue;
    static int[] q1;
//--constructor for Queue
    QueueUsingArray(int size) {
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }
    //enqueue operation in queue
    void enqueue(int value) {
        if (rear_Q == capacityOfQueue) {
            System.out.println("Queue is full");
        }
        else {
            q1[rear_Q] = value;
            rear_Q++;
        }
    }
    //dequeue operation in queue
    void dequeue() {
        if(rear_Q == 0) {
            System.out.println("Queue is empty");
        }
        else {
            for(int i=0; i<rear_Q-1; i++) {
                q1[i] = q1[i+1];
            }
            rear_Q--;
        }
    }
    //display operation in queue
    void display() {
        if(rear_Q == 0) {
            System.out.println("Queue is empty");
        }
        else {
            for(int i=0; i<rear_Q; i++) {
                System.out.print(q1[i]);
            }
            System.out.println();
        }
    }

}

public class queue_1 {
    public static void main(String[] args) {
        QueueUsingArray q2 = new QueueUsingArray(5);
        q2.display();//o/p :queue empty
        q2.dequeue();//o/p :queue empty
        System.out.println("Enqueue operation : ");
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);
        q2.enqueue(8);   
        q2.enqueue(5);
        q2.enqueue(4);//o/p: queue full
        q2.display();
        System.out.println("deque operation : ");
        q2.dequeue();
        q2.display();

    }
}
