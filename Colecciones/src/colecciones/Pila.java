
package colecciones;

import java.util.Stack;

public class Pila {
    Stack<String>camisas = new Stack<>();

    
    public void pila(){
        camisas.push("camisa blanca");
        camisas.push("camisa roja");
        camisas.push("camisa rosa");
        camisas.push("camisa verde");
        System.out.println(camisas);
        
        
        camisas.pop();
        System.out.println(camisas);
        
        
        System.out.println(camisas.peek());
        
        System.out.println("pocision de la camisa: " + camisas.search("camisa blanca"));
        
        System.out.println("la pila esta vacia" + camisas.empty());
        
        
        
        while(camisas.empty()){
            System.out.println("");
        }
     
        
        
}
   
    
}
