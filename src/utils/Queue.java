package utils;

/**
 * Created by MelleyMell on 7/6/16.
 */
public interface Queue <T> {
    public void enqueue(T element);
    public T dequeue();
    public boolean isEmpty();
}
