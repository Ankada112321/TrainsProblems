package com.trains.solution;

/**
 * Representa una ruta entre dos ciudades con una distancia específica.
 */
public class Route {
    private Town start;
    private Town end;
    private int distance;

    /**
     * Constructor para inicializar la ruta con ciudades de inicio y fin, y la distancia.
     * @param start La ciudad de inicio.
     * @param end La ciudad de fin.
     * @param distance La distancia entre las ciudades.
     */
    public Route(Town start, Town end, int distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    /**
     * Obtiene la ciudad de inicio.
     * @return La ciudad de inicio.
     */
    public Town getStart() {
        return start;
    }

    /**
     * Obtiene la ciudad de fin.
     * @return La ciudad de fin.
     */
    public Town getEnd() {
        return end;
    }

    /**
     * Obtiene la distancia entre las ciudades.
     * @return La distancia entre las ciudades.
     */
    public int getDistance() {
        return distance;
    }
}
