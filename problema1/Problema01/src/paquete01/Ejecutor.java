/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.LibretaNotas;
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
        LibretaNotas Libreta1 = new LibretaNotas("Kristhyn",10,9,10);
        Libreta1.establecerPromedio();
        LibretaNotas Libreta2 = new LibretaNotas("Andrea",9,8,7);
        Libreta2.establecerPromedio();
        
        System.out.printf(" %s\n ", Libreta1);
    }
    
}
