@echo off
REM Este script inicia el servidor Node.js en Windows.
echo Iniciando la API de Albuaves en el puerto 3000...
echo ----------------------------------------------------
REM El comando 'node server.js' ejecuta tu código de la API.
node server.js

REM 'pause' es opcional, pero evita que la ventana se cierre inmediatamente
REM si el servidor tiene un error al iniciar.
pause