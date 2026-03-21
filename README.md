# Pokedex

Proyecto Java Maven sencillo que simula una pokedex en consola. El objetivo principal es practicar la arquitectura MVC separando responsabilidades entre vista y controlador.

## Estructura

- `view`: gestiona la interacción con el usuario (mostrar menú y leer datos)
- `controller`: controla el flujo de la aplicación
- `App`: punto de entrada con el método main

## Funcionamiento

Al ejecutar la aplicación:
1. Se crea la vista y el controlador
2. Se inicia el controlador
3. Se muestra un menú en bucle
4. El usuario introduce una opción por teclado
5. Según la opción, se muestra un mensaje
6. El programa se repite hasta seleccionar salir

## Notas

- La entrada por teclado se realiza con `Scanner`
- Las opciones del menú están definidas como constantes en la clase `PokedexView`
- El controlador utiliza un `switch` para gestionar las opciones
- De momento no hay modelo ni datos reales, solo simulación de comportamiento