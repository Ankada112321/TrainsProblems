# Trains Problems

Este proyecto resuelve problemas relacionados con rutas de trenes entre varias ciudades. Se implementa un grafo dirigido para modelar las ciudades y las rutas, y se utilizan algoritmos para calcular distancias, rutas posibles, y encontrar la ruta más corta.

## Tabla de Contenidos

- [Introducción](#introducción)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)

## Introducción

El problema de los trenes implica calcular varias métricas relacionadas con las rutas entre las ciudades en un grafo dirigido. Esto incluye:
1. La distancia de una ruta específica.
2. El número de diferentes rutas entre dos ciudades.
3. La ruta más corta entre dos ciudades.

## Instalación

### Requisitos Previos

- [Java Development Kit (JDK) 8 o superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [JUnit 5](https://junit.org/junit5/)

### Configuración del Entorno

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/Ankada112321/TrainsProblems.git
2. Importa el proyecto en Eclipse o el editor de tu preferencia:
        Abre Eclipse.
        Ve a File > Import.
        Selecciona Existing Projects into Workspace y luego Next.
        Navega hasta el directorio donde clonaste el repositorio y selecciona el proyecto.
        Haz clic en Finish.

 3. Agrega las bibliotecas de JUnit al Build Path:
        Descarga los archivos JAR de JUnit 5 desde JUnit 5 Releases.
        Coloca los archivos JAR en la carpeta lib dentro de tu proyecto (si decides crear una carpeta lib para organizarlos).
        Haz clic derecho en el proyecto en Eclipse, selecciona Build Path > Configure Build Path....
        En la pestaña Libraries, haz clic en Add JARs... y selecciona los archivos JAR que colocaste en la carpeta lib.
        Haz clic en Apply and Close.
##Uso
Ejecución de Pruebas

    1. Abre la clase GraphTest.java en src/test/java/com/trains/.
    2. Haz clic derecho en el archivo y selecciona Run As > JUnit Test.
    3. Eclipse ejecutará las pruebas y mostrará los resultados en la vista JUnit.

Ejemplo de Código

java

// Crear instancias de las ciudades
Town townA = new Town("A");
Town townB = new Town("B");
Town townC = new Town("C");

// Crear una instancia del grafo
Graph graph = new Graph();

// Agregar rutas al grafo
graph.addRoute(townA, townB, 5);
graph.addRoute(townB, townC, 4);

// Calcular la distancia de la ruta A-B-C
int distance = graph.calculateRouteDistance(townA, townB, townC);
System.out.println("La distancia de la ruta A-B-C es: " + distance);


##estructura-del-proyecto
TrainsProblems/
│
├── .settings/
│   ├── org.eclipse.jdt.core.prefs
│   ├── org.eclipse.ltk.core.refactoring.prefs
│   └── org.springframework.ide.eclipse.xml.namespaces.prefs
├── bin/
│   └── com/
│       └── trains/
│           ├── Graph.class
│           ├── Route.class
│           └── Town.class
├── src/
│   └── com/
│       └── trains/Solution
│           ├── Graph.java
│           ├── Route.java
│           └── Town.java
├── test/
│   └── com/
│       └── trains/Test
│           ├── GraphTest.class
│           └── GraphTestSetup.class
├── .classpath
├── .project
├── LICENSE
└── README.md
