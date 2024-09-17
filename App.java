import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    // Suma de dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    // Resta de dos números
    public static int resta(int a, int b) {
        return a - b;
    }

    // Multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    // División de dos números
    public static double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor no puede ser cero");
        }
        return (double) a / b;
    }

    // Máximo de dos números
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Mínimo de dos números
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Factorial de un número
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Número par
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Número impar
    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }

    // Potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        return Math.sqrt(n);
    }

    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.split("\\s+");
        return palabras.length;
    }

    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // Invertir un array
    public static void invertirArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    // Calcular la media de un array
    public static double mediaArray(int[] array) {
        int suma = sumarArray(array);
        return (double) suma / array.length;
    }

    // Encontrar la mediana de un array
    public static double medianaArray(int[] array) {
        ordenarArray(array);
        int medio = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[medio - 1] + array[medio]) / 2.0;
        } else {
            return array[medio];
        }
    }

    // Calcular la desviación estándar de un array
    public static double desviacionEstandarArray(int[] array) {
        double media = mediaArray(array);
        double suma = 0;
        for (int num : array) {
            suma += Math.pow(num - media, 2);
        }
        return Math.sqrt(suma / array.length);
    }

    // Generar un array de números aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int limite) {
        int[] array = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(limite);
        }
        return array;
    }
}