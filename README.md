# 🌊 Tarea: Albuaves DAM - Repositorio Inicial

**Estudiante:** [Alvaro Murillo]
**Módulo:** [Sostenibilidad]

Este repositorio contiene la estructura inicial de la tarea Albuaves, dividida en un componente de servidor (API REST) y un componente cliente (aplicación de consola en Kotlin).

---

## 1. Evidencia de Funcionamiento (3 pts)

[cite_start]Aquí se muestran las capturas de pantalla que demuestran la operatividad de los componentes, cumpliendo con los requisitos de la entrega[cite: 11, 12, 13].

### [cite_start]A. Llamada a la API en el Navegador [cite: 12]

**Captura:** [Añade aquí la imagen cuando ejecutes la API]
> *Se muestra la respuesta JSON de la API en el navegador al acceder a `http://localhost:3000/albuaves`.*

### [cite_start]B. Java/Kotlin ejecutándose en la Terminal/Emulador [cite: 13]

**Captura:** [Añade aquí la imagen cuando ejecutes el Cliente]
> *Se muestra la salida del Cliente Kotlin, confirmando que se conectó correctamente a la API y leyó la información.*

---

## 2. Tecnologías y Motivación (3 pts)

[cite_start]Esta sección detalla los componentes y herramientas utilizadas, incluyendo sus licencias y la motivación de su elección[cite: 14].

### [cite_start]Tecnologías Utilizadas [cite: 14]

| Componente | Tecnología | Web del Proyecto | Licencia (Ejemplo) |
| :--- | :--- | :--- | :--- |
| **Servidor (API)** | **Node.js** | [https://nodejs.org/](https://nodejs.org/) | MIT License |
| | **Express** | [https://expressjs.com/](https://expressjs.com/) | MIT License |
| **Cliente** | **Kotlin (JVM)** | [https://kotlinlang.org/](https://kotlinlang.org/) | Apache 2.0 |
| **Herramienta** | **SQLite** | [https://www.sqlite.org/](https://www.sqlite.org/) | Licencia de dominio público |
| **Control de Versiones** | **Git/GitHub** | [https://github.com/](https://github.com/) | N/A |

### [cite_start]Motivación de la Elección [cite: 14]
* **Node.js/Express:** Elegido por su rapidez de prototipado y la sencillez para crear una API REST inicial con requisitos mínimos de infraestructura.
* **Kotlin (JVM):** Elegido por ser un lenguaje moderno, compatible con Java y muy adecuado para el desarrollo en el entorno DAM, ofreciendo mayor seguridad y concisión que Java.
* **SQLite:** Elegido por ser un sistema de base de datos *serverless*, ideal para el desarrollo local y pruebas iniciales sin requerir una instalación compleja.

---

## 3. Guía de Puesta en Marcha (Tutorial - HowTo) (4 pts)

[cite_start]Esta guía explica cómo ejecutar el proyecto desde cero, incluyendo la infraestructura y los scripts de desarrollo y pruebas[cite: 16].

### [cite_start]A. Infraestructura de Desarrollo y Pruebas [cite: 16]

Para compilar y ejecutar este proyecto, necesitas:

1.  **Git:** Para clonar el repositorio.
2.  **Node.js (versión 18+):** Para ejecutar el servidor.
3.  **Java Development Kit (JDK 17+):** Para compilar y ejecutar el cliente Kotlin.
4.  **IntelliJ IDEA o VS Code:** (Recomendado) Para la edición de código.

### [cite_start]B. Scripts de Puesta en Marcha del Server [cite: 17]

**Objetivo:** Iniciar la API en el puerto `3000`.

1.  **Instalación (si es la primera vez):**
    ```bash
    cd server
    npm install
    ```
2.  **Script de Ejecución (`./server/start-server.sh`):**
    ```bash
    #!/bin/bash
    echo "Iniciando la API de Albuaves en el puerto 3000..."
    node server.js
    ```
    **Uso:** `cd server && bash start-server.sh`
    *(Nota: Debes crear el archivo `start-server.sh` y darle permisos de ejecución (`chmod +x start-server.sh`)).*

### [cite_start]C. Scripts de Compilación y Puesta en Marcha del Cliente [cite: 19]

**Objetivo:** Compilar y ejecutar el cliente Kotlin.

1.  **Estructura del Proyecto:** El cliente se gestiona con Gradle/Maven. Los comandos asumen que el cliente está configurado.
2.  **Script de Ejecución (`./client/start-client.sh`):**
    ```bash
    #!/bin/bash
    echo "Compilando y Ejecutando el Cliente Kotlin..."
    # Asume que estás usando el wrapper de Gradle
    ./gradlew run
    ```
    **Uso:** `cd client && bash start-client.sh`
    *(Nota: Este script compila y ejecuta el cliente, asumiendo una configuración estándar de Kotlin/Gradle).*

---

## ❓ ¿Qué hacemos ahora?

Ya tenemos la estructura y la documentación lista. El siguiente paso es crear los archivos de código y los scripts que hemos prometido en el README.

**¿Te parece bien seguir con el Paso 3: Crear el código mínimo para el Servidor (API) de Node.js en la carpeta `server`?**
