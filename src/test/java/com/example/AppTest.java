package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Clase de pruebas para la clase App.
 *
 * Aquí se definen los tests unitarios para asegurar que el código de App funciona correctamente.
 */
public class AppTest {

    /**
     * Test para asegurar que la clase App se puede instanciar.
     */
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "La app debería tener un saludo.");
    }

    /**
     * Test para verificar el contenido del saludo.
     */
    @Test
    public void appGreetingIsCorrect() {
        App classUnderTest = new App();
        String expectedGreeting = "Hola desde el método de App.";
        assertEquals(expectedGreeting, classUnderTest.getGreeting(), "El saludo no es el esperado.");
    }
}
