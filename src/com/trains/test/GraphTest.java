package com.trains.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.trains.solution.Town;

/**
 * Clase de prueba para verificar la funcionalidad del grafo.
 */
class GraphTest extends GraphTestSetup{

	 @Test
	    public void testRouteDistance1() {
	        // Prueba para la distancia de la ruta A-B-C
	        assertEquals(9, graph.calculateRouteDistance(new Town("A"), new Town("B"), new Town("C")));
	    }

	    @Test
	    public void testRouteDistance2() {
	        // Prueba para la distancia de la ruta A-D
	        assertEquals(5, graph.calculateRouteDistance(new Town("A"), new Town("D")));
	    }

	    @Test
	    public void testRouteDistance3() {
	        // Prueba para la distancia de la ruta A-D-C
	        assertEquals(13, graph.calculateRouteDistance(new Town("A"), new Town("D"), new Town("C")));
	    }

	    @Test
	    public void testRouteDistance4() {
	        // Prueba para la distancia de la ruta A-E-B-C-D
	        assertEquals(22, graph.calculateRouteDistance(new Town("A"), new Town("E"), new Town("B"), new Town("C"), new Town("D")));
	    }

	    @Test
	    public void testRouteDistance5() {
	        // Prueba para una ruta que no existe A-E-D
	        assertEquals(-1, graph.calculateRouteDistance(new Town("A"), new Town("E"), new Town("D")));
	    }

}
