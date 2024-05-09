/*
 *Un automóvil tiene entre sus características, cédula del dueño, 
marca de vehículo, año de fabricación, valor de vehículo y valor de la matrícula. 
El valor de la matricula es igual al 0.002% del valor de vehículo 
por el número de años de antigüedad del vehículo.
 */
package paquete1;
import paquete2.Matricula;
/**
 *
 * @author LENOVO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matricula Matricula1 = new Matricula
        (1150503231,"Chevrolet",1999,15.987);
        Matricula Matricula2 = new Matricula
        (1104714041,"Ford",2007);
        
        System.out.printf(" %s \n ", Matricula1);
        
        System.out.printf(" %s \n ", Matricula2);
    }
    
}
