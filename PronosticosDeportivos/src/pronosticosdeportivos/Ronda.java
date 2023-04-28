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


public class Ronda {
    private String nro;
    private ArrayList<Partido> partidos;
    
    public Ronda(String nro, ArrayList<Partido> partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }
    
    public int puntos() {
        int puntos = 0;
        for (Partido p : partidos) {
            if (p.resultado() == Resultado.GANADOR) {
                puntos += 3;
            } else if (p.resultado() == Resultado.EMPATE) {
                puntos += 1;
            }
        }
        return puntos;
    }
    
    public String getNro() {
        return nro;
    }
    
    public void setNro(String nro) {
        this.nro = nro;
    }
    
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    
    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
}
