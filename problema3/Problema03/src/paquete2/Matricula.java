/*
 * Un automóvil tiene entre sus características, cédula del dueño, 
marca de vehículo, año de fabricación, valor de vehículo y valor de la matrícula. 
El valor de la matricula es igual al 0.002% del valor de vehículo 
por el número de años de antigüedad del vehículo.
 */
package paquete2;

/**
 *
 * @author LENOVO
 */
public class Matricula {
    private int ceduladueño;
    private String marcavehiculo;
    private int añofabricacion;
    private double valorvehiculo;
    private double valormatricula;
    private int añosantiguedadvehiculo;
    
    public Matricula(int cd, String mv,int af,double vv){
        ceduladueño = cd;
        marcavehiculo = mv;
        añofabricacion = af;
        valorvehiculo = vv;
    }
    
    public Matricula(int cd, String mv,int af ){
        ceduladueño = cd;
        marcavehiculo = mv;
        añofabricacion = af;
        valorvehiculo = 1.589;
    }
    
    public void establecerCedulaDueño(int cd){
        ceduladueño = cd;
    }
    
    public void establecerMarcaVehiculo(String mv){
        marcavehiculo = mv;
    }
    
    public void establecerAñoFabricacion(int af){
        añofabricacion = af;
    }
    
    public void establecerValorVehiculo(double vv){
        valorvehiculo = vv;
    }
    
    public void establecerAñosAntiguedadVehiculo(){
        añosantiguedadvehiculo = 2024 - añofabricacion;
    }
    
    public void establecerValorMatricula(){
        valormatricula = 0.002 * valorvehiculo ;
    }
    
    public int obtenerCedulaDueño(){
        return ceduladueño;
    }
    
    public String obtenerMarcaVehiculo(){
        return marcavehiculo;
    }
    
    public int obtenerAñoFabricacion(){
        return añofabricacion;
    }    
    
    public double obtenerValorVehiculo(){
        return valorvehiculo;
    }
    
    public int obtenerAñosAntiguedadVehiculo(){
        añosantiguedadvehiculo = 2024 - añofabricacion;
        return añosantiguedadvehiculo;
    }
    
    public double obtenerValorMatricula(){
        valormatricula = 0.002 * valorvehiculo ;
        return valormatricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Factura del Vehiculo Comprado  \n\n"
                + "Cedula del Dueño : %d\n"
                + "Marca del Vehiculo : %s\n"
                + "Año de Fabricacion del Vehiculo : %d\n"
                + "Valor del Vehiculo : %.3f\n"
                + "Años de Antiguedad del Vehiculo : %d\n"
                + "Valor de Matricula del Vehiculo : %.3f\n",
                obtenerCedulaDueño(),
                obtenerMarcaVehiculo(),
                obtenerAñoFabricacion(),
                obtenerValorVehiculo(),
                obtenerAñosAntiguedadVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
