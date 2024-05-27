package com.trains.solution;
import java.util.*;

/**
 * Representa un grafo dirigido donde los nodos son ciudades y las aristas son rutas con distancias.
 */
public class Graph {
    // Mapa de adyacencia para almacenar las rutas desde cada ciudad
    private Map<Town, List<Route>> adjacencyList;

    /**
     * Constructor para inicializar el grafo.
     */
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    /**
     * Agrega una ruta al grafo.
     * @param start La ciudad de inicio.
     * @param end La ciudad de fin.
     * @param distance La distancia de la ruta.
     */
    public void addRoute(Town start, Town end, int distance) {
        // Si la ciudad de inicio no tiene lista de rutas, se crea una nueva lista
        this.adjacencyList.putIfAbsent(start, new ArrayList<>());
        // Agrega la nueva ruta a la lista de rutas de la ciudad de inicio
        this.adjacencyList.get(start).add(new Route(start, end, distance));
    }

    /**
     * Calcula la distancia de una ruta específica.
     * @param towns Las ciudades en la ruta.
     * @return La distancia total de la ruta, o -1 si no existe la ruta.
     */
    public int calculateRouteDistance(Town... towns) {
        int totalDistance = 0;
        for (int i = 0; i < towns.length - 1; i++) {
            Town current = towns[i];
            Town next = towns[i + 1];
            boolean routeFound = false;
            // Busca la ruta desde la ciudad actual a la siguiente ciudad
            for (Route route : adjacencyList.getOrDefault(current, Collections.emptyList())) {
                if (route.getEnd().equals(next)) {
                    totalDistance += route.getDistance();
                    routeFound = true;
                    break;
                }
            }
            if (!routeFound) {
                return -1; // NO SUCH ROUTE
            }
        }
        return totalDistance;
    }
}