package utils;

/**
 * Created by MelleyMell on 7/6/16.
 */
public class LinkedListQueue <T> implements Queue{
    LinkedListNode head;
    LinkedListNode tail;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(Object element) {

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
