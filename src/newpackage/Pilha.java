/*package newpackage;

import java.util.EmptyStackException;

public class Pilha implements TADPilha{
    
    private int vetor[];
    private int topo;
    
    public Pilha(int tamanho){
        this.vetor = new int[tamanho];
        this.topo = -1;
    }
    
    @Override
    public boolean isEmpty() {
        return this.topo == -1;
    }

    public boolean isFull() {
        return this.topo == this.vetor.length - 1;
    }

    @Override
    public int size() {
        return this.topo + 1;
    }

    @Override
    public void push(int elemento) {
        if(!this.isFull()){
            this.topo++;
            this.vetor[this.topo] = elemento;
        }
    }

    @Override
    public int pop() throws EmptyStackException{
        if(!this.isEmpty()){
            int temp = this.vetor[this.topo];
            this.topo--;
            return temp;
        }
        throw new EmptyStackException();
    }

    @Override
    public int top() throws EmptyStackException{
        if(!this.isEmpty())
            return this.vetor[this.topo];
        
        throw new EmptyStackException();
    }
    
}
*/