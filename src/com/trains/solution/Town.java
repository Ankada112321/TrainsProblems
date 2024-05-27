package com.trains.solution;

/**
 * Representa una ciudad en el sistema de trenes.
 */
public class Town {
	 private String name;

	 /**
	     * Constructor para inicializar el nombre de la ciudad.
	     * @param name El nombre de la ciudad.
	     */
	    public Town(String name) {
	        this.name = name;
	    }

	    /**
	     * Obtiene el nombre de la ciudad.
	     * @return El nombre de la ciudad.
	     */
	    public String getName() {
	        return name;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        // Verifica si el objeto comparado es el mismo que el actual
	        if (this == obj) return true;
	        // Verifica si el objeto comparado es nulo o de diferente clase
	        if (obj == null || getClass() != obj.getClass()) return false;
	        // Compara el nombre de la ciudad
	        Town town = (Town) obj;
	        return name.equals(town.name);
	    }

	    @Override
	    public int hashCode() {
	        // Genera un código hash basado en el nombre de la ciudad
	        return name.hashCode();
	    }
}
