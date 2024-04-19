# Oscar Adrian Estrella Garcia: Actv 11

## Introducción

En este proyecto se desarrolló un programa en Java para calcular áreas y perímetros de diferentes figuras geométricas. Se utilizó el concepto de interfaz y clases para modelar las figuras, con el objetivo de practicar el uso de la herencia y la implementación de interfaces en Java.

## Desarrollo del Código

Se comenzó definiendo una interfaz llamada `Shape`, que contiene los métodos `getArea()` y `getPerimeter()`, que deben ser implementados por todas las clases de figuras geométricas. Luego, se crearon tres clases concretas: `Circle`, `Triangle` y `Square`, que representan un círculo, un triángulo y un cuadrado respectivamente. Cada una de estas clases implementa la interfaz `Shape` y define los métodos `getArea()` y `getPerimeter()` con las fórmulas adecuadas para calcular el área y el perímetro de cada figura.

Se implementó un menú interactivo en la clase `Main`, donde el usuario puede seleccionar la figura que desea calcular y elegir si quiere calcular el área o el perímetro. Dependiendo de la selección del usuario, se solicitan los atributos necesarios para calcular la figura y se muestra el resultado en pantalla.

## Ejecución y Funcionamiento

El programa solicita al usuario que seleccione la figura geométrica deseada y la propiedad que desea calcular (área o perímetro). Luego, solicita los atributos necesarios para calcular la figura (por ejemplo, el radio para un círculo, o las longitudes de los lados para un triángulo). Una vez que se proporcionan los datos, el programa realiza los cálculos y muestra el resultado en pantalla.

### Ejemplo de Ejecución:

1. El usuario selecciona la figura "Círculo".
2. Se solicita al usuario que ingrese el radio del círculo.
3. El usuario ingresa el radio.
4. El programa calcula el área o el perímetro del círculo, según la selección del usuario.
5. El resultado se muestra en pantalla.

### Imágenes de Ejemplo:

![Ejemplo 1](imagen1.png)
![Ejemplo 2](imagen2.png)

En estas imágenes se muestra el programa en ejecución, donde el usuario ha seleccionado calcular el área de un círculo con un radio de 5 unidades. El programa muestra el resultado del cálculo del área del círculo, que es aproximadamente 78.54 unidades cuadradas.
