package com.example;

/**
 * ¡Hola, Mundo!
 *
 * Esta es la clase principal de la aplicación.
 * El método main es el punto de entrada que se ejecuta al iniciar el programa.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }

    /**
     * Un método simple para ser probado con tests unitarios.
     * @return Un saludo.
     */
    public String getGreeting() {
        return "Hola desde el método de App.";
    }
}
