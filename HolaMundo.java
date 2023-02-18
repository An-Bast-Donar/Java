public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");

    // Declaración de variables
    int entero = 10;
    double decimal = 3.14;
    boolean booleano = true;
    String cadena = "Hola, mundo!";

    // Imprimir variables
    System.out.println("Entero: " + entero);
    System.out.println("Decimal: " + decimal);
    System.out.println("Booleano: " + booleano);
    System.out.println("Cadena: " + cadena);

    // Arreglos unidimensionales
    int[] arregloEnteros = new int[5];
    arregloEnteros[0] = 1;
    arregloEnteros[1] = 2;
    arregloEnteros[2] = 3;
    arregloEnteros[3] = 4;
    arregloEnteros[4] = 5;

    // Imprimir arreglos
    for (int i = 0; i < arregloEnteros.length; i++) {
      System.out.println("Elemento " + i + " del arreglo de enteros: " + arregloEnteros[i]);
    }

    // Matrices
    int[][] matrizEnteros = new int[3][3];
    matrizEnteros[0][0] = 1;
    matrizEnteros[0][1] = 2;
    matrizEnteros[0][2] = 3;
    matrizEnteros[1][0] = 4;
    matrizEnteros[1][1] = 5;
    matrizEnteros[1][2] = 6;
    matrizEnteros[2][0] = 7;
    matrizEnteros[2][1] = 8;
    matrizEnteros[2][2] = 9;

    // Imprimir matrices
    for (int i = 0; i < matrizEnteros.length; i++) {
      for (int j = 0; j < matrizEnteros[i].length; j++) {
        System.out.print(matrizEnteros[i][j] + " ");
      }
      System.out.println();
    }

    // Sentecia if
    int numero = -5;
    if (numero >= 0) {
      System.out.println("El número es positivo.");
    } else {
      System.out.println("El número es negativo.");
    }

    /*
     * ______Operadores de comparación______
     * == (igual a): Comprueba si dos valores son iguales.
     * != (distinto de): Comprueba si dos valores son diferentes.
     * < (menor que): Comprueba si el primer valor es menor que el segundo valor.
     * > (mayor que): Comprueba si el primer valor es mayor que el segundo valor.
     * <= (menor o igual que): Comprueba si el primer valor es menor o igual que el
     * segundo valor.
     * >= (mayor o igual que): Comprueba si el primer valor es mayor o igual que el
     * segundo valor.
     */

    /*
     * ______Operadores de cálculo______
     * + (suma): Suma dos valores.
     * - (resta): Resta dos valores.
     * * (multiplicación): Multiplica dos valores.
     * / (división): Divide dos valores.
     * % (módulo): Devuelve el resto de la división de dos valores.
     */
    int numero1 = 5;
    int numero2 = 3;
    int resultado = numero1 + numero2;
    System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + resultado + ".");

    /*
     * ______Operadores logicos______
     * && (y lógico): Devuelve true si ambas condiciones son verdaderas.
     * || (o lógico): Devuelve true si al menos una de las condiciones es verdadera.
     * ! (no lógico): Niega una condición.
     */
    int edad = 20;
    boolean tieneLicencia = true;
    if (edad >= 18 && tieneLicencia) {
      System.out.println("Puede conducir un vehículo.");
    } else {
      System.out.println("No puede conducir un vehículo.");
    }
  }
}