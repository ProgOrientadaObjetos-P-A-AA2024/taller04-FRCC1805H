/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author LENOVO
 */
public class LibretaNotas {

    private String nombreestudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreestudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
    public LibretaNotas(String n, double c1, double c2) {
        nombreestudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Libreta de calificaciones \n"
                + "Nombre del Estudiante : %s\n"
                + "Calificacion1 : %.3f\n"
                + "Calificacion2 : %.3f\n"
                + "Calificacion3 : %.3f\n"
                + "Promedio Final : %.3f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
    
    public void establecernombreEstudiante(String n) {
        nombreestudiante = n;
    }

    public void establecerCalificacion1(double c1) {
        calificacion1 = c1;
    }

    public void establcerCalificacion2(double c2) {
        calificacion2 = c2;
    }

    public void establcerCalificacion3(double c3) {
        calificacion3 = c3;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreestudiante;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        return promedio;
    }
}
