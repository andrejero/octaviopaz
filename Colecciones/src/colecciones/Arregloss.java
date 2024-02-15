
package colecciones;

public class Arregloss {
    double[] precios={15.5, 20.6, 30.7};
    
    public void arreglos(){
        System.out.println(precios);
        System.out.println(precios[2]);
        precios[1]=10.00;
        System.out.println(precios);
        
        for(int i=0; i <precios.length;i++){
            System.out.println(precios[i]);
    }
    }
    
}
