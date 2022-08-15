import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue orders = new LinkedList();

        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");

        System.out.println("[QUEUE SIZE]->" + orders.size());
        System.out.println("[POLL ORDER 1]->" + orders.poll());

        System.out.println("[QUEUE SIZE]->" + orders.size());
        System.out.println("[POLL ORDER 2]->" + orders.poll());

        System.out.println("[QUEUE SIZE]->" + orders.size());
        System.out.println("[POLL ORDER 3]->" + orders.poll());
    }
}
