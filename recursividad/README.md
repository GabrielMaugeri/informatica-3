# Recusividad

## Índice
* [Contexto](#contexto)
* [Funciones](#funciones)
    * [Factorial](#factorial)
    * [Suma numeros naturales](#suma-numeros-naturales)
    * [Fibonacci](#fibonacci)
    * [Invertir cadena de texto](#invertir-cadena-de-texto)
    * [Potencia](#potencia)
* [Utilización de Git](#utilizacion-de-git)


## Contexto

Este proyecto tiene como objetivo principal practicar el uso de Git para la gestión de versiones y reforzar los conocimientos sobre recursividad a través de la implementación de diferentes ejercicios en Java.

### Parte 1: Configuración y Uso de Git
- Creación del Repositorio: Configuración de un repositorio en GitHub, GitLab u otro servicio de Git, y clonación del mismo en la máquina local.
- Estructura del Proyecto: Organización del proyecto Java con una estructura clara de directorios.
- Commits y Ramas: Realización de al menos 5 commits significativos y manejo de ramas con la creación de recursion-features, que posteriormente se fusionará con main mediante un pull request.
- Documentación: Explicación breve en el archivo README.md de cada ejercicio implementado y cómo se utilizó Git durante el proyecto.

### Parte 2: Ejercicios de Recursividad
Implementación de funciones recursivas en Java:
- Cálculo del factorial de un número.
- Suma de los primeros n números naturales.
- Cálculo del n-ésimo número de la secuencia de Fibonacci.
- Inversión de una cadena de caracteres.
- Cálculo de la potencia de un número.

  
## Funciones

### Factorial

Para calcular el factorial de un numero de forma recursiva, se tomo como caso base que el factorial de 1 da como resultado 1,
y en cada iteracion le pasamos el numero - 1. De esta forma, recursivamente el factorial de 5 nos quedaria:

5 * (4 * (3 * (2 * 1))

A continuacion se puede observar la estructura de la funcion:

```java
public static int factorial(int numero) {
    if (numero == 1) {
        return 1;
    } else {
        return numero * factorial(numero - 1);
    }
}
```


### Suma numeros naturales

Para calcular la suma de los numeros naturales se utiliza un razonamiento muy similar al del factorial, siendo el caso base que el numero a sumar sea 1, y en cada llamada a la funcion se le pasa el numero - 1. Siendo asi que la suma de los primero 5 reales nos quedaria de la siguiente forma:

5 + (4 + (3 + (2 + 1))

A continuacion se puede observar la estructura de la funcion:

```java
public static int sumaNaturales(int n) {
    if (n == 1){
        return 1;
    } else {
        return n + sumaNaturales(n - 1);
    }
}
```


### Fibonacci

Para calcular el n-esimo valor de la secuencia de Fibonacci se tomo como caso base que la el valor que se toma este en la posicion 1 o 2,
siendo estos valores iguales a 1, y en cada llamada a la funcion, para calcular el valor que iria en la posicion "n",
se suma el valor de la posicion n-1, y el valor de la posicion n-2. De este forma para calcular el valor que ocupa la posicion 5 nos quedaria:

1 - 1 - 2 - 3 - 5

1 + 1 + (1+1) + (1+(1+1)) + ((1+1) + (1+(1+1))

```java
public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```


### Invertir cadena de texto

En este caso para invertir una cadena de texto de forma recursiva, se utilizo como caso base que el largo de la cadena sea de un solo caracter,
ya que la cadena inversa de un caracter es la misma cadena, y en cada llamada a la funcion se le pasa la cadena sacandole el primer caracter,
y a lo que retorna se le concatena el primer caracater de la cadenada de esa llamada. Por ejemplo invertir la cadena "Hola" quedaria de la siguiente forma:

("a") + ("l"a) + ("o"la) + ("H"ola)


```java
public static String inversionCadena(String cadena) {
    if (cadena.length() == 1) {
        return cadena.substring(0);
    } else {
        return (inversionCadena(cadena.substring(1))).concat(cadena.substring(0, 1));
    }
}
```


### Potencia

Para calcular la n-esima potencia de un numero, se utilizo como caso base que el exponente sea 1, ya que un numero elevado a 1 se sabe que da como resultado 1,
y en cada llamada lo que se hace es multiplicar el numero por ese mismoo numero restandole 1 al exponente,
por lo que 5 elevado al cubo nos quedaria de la siguiente forma:

5 * (5 * (5 * 1))

```java
public static int potencia(int numero, int exponente) {
    if (exponente == 1) {
        return numero;
    } else {
        return numero * potencia(numero, exponente - 1);
    }
}
```

## Utilización de Git

Para la materia de Informatica III se creo un repositorio desde GitHub,
este mismo repositorio se clono en una maquina local y se creo una rama nueva llamada "recursive-features" para ir sincronizando todo 
lo que se iba trabajando en este proyecto. Al crear el proyecto en Java, se realizo un primer Commit para guardar la estructura principal,
luego a medida que se iban agregando las distintas funciones que pedia la consigna, se iba realizando un commit por cada funcion agregada.
Por ultimo se hizo un push en la rama "recursive-features", y desde GitHub se realizo un merge a la rama "main" mediando un pull request
