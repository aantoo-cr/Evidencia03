# Evidencia03

_1.1 ¿Qué hace el método?_
Identifica si un string es un palíndromo o no.

_1.2 ¿Cómo lo hace?_
Al entregarle un string, este es dividido en acrácteres por separado, luego se invierte el orden de estos, para volver a unirlos y guardar este nuevo string para comparar si es idéntico al string entregado inicialmente. 

_1.3 ¿Cómo lo uso?_
Se le debe entergar un string como parámetro, y el método solo devuelve est string si efectivamente es un palíndromo. 

_1.4 Dé al menos un ejemplo de su uso (sin codificar nada)._
Un ejemplo de uso sería ingresar el string "radar", el cual, al ser efectivamente un palíndromo debería devolver exactamente el mismo string, "radar". 

_2.1 Tras una discusión individual, cada grupo deberá explicar que hace el método detalladamente._
Primero se define la función con el tipo de parámetro que recibe, para este caso string. Luego, se declara la variable resultado que se inicializa vacia. El método en si, se encarga de invertir la cadena string, una vez invertida, esta se guarda en la variable resultado, comparando esta última con el string inicial, devolviendo un booleano, true si ambas cadenas son iguales, y false si no lo son. 


_2.2 Escribir este mismo método en Java:_

    public class Palindromo {

    public static boolean esPalindromo(String cadena) {
        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }
    }

_3.1 Discutir en grupo el diseño de un plan de pruebas para este caso._
La primera prueba a realizar, quizás un poco obvia, es ver qué sucede si el string ingresado NO es un palíndromo. Luego, qué sucede si se ingresa otro tipo de dato diferente a string. También, que pasa si hay espacios en un string, o mayúsculas, puntos, comas, u otro carácter de este tipo. 

_3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5._
1) Ingresar un string NO palíndromo
2) Ingresar un dato distinto a string
3) Ingresar un string con espacios
4) Ingresar un string con mayúsuculas
5) Ingresar un string con comas
6) Ingresar un string con puntos
7) Ingresar un string con guión
8) Ingresar un string con guión bajo.

_3.4 ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?_
De los 8 test efectuados, 7 fallaron. 

_4.1 ¿Qué consideraciones tomaron en cuenta?_
Para la codificación de nuestro nuevo método debimos tomar en cuenta qué sucede si el input ingresado es un dato distinto a string.
También cómo manejar si el input está vacío.
¿¿¿¿Para el caso de prueba tres y cuatro cuál es el problema???
Por último, debimos considerar cómo se solucionaría si la cadena string entregada es una frase, con mayúsculas y espacios, pero aún así es un palíndromo. 

_4.2 ¿Qué mejoró en su método?_
Posibles errores que nos podríamos haber encontrado fácilmente al emplear el método, ahora sabe cómo mnejar ciertas situaciones complejas. 

_4.3 ¿Qué rol jugaron las pruebas en mejorar su código?_
Nos ayudaron a darnos cuenta las fallas que en el código eran mínimas, pero que a la hora de emplearlo representaban un gran problema.



