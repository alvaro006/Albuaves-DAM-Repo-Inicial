// client/src/main/kotlin/Main.kt
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.engine.java.Java // Necesario para Windows/JVM
import com.google.gson.Gson

// 1. Clase para mapear la respuesta JSON de tu API
// Los nombres de las variables deben coincidir exactamente con el JSON de server.js
data class AlbuavesData(
    val mensaje: String,
    val version: String,
    val fecha: String
)

suspend fun main() {
    println("--- Cliente Kotlin Albuaves ---")

    // Configura el cliente HTTP
    val client = HttpClient(Java) // Usamos el motor Java que funciona bien en Windows
    val API_URL = "http://localhost:3000/albuaves"

    println("Intentando conectar con la API en: $API_URL")

    try {
        // 2. Hacer la petición GET a la API
        val response: HttpResponse = client.get(API_URL)

        // 3. Leer la respuesta como una cadena de texto (JSON)
        val jsonString: String = response.body()

        // 4. Mapear el JSON a un objeto Kotlin usando Gson
        val gson = Gson()
        val data = gson.fromJson(jsonString, AlbuavesData::class.java)

        // 5. Mostrar los resultados
        println("\n✅ CONEXIÓN EXITOSA!")
        println("   -------------------------")
        println("   Mensaje de la API: ${data.mensaje}")
        println("   Versión recibida: ${data.version}")
        println("   Fecha del servidor: ${data.fecha}")
        println("   -------------------------")

    } catch (e: Exception) {
        println("\n❌ ERROR: No se pudo conectar a la API.")
        println("   Asegúrate de que el servidor (server/start-server.bat) está corriendo.")
        println("   Detalle del error: ${e.message}")
    } finally {
        // 6. Cerrar la conexión
        client.close()
    }
}