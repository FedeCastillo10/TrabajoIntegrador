/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pronosticosdeportivos;

/**
 *
 * @author FC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Crear los equipos
        Equipo equipo1 = new Equipo("Equipo 1", "Descripción del equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2", "Descripción del equipo 2");

// Crear los partidos
        Partido partido1 = new Partido(equipo1, equipo2, 2, 1);
        Partido partido2 = new Partido(equipo1, equipo2, 1, 2);
        Partido partido3 = new Partido(equipo1, equipo2, 3, 3);

// Crear los pronósticos
        Pronostico pronostico1 = new Pronostico(partido1, equipo1, Resultado.GANADOR);
        Pronostico pronostico2 = new Pronostico(partido2, equipo2, Resultado.EMPATE);
        Pronostico pronostico3 = new Pronostico(partido3, equipo1, Resultado.PERDEDOR);

// Crear las personas
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Maria");
        Persona persona3 = new Persona("Pedro");

// Agregar los pronósticos a cada persona
        persona1.agregarPronostico(pronostico1);
        persona1.agregarPronostico(pronostico2);
        persona1.agregarPronostico(pronostico3);

        persona2.agregarPronostico(pronostico1);
        persona2.agregarPronostico(pronostico2);
        persona2.agregarPronostico(pronostico3);

        persona3.agregarPronostico(pronostico1);
        persona3.agregarPronostico(pronostico2);
        persona3.agregarPronostico(pronostico3);

// Calcular los puntajes de cada persona
        int puntaje1 = persona1.calcularPuntaje();
        int puntaje2 = persona2.calcularPuntaje();
        int puntaje3 = persona3.calcularPuntaje();

// Imprimir los puntajes de cada persona
        System.out.println("Puntaje de " + persona1.getNombre() + ": " + puntaje1);
        System.out.println("Puntaje de " + persona2.getNombre() + ": " + puntaje2);
        System.out.println("Puntaje de " + persona3.getNombre() + ": " + puntaje3);
    }
}
