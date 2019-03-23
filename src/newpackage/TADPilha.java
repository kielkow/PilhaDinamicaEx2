package newpackage;

import java.util.EmptyStackException;

public interface TADPilha {
    
    public boolean isEmpty();
    public int size();
    public void push(int elemento);
    public int pop() throws EmptyStackException;
    public int top() throws EmptyStackException;
    
}
