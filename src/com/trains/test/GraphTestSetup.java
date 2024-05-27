package com.trains.test;
import org.junit.jupiter.api.BeforeEach;

import com.trains.solution.Graph;
import com.trains.solution.Town;
/**
 * Clase de configuración para inicializar el grafo antes de cada prueba.
 */
public class GraphTestSetup {
	protected Graph graph;
    /**
     * Inicializa el grafo con las rutas antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        graph = new Graph();
        graph.addRoute(new Town("A"), new Town("B"), 5);
        graph.addRoute(new Town("B"), new Town("C"), 4);
        graph.addRoute(new Town("C"), new Town("D"), 8);
        graph.addRoute(new Town("D"), new Town("C"), 8);
        graph.addRoute(new Town("D"), new Town("E"), 6);
        graph.addRoute(new Town("A"), new Town("D"), 5);
        graph.addRoute(new Town("C"), new Town("E"), 2);
        graph.addRoute(new Town("E"), new Town("B"), 3);
        graph.addRoute(new Town("A"), new Town("E"), 7);
    }
}
