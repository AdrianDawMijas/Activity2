Ejercicios AB Activity 2 - Lambdas para Comparadores, Sets y Listas

Este repositorio contiene la implementación de una serie de ejercicios que exploran el uso de lambdas, comparadores, y el manejo de colecciones como Set, List y TreeSet en Java. A continuación, se presenta una descripción detallada de cada ejercicio.
Ejercicio 1: Comparator basado en proximidad

Escribe un Comparator usando una lambda que compare dos enteros basándose en su proximidad a un número de referencia. Por ejemplo, si el número de referencia es 25, el 22 será "mayor" que el 30 porque está más cerca de 25.

    Demostración:
        Ordena una ArrayList usando Collections.sort.
        Construye un TreeSet con el Comparator.
        Usa el método sorted de Stream.

Ejercicio 2: Uso de HashSet y TreeSet

Crea dos programas que lean palabras en una sola línea y las almacenen en un Set. Cada palabra debe imprimirse en una nueva línea.

    Versión con HashSet: Utiliza HashSet para almacenar las palabras.
    Versión con TreeSet: Utiliza TreeSet para almacenar las palabras de forma ordenada.

Ejercicio 3: Lectura de enteros en varias líneas

Lee varias líneas de texto que contienen solo números enteros. Cada línea se almacena como un List y todas las listas se almacenan en un HashSet. Imprime el contenido de cada lista usando forEach.
Ejercicio 4: Filtrado de enteros

Modifica el ejercicio 3 para que pueda leer líneas de texto con cualquier contenido, pero solo almacene los números enteros. Utiliza Stream y el método filter para filtrar los elementos que no sean números.
Ejercicio 5: Uso de Set dentro de List

Modifica el ejercicio 3 o 4 para que cada línea de números enteros se almacene en un Set, y la colección completa se almacene en un List. Compara los resultados con las implementaciones anteriores cuando haya números duplicados en las líneas o líneas idénticas.
Ejercicio 6: Encuentra la lista más larga

Escribe un método estático que tome un HashSet de listas y devuelva la lista más larga usando el método reduce de Stream. Si el HashSet está vacío, devuelve una lista vacía.
Ejercicio 7: Comparadores para listas

Crea dos comparadores para listas:

    Por longitud: Ordena las listas según su tamaño.
    Por suma: Ordena las listas según la suma de sus elementos.

Utiliza estos comparadores para:

    Encontrar la lista más larga y la que suma más con el método Collections.max.
    Realizar la misma operación usando Stream.

Ejercicio 8: TreeSet con orden personalizado

Modifica el ejercicio 3 para almacenar el conjunto de listas como un TreeSet, utilizando los comparadores creados en el ejercicio 7:

    Ordena por suma de elementos.
    Ordena por longitud.

Compara los resultados obtenidos.
Ejercicio 9: Comparadores combinados

Modifica los comparadores del ejercicio 7 para incluir una regla secundaria:

    Si dos listas tienen la misma longitud, la que tenga mayor suma es "mayor".
    Si dos listas tienen la misma suma, la más larga es "mayor".

Usa estos comparadores para ordenar listas en un TreeSet y compara los resultados con los ejercicios anteriores.
Requisitos del Entorno

Para ejecutar los programas, se necesita:

    Java 8 o superior
    Un IDE como IntelliJ IDEA, Eclipse, o cualquier editor de texto con soporte para Java.