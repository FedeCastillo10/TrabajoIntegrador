/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pronosticosdeportivos;

/**
 *
 * @author FC
 */
public class Pronostico {
    
    private Partido partido;
    private Equipo equipo;
    private Resultado resultado;
    
    public Pronostico(Partido partido, Equipo equipo, Resultado resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }
    
    public int puntos() {
        if (partido.resultado() == resultado) {
            if (equipo == partido.getEquipo1() || equipo == partido.getEquipo2()) {
                return 3;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}