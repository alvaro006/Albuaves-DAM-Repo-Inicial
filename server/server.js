// server.js

// 1. Importar la librería Express
const express = require('express');
const app = express();

// 2. Definir el puerto donde escuchará el servidor
const PORT = 3000;

// 3. Crear una ruta de prueba (Endpoint)
app.get('/albuaves', (req, res) => {
    // Cuando el cliente llame a http://localhost:3000/albuaves,
    // el servidor responderá con este JSON:
    const data = {
        mensaje: "La API de Albuaves está funcionando correctamente.",
        version: "1.0",
        fecha: new Date().toISOString()
    };
    
    // El 'res.json' envía la respuesta al cliente
    res.json(data);
});

// 4. Iniciar el servidor
app.listen(PORT, () => {
    console.log(`✅ Servidor Express en funcionamiento!`);
    console.log(`   Accede a: http://localhost:${PORT}/albuaves`);
});