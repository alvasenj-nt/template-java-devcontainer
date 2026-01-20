# Proyecto Base de Java para Entorno de Desarrollo Remoto

Este repositorio es una plantilla para desarrollar aplicaciones en Java utilizando un entorno estandarizado y aislado basado en Docker y Visual Studio Code.

Ha sido diseñado para que todos los alumnos trabajen con las mismas herramientas y versiones, sin necesidad de instalar Java o Maven en sus ordenadores locales, y **sin requerir conexión a internet** una vez configurado.

---

## 🚀 Requisitos Previos

Antes de empezar, solo necesitas tener instaladas dos aplicaciones en tu sistema:

1.  **Docker Desktop:** Es el motor que gestiona los contenedores. Puedes descargarlo desde [la web oficial de Docker](https://www.docker.com/products/docker-desktop/).
2.  **Visual Studio Code:** El editor de código. Puedes descargarlo desde [la web oficial de VS Code](https://code.visualstudio.com/).
3.  **Extensión de Dev Containers en VS Code:** Abre VS Code, ve a la pestaña de Extensiones (el icono de los bloques) y busca e instala la extensión `ms-vscode-remote.remote-containers`.

---

## 🛠️ ¿Cómo empezar a trabajar?

Sigue estos pasos para poner en marcha tu entorno de desarrollo:

1.  **Obtén el código fuente.** Tienes dos opciones:

    *   **Opción A: Usar como plantilla (Recomendado si usas GitHub/GitLab)**
        1.  En la página del repositorio, haz clic en el botón `Use this template` (o "Usar esta plantilla").
        2.  Esto creará una copia completa del repositorio en tu propia cuenta.
        3.  Clona **tu nuevo repositorio** a tu ordenador.
            ```bash
            git clone <URL_DE_TU_NUEVO_REPOSITORIO>
            ```

    *   **Opción B: Clonar o descargar directamente**
        Si prefieres no crear una plantilla, puedes clonar este repositorio directamente o descargarlo como ZIP.
        ```bash
        git clone <URL_DEL_REPOSITORIO>
        ```
        O simplemente descárgalo como ZIP y descomprímelo.

2.  **Abre la carpeta del proyecto en VS Code.**
    -   Ve a `Archivo` > `Abrir Carpeta...` y selecciona la carpeta que acabas de clonar/descomprimir.

3.  **Abre el proyecto en el Contenedor de Desarrollo.**
    -   Al abrir la carpeta, VS Code detectará el fichero `.devcontainer/devcontainer.json` y mostrará una notificación en la esquina inferior derecha preguntando: **"Reopen in Container"** (o "Volver a abrir en contenedor").
    -   Haz clic en ese botón.

4.  **¡Espera a que la magia suceda!**
    -   La primera vez, VS Code construirá la imagen de Docker. Esto puede tardar unos minutos, ya que descargará Java, Maven y las dependencias del proyecto. **Este es el único paso que requiere conexión a internet.**
    -   Una vez construido, el contenedor se iniciará y VS Code se conectará a él. Sabrás que estás "dentro" porque en la esquina inferior izquierda verás una etiqueta verde que dice `Dev Container: Java para FP`.

---

## ✅ ¡Ya estás listo para trabajar!

A partir de ahora, te encuentras en un entorno Linux con Java 17 y Maven totalmente configurado.

-   **Para ejecutar la aplicación:**
    -   Abre el fichero `src/main/java/com/example/App.java`.
    -   Verás que encima del método `public static void main(String[] args)` aparecen las opciones `Run` y `Debug`. Haz clic en `Run`.
    -   La salida "¡Hola, Mundo!" aparecerá en la terminal de VS Code.

-   **Para ejecutar los tests:**
    -   Abre el fichero `src/test/java/com/example/AppTest.java`.
    -   Puedes ejecutar todos los tests de la clase haciendo clic en el icono de "play" que aparece al lado del nombre de la clase.

¡Feliz codificación!
