import java.util.Scanner;

public class VerificadorDePalindromos {

    // Muestra un mensaje solicitando la entrada.
    public static void solicitarEntrada() {
        System.out.println("Ingrese una palabra, frase o número:");
    }

    // Muestra si la cadena o número es un palíndromo.
    public static void mostrarPalindromo(String entrada) {
        System.out.println(entrada + " es un palíndromo.");
    }

    // Muestra si la cadena o número no es un palíndromo.
    public static void mostrarNoPalindromo(String entrada) {
        System.out.println(entrada + " no es un palíndromo.");
    }

    // Muestra un mensaje de error si la entrada es vacía.
    public static void mostrarErrorCadenaVacia() {
        System.out.println("Entrada inválida. No puede ingresar una cadena vacía.");
    }

    // Obtiene la entrada del usuario y cierra el scanner correctamente.
    public static String obtenerEntrada() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine(); // El scanner se cerrará automáticamente
        }
    }

    // Elimina los espacios de la cadena.
    public static String eliminarEspacios(String cadena) {
        return cadena.replaceAll("\\s+", "");
    }

    // Elimina la puntuación de la cadena.
    public static String eliminarPuntuacion(String cadena) {
        return cadena.replaceAll("\\p{Punct}", "");
    }

    // Invierte la cadena.
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Compara la cadena limpia con su versión invertida.
    public static boolean esPalindromo(String cadenaLimpia) {
        String cadenaInvertida = invertirCadena(cadenaLimpia);
        return cadenaLimpia.equals(cadenaInvertida);
    }

    // Verifica si la cadena o número es un palíndromo eliminando espacios y puntuación, y convirtiéndola a minúsculas.
    public static boolean verificarPalindromo(String entrada) {
        if (entrada.isEmpty()) {
            return false; // Las cadenas vacías no deben ser consideradas palíndromos.
        }
        String cadenaLimpia = eliminarEspacios(eliminarPuntuacion(entrada)).toLowerCase();
        return esPalindromo(cadenaLimpia);
    }

    // Procesa la entrada del usuario.
    public static String procesarEntrada() {
        String entrada;
        solicitarEntrada();
        entrada = obtenerEntrada();
        return entrada;
    }

    // Muestra si la cadena ingresada es o no un palíndromo.
    public static void imprimirResultado(boolean esPalindromo, String entrada) {
        if (entrada.isEmpty()) {
            mostrarErrorCadenaVacia();
        } else if (esPalindromo) {
            mostrarPalindromo(entrada);
        } else {
            mostrarNoPalindromo(entrada);
        }
    }

    // Método principal encargado de una sola tarea que es la de ejecutar el codigo haciendo la llamada a los metodos 
    // procesarEntrada->esPalindromo->verificarPalindromo->imprimirResultado.
    public static void main(String[] args) {
        String entrada = procesarEntrada();
        boolean esPalindromo = verificarPalindromo(entrada);
        imprimirResultado(esPalindromo, entrada);
    }
}