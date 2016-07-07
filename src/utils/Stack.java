package utils;

/**
 * Created by MelleyMell on 7/6/16.
 */
public interface Stack <T> {
    public T top();
    public T pop();
    public void push(T element);
    public boolean isEmpty();
}
