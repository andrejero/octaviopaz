
package colecciones;

import java.util.LinkedList;


public class LinkedLista {
    
    public void linked(){
        LinkedList <String> lista = new LinkedList();
        lista.add(0,"Python");
        lista.add(1,"Java");
        lista.add(2,"Javascript");
        lista.add(3,"C#");
        lista.add(4,"SQL");
        
        System.out.println(lista);
        System.out.println(lista.get(0));
        
        lista.remove(0);
        System.out.println(lista);
        
        lista.set(4, "HTML");
        System.out.println(lista);
        
        
        
    }
    
}
