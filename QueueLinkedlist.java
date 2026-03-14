import java.util.*;
/*public class QueueLinkedlist{
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }    
}*/
public class QueueLinkedlist {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static boolean isEmpty() {
        return s1.isEmpty();
    }
    public static void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
    public static void main(String[] args) {
        QueueLinkedlist.add(10);
        QueueLinkedlist.add(20);
        QueueLinkedlist.add(30);

        while (!QueueLinkedlist.isEmpty()) {
            System.out.println(QueueLinkedlist.peek());
            QueueLinkedlist.remove();
        }
    }
}
