/*
   En una entidad financiera se requiere manejar los cheques. 
   Cada cheque tiene las siguientes propiedades: nombre del cliente, 
   nombre del banco, valor del cheque y comisión que cobra el banco. 
   La comisión del banco es igual al valor del cheque por el 0.003%.
 */
package paquete2;

/**
 *
 * @author LENOVO
 */
public class ComisionBanco {
    
    private String nombrecliente;
    private String nombrebanco;
    private double valorcheque;
    private double comisionbanco;
    
    public ComisionBanco(String nc,String nb,double vc){
        nombrecliente = nc;
        nombrebanco = nb;
        valorcheque = vc;
    }
    
    public ComisionBanco(String nc,String nb){
        nombrecliente = nc;
        nombrebanco = nb;
        valorcheque = 1.598;
    }
    
    public void establecerNombreCliente(String nc){
        nombrecliente = nc;
    }
    
    public void establecerNombreBanco(String nb){
        nombrebanco = nb;
    }
    
    public void establecerValorCheque(double vc){
        valorcheque = vc;
    }
    
    public void establecerComisionBanco(){
        comisionbanco = 0.003 * valorcheque;
    }
    
    public String obtenerNombreCliente(){
        return nombrecliente;
    }
    
    public String obtenerNombreBanco(){
        return nombrebanco;
    }
    
    public double obtenerValorCheque(){
        return valorcheque;
    }
    
    public double obtenerComisionBanco(){
        comisionbanco = 0.003 * valorcheque;
        return comisionbanco;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Comisiones de Bancos  \n\n"
                + "Nombre del Cliente : %s\n"
                + "Nombre del Banco : %s\n"
                + "Valor del Cheque : %.3f\n"
                + "Comision del Banco : %.3f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }
}
