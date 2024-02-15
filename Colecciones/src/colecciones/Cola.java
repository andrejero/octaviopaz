
package colecciones;

import java.util.LinkedList;
import java.util.Queue;


public class Cola {
    public void cola(){
    Queue <String> nombres = new LinkedList();
    
    nombres.offer("Andrea");
    nombres.offer("Ian");
    nombres.offer("Maximiliano");
    nombres.offer("Ana");
    nombres.offer("Luis");
    
        System.out.println("nombre a eliminar:"  + nombres.poll()); 
        System.out.println(nombres);
        System.out.println("nombre a eliminar:"  + nombres.poll()); 
        System.out.println(nombres);
        System.out.println("nombre a eliminar:"  + nombres.poll()); 
        System.out.println(nombres);
    
    
}
    
}
