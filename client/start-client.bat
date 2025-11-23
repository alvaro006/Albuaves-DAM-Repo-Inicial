@echo off
REM Este script compila y ejecuta el cliente Kotlin usando el wrapper de Gradle.
echo Compilando y Ejecutando el Cliente Kotlin...
echo ----------------------------------------------------

REM Ejecuta la tarea 'run' de Gradle. El '.\gradlew.bat' lo maneja todo.
.\gradlew.bat run

pause