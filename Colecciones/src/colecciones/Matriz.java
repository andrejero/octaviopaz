
package colecciones;


public class Matriz {
    //int [][] calificaciones;
    //forma de darle filas y columnas:int [][] calificaciones=new int [3][4];
    int [][] calificaciones={{5,6}, {3,5,9}, {4}};
    
    
    public void matriz(){
        System.out.println(calificaciones[1][2]);
        
        calificaciones[1][2]=10;
        
        //System.out.println(calificaciones[6][9]);
        
        for(int i=0; i<calificaciones.length; i++){
            for(int j=0; j<calificaciones.length; j++){
                System.out.println(calificaciones[i][j] + "\n");
            }
        }
        
        
        
        
    }
    
}
