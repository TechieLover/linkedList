/**
 * Created by parwindg on 4/24/2017.
 */
public class LinkedList {
    private int length = 0;

    public LinkedList() {
        length = 0;
    }

    ListNode head;

    private synchronized ListNode getHead() {
        return head;
    }
}
