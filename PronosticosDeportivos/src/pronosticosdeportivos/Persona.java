/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pronosticosdeportivos;

import java.util.ArrayList;

/**
 *
 * @author FC
 */
public class Persona {

    private String nombre;
    private ArrayList<Pronostico> pronosticos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.pronosticos = new ArrayList<Pronostico>();
    }

    public void agregarPronostico(Pronostico pronostico) {
        pronosticos.add(pronostico);
    }

    public int calcularPuntaje() {
        int puntajeTotal = 0;
        for (Pronostico pronostico : pronosticos) {
            puntajeTotal += pronostico.puntos();
        }
        return puntajeTotal;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pronostico> getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(ArrayList<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }
}
