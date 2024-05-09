/*
    Los profesores de un instituto tienen algunas características: nombre, 
    apellido, sueldo básico, sueldo total y cédula. 
    El sueldo total es igual al sueldo básico más el 20% del sueldo básico
 */
package paquete1;
import paquete2.SueldoTotal;
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
        SueldoTotal SueldoT1 = new SueldoTotal
        ("Kristhyn","Jimenez",1150503231,460);
        SueldoTotal SueldoT2 = new SueldoTotal
        ("Andrea","Cajamarca",1104714041);
        
        System.out.printf(" %s\n ", SueldoT1);
        
        System.out.printf(" %s\n ", SueldoT2);
    }
    
}
