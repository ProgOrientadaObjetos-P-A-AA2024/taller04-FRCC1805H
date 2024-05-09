/*
 * Los profesores de un instituto tienen algunas características: nombre, 
    apellido, sueldo básico, sueldo total y cédula. 
    El sueldo total es igual al sueldo básico más el 20% del sueldo básico.
 * 
 */
package paquete2;

/**
 *
 * @author LENOVO
 */
public class SueldoTotal {
    private String nombreprofesor;
    private String apellidoprofesor;
    private int cedula;
    private double sueldobasico;
    private double sueldototal;
    
    public SueldoTotal(String n,String a,int c, double sb){
        nombreprofesor = n;
        apellidoprofesor = a;
        cedula = c;
        sueldobasico = sb;
    }
    
    public SueldoTotal(String n,String a,int c){
        nombreprofesor = n;
        apellidoprofesor = a;
        cedula = c;
        sueldobasico = 460;
    }
    
    public void establecerNombreProfesor(String n){
        nombreprofesor = n;
    }
    
    public void establecerApellidoProfesor(String a){
        apellidoprofesor = a;
    }
    
    public void establecerCedula(int c){
        cedula = c;
    }
    
    public void establecerSueldoBasico(double sb){
        sueldobasico = sb;
    }
    
    public void establecerSueldoTotal(){
        sueldototal = 0.2 + sueldobasico;
    }
    
    public String obtenerNombreProfesor(){
        return nombreprofesor;
    }
    
    public String obtenerApellidoProfesor(){
        return apellidoprofesor;
    }
    
    public int obtenerCedula(){
        return cedula;
    }
    
    public double obtenerSueldoBasico(){
        return sueldobasico;
    }
    
    public double obtenerSueldoTotal(){
        sueldototal = 0.2 + sueldobasico;
        return sueldototal;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Instituto Sueldo del Profesor \n\n"
                + "Nombre del Profesor : %s\n"
                + "Apellido del Profesor : %s\n"
                + "Cedula : %d\n"
                + "Sueldo Basico : %.2f\n"
                + "Sueldo Total : %.2f\n",
                obtenerNombreProfesor(),
                obtenerApellidoProfesor(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
    }
}
