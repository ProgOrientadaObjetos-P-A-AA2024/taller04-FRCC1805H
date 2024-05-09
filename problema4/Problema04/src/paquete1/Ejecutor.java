/*
 * En una entidad financiera se requiere manejar los cheques. 
   Cada cheque tiene las siguientes propiedades: nombre del cliente, 
   nombre del banco, valor del cheque y comisión que cobra el banco. 
   La comisión del banco es igual al valor del cheque por el 0.003%.
 */
package paquete1;
import paquete2.ComisionBanco;
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
        ComisionBanco ComisionB1 = new ComisionBanco
        ("Rodrigo Narvaez","Banco Rumiñahui",25.598);
        ComisionBanco ComisionB2 = new ComisionBanco
        ("Ruth Calva","Banco Rumiñahui");
        
        System.out.printf(" %s \n ", ComisionB1);
        
        System.out.printf(" %s \n ", ComisionB2);
    }
    
}
