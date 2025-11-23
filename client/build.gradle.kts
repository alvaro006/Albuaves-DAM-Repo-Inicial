plugins {
    kotlin("jvm") version "2.2.20"
    id("application")
}

group = "com.albuaves"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // Librerías para llamadas de red (HTTP)
    implementation("io.ktor:ktor-client-core:2.3.6")
    implementation("io.ktor:ktor-client-java:2.3.6") // Motor de peticiones para Java

    // Librería para convertir la respuesta JSON a un objeto Kotlin
    implementation("com.google.code.gson:gson:2.10.1")
}

tasks.test {
    useJUnitPlatform()
}
// client/build.gradle.kts (Añadir al final del archivo)

application {
    // Indica a Gradle que ejecute la función 'main' que está en el archivo 'Main.kt'
    // La estructura es [nombre_del_paquete.NombreDeArchivoKt]
    // Si no definiste paquete, la clase principal es simplemente 'MainKt'
    mainClass.set("MainKt")
}
// client/build.gradle.kts
// Asegúrate de que esta línea esté en algún lugar del archivo (fuera de plugins/dependencies):

kotlin {
    jvmToolchain(17) // <-- Esto fuerza a usar el JDK 17
}