# 🌊 Tarea: Albuaves DAM - Repositorio Inicial

**Estudiante:** Alvaro Murillo Puchalt

**Módulo:** Sostenibilidad

**Plataforma de Desarrollo:** Windows (Scripts `.bat`)

Este repositorio contiene la estructura inicial de la tarea Albuaves DAM, implementada con una API REST en **Node.js/Express** y un cliente de consola desarrollado en **Kotlin (JVM)**, demostrando la conexión entre ambos componentes.

---

## 1. Evidencia de Funcionamiento

Esta sección demuestra la operativa del proyecto mediante capturas de pantalla, tal como se requiere en el enunciado.

### 1.1. Llamada a la API en el Navegador

Se muestra la respuesta del **Servidor (Node.js)** al ser consultado directamente mediante el navegador.

<img width="1918" height="200" alt="image" src="https://github.com/user-attachments/assets/8637fe53-4012-46a9-8e08-2ea8fd690e8f" />

### 1.2. Java/Kotlin Ejecutándose en la Terminal

Se muestra la ejecución del **Cliente (Kotlin)**, confirmando la conexión exitosa a la API local, la recepción de la respuesta y la correcta deserialización de los datos.

<img width="1380" height="492" alt="image" src="https://github.com/user-attachments/assets/2381be4f-090c-4d1b-87df-afaff06f5eba" />

---

## 2. Tecnologías, Licencias y Motivación

A continuación, se detallan las tecnologías elegidas para construir este repositorio inicial, junto con los enlaces de referencia y la justificación de las decisiones tomadas.

### 2.1. Tecnologías Utilizadas

| Componente | Tecnología Principal | Web del Proyecto | Licencia |
| :--- | :--- | :--- | :--- |
| **Servidor (API)** | **Node.js** | [https://nodejs.org/](https://nodejs.org/) | MIT License |
| | **Express.js** | [https://expressjs.com/](https://expressjs.com/) | MIT License |
| **Cliente** | **Kotlin (JVM)** | [https://kotlinlang.org/](https://kotlinlang.org/) | Apache 2.0 |
| | **Gradle** | [https://gradle.org/](https://gradle.org/) | Apache 2.0 |
| **HTTP/JSON** | **Ktor Client** y **Gson** | [https://ktor.io/](https://ktor.io/) y [https://github.com/google/gson](https://github.com/google/gson) | Apache 2.0 |
| **Herramienta** | **IntelliJ IDEA** | [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/) | [Comunidad/Comercial] |
| **Control de Versiones** | **Git/GitHub** | [https://github.com/](https://github.com/) | N/A |

### 2.2. Motivación de la Elección

* **Kotlin (JVM) y Gradle:** Se eligió Kotlin por ser un lenguaje moderno, interoperable con Java y con una curva de aprendizaje sencilla, siendo el estándar actual en el desarrollo en la plataforma JVM. Gradle se utiliza por su robustez en la gestión de dependencias y su capacidad de gestionar el ciclo de compilación.
* **Node.js/Express.js:** Seleccionado para el servidor por la **velocidad de prototipado** y su ligereza, permitiendo crear un punto final REST funcional con una infraestructura mínima, lo cual es ideal para un repositorio inicial.
* **Licencia (MIT License):** Elegida por su simplicidad y permisividad. Permite a cualquier usuario final o desarrollador usar, copiar, modificar y distribuir el código sin restricciones, adecuada para proyectos iniciales de código abierto.

---

## 3. ⚙️ Guía de Puesta en Marcha
Esta sección explica el procedimiento de compilación y ejecución del proyecto, cumpliendo con el requisito de incluir la infraestructura y los scripts de puesta en marcha.

### 3.0. Diagrama de Arquitectura Lógica

El proyecto sigue un modelo Cliente-Servidor simple. El Cliente de Kotlin actúa como un consumidor de la API REST que proporciona el Servidor de Node.js, todo comunicado a través del protocolo HTTP en el puerto local 3000.



**Flujo de la Petición:**

1.  El Cliente Kotlin utiliza **Ktor Client** para enviar una solicitud `GET` a `http://localhost:3000/albuaves`.
2.  La instancia de **Express** en el servidor intercepta la solicitud.
3.  El servidor construye un objeto JSON simple.
4.  El Cliente utiliza la librería **Gson** para deserializar el JSON y presentarlo en la consola.
5.  
### 3.1. Infraestructura de Desarrollo y Pruebas

Para replicar y ejecutar este entorno de desarrollo, se requiere:

1.  **Git:** Para clonar el repositorio.
2.  **Node.js (versión 18+):** Necesario para ejecutar el servidor Express.
3.  **Java Development Kit (JDK 17+):** **(Absolutamente necesario)** para compilar y ejecutar el cliente Kotlin a través de Gradle, ya que las versiones antiguas de JRE carecen del compilador.
4.  **Sistema Operativo:** Los scripts de puesta en marcha están optimizados para **Windows (scripts `.bat`)**.

### 3.2. Scripts de Puesta en Marcha del Server

**Objetivo:** Iniciar la API REST en el puerto `3000`.

* **Ruta del Script:** `./server/start-server.bat`
* **Contenido del Script:**
```
@echo off
REM Este script inicia el servidor Node.js en Windows.
echo Iniciando la API de Albuaves en el puerto 3000...
echo ----------------------------------------------------
REM El comando 'node server.js' ejecuta tu código de la API.
node server.js

REM 'pause' es opcional, pero evita que la ventana se cierre inmediatamente
REM si el servidor tiene un error al iniciar.
```
* **Uso:** Abrir la línea de comandos, navegar a la carpeta `server/` y ejecutar `start-server.bat`.

### 3.3. Scripts de Compilación y Puesta en Marcha del Cliente

**Objetivo:** Compilar las dependencias del cliente (Kotlin) y ejecutar el programa principal.

* **Ruta del Script:** `./client/start-client.bat`
* **Contenido del Script:**
```
@echo off
REM Este script compila y ejecuta el cliente Kotlin usando el wrapper de Gradle.
echo Compilando y Ejecutando el Cliente Kotlin...
echo ----------------------------------------------------

REM Ejecuta la tarea 'run' de Gradle. El '.\gradlew.bat' lo maneja todo.
.\gradlew.bat run
```
* **Uso:** Abrir una **segunda línea de comandos** (dejando el servidor activo), navegar a la carpeta `client/` y ejecutar `start-client.bat`.

---

