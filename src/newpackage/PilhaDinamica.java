package newpackage;

import java.util.EmptyStackException;

public class PilhaDinamica implements TADPilha {

    private Node topo;
    private int i;

    public PilhaDinamica() {
        topo = null;
        i = 0;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return i;
        
        //Node aux = topo;
        //int contador = 0;
        //while(aux != null){
        //    contador++;
        //    aux = aux.proximo;
        //}
        //return contador;
        
        
    }

    @Override
    public void push(int elemento) {
        Node novo = new Node(elemento);
        novo.proximo = topo;
        topo = novo;
        i++;
    }

    @Override
    public int pop() throws EmptyStackException {
        if(!isEmpty()){
            Node aux = topo;
            topo = topo.proximo;
            aux.proximo = null;
            i--;
            return aux.elemento;
        }
        throw new EmptyStackException();
    }

    @Override
    public int top() throws EmptyStackException {
         if(!isEmpty()){
            return topo.elemento;
        }
        throw new EmptyStackException();
    }
    
    
    
    
    
    
    
    
    public double calcula(String expressao){
           
     String[] textoSeparado = expressao.split(" "); 
     double x, y, soma, mult, sub, div, resultado = 0;
     
     
     
     
     for(int i = 0; i <= textoSeparado.length-1; i++){
         
         
         if(textoSeparado[i].equals("*")){
             
            x = Double.parseDouble(textoSeparado[i-1]);
            y = Double.parseDouble(textoSeparado[i-2]);
            mult = x*y;
            textoSeparado[i] = String.valueOf(mult);
            
            textoSeparado[i-1] = null;
            textoSeparado[i-2] = null;
            
            if(i >= 3){
                if(textoSeparado[i-3] != null){
                    textoSeparado[i-1] = textoSeparado[i-3];
                    textoSeparado[i-3] = null;
                }
            }
         }
         if(textoSeparado[i].equals("+")){
            x = Double.parseDouble(textoSeparado[i-1]);
            y = Double.parseDouble(textoSeparado[i-2]);
            soma = x+y;
            textoSeparado[i] = String.valueOf(soma);
            
            textoSeparado[i-1] = null;
            textoSeparado[i-2] = null;
            
            if(i >= 3){
                if(textoSeparado[i-3] != null){
                    textoSeparado[i-1] = textoSeparado[i-3];
                    textoSeparado[i-3] = null;
                }
            }
         }
         if(textoSeparado[i].equals("-")){
            x = Double.parseDouble(textoSeparado[i-1]);
            y = Double.parseDouble(textoSeparado[i-2]);
            sub = x-y;
            textoSeparado[i] = String.valueOf(sub);
            
            textoSeparado[i-1] = null;
            textoSeparado[i-2] = null;
            
            if(i >= 3){
                if(textoSeparado[i-3] != null){
                    textoSeparado[i-1] = textoSeparado[i-3];
                    textoSeparado[i-3] = null;
                }
            }
         }
         if(textoSeparado[i].equals("/")){
            x = Double.parseDouble(textoSeparado[i-1]);
            y = Double.parseDouble(textoSeparado[i-2]);
            div = x/y;
            textoSeparado[i] = String.valueOf(div);
            
            textoSeparado[i-1] = null;
            textoSeparado[i-2] = null;
            
            if(i >= 3){
                if(textoSeparado[i-3] != null){
                    textoSeparado[i-1] = textoSeparado[i-3];
                    textoSeparado[i-3] = null;
                }
            }
         }
         
         
         
    }
        resultado = Double.parseDouble(textoSeparado[textoSeparado.length-1]);       
        return resultado; 
    }
  
}