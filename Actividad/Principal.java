public class Principal {

//A)Procedimiento de intercambio 
     // Método para intercambiar dos valores usando un array
     public static void intercambia(int[] valores) {
        // Guardamos el primer valor en una variable auxiliar O(1)
        int aux = valores[0]; 
        // Asignamos el segundo valor al primero O(1)
        valores[0] = valores[1]; 
        // Asignamos el valor auxiliar al segundo O(1)
        valores[1] = aux; 
        // Complejidad total: O(1) tiempo constante
    }
// Análisis:
//Cada línea de este procedimiento es una asignación simple, lo que significa que toma un tiempo constante O(1)
// Total de operaciones: O(1) + O(1) + O(1) + O(1) = O(1)
// Orden de complejidad: O(1) Tiempo constante




     
//B)Función para encontrar el máximo de dos números
    public static int max(int x, int y) {
        // Usa una condición para devolver el mayor O(1)
        return (x >= y) ? x : y;
        // Complejidad total: O(1) una sola comparación
    }
// Análisis:
// La comparación (x >= y) es una operación constante O(1)
// La instrucción RETURN simplemente devuelve el mayor valor, lo cual también es O(1)
// Total de operaciones: O(1) + O(1) = O(1)
// Orden de complejidad: O(1) -> Tiempo constante sin importar el tamaño de la entrada




     
//c) Función para sumar todos los elementos de un array
    public static int suma(int[] v) {
        int resultado = 0; // Inicializa la suma en 0 O(1)
        // Bucle que recorre el array O(n)
        for (int i = 0; i < v.length; i++) { 
            resultado += v[i]; // Suma cada elemento O(1) por iteración
        }
        return resultado; // Devuelve la suma total O(1)
        // Complejidad total: O(n) -> se ejecuta una vez por cada elemento del array
    }
// Análisis:
// La asignación resultado = 0 toma tiempo constante O(1)
// El bucle for se ejecuta n veces lo que contribuye con O(n)
// Dentro del bucle -> la suma resultado += v[i] es O(1) por iteración
// La devolución de resultado es O(1)
// Total de operaciones: O(1) + O(n) * O(1) + O(1) = O(n)
// Orden de complejidad: O(n) -> Crece linealmente con el tamaño del array




     
//d) Método para ordenar un array usando el algoritmo de Burbuja
    public static void ordenar(int[] v) {
        int n = v.length; // Tamaño del array O(1)

        // Bucle externo (itera sobre cada elemento) O(n)
        for (int i = 0; i < n - 1; i++) { 
            // Bucle interno (compara y mueve elementos) O(n)
            for (int j = 0; j < n - i - 1; j++) { 
                // Si el actual es mayor que el siguiente, se intercambian O(1)
                if (v[j] > v[j + 1]) { 
                    int aux = v[j]; 
                    v[j] = v[j + 1]; 
                    v[j + 1] = aux; 
                }
            }
        }
        // Complejidad total: O(n²) (doble bucle anidado)
    }
// Análisis:
// La asignación int n = v.length toma tiempo constante O(1)
// El primer bucle for (i = 0; i < n - 1; i++) se ejecuta n-1 veces → O(n)
// El segundo bucle for (j = 0; j < n - i - 1; j++) se ejecuta aproximadamente n veces en promedio
// Las asignaciones y comparaciones dentro del bucle tienen O(1) de complejidad
// Total de operaciones: O(n) * O(n) = O(n²)
// Orden de complejidad: O(n²) -> Crece cuadráticamente con el tamaño del array

    // Función recursiva para calcular la potencia (x^y)
    public static double potencia(double x, int y) {
        if (y == 0) return 1.0; // Caso base: cualquier número elevado a 0 es 1 O(1)

        if (y % 2 == 1) // Si es impar O(1)
            return x * potencia(x, y - 1); // Se multiplica por x y llama a sí misma O(y)

        double t = potencia(x, y / 2); // Caso par: divide el exponente entre 2 O(log y)
        return t * t; // Se multiplica por sí mismo O(1)

        // Complejidad total: O(log y) en el mejor caso, O(y) en el peor
    }



     
    // Método principal donde se ejecutan las funciones anteriores
    public static void main(String[] args) {
        // Prueba del método intercambia
        int[] valores = {5, 10}; 
        System.out.println("Antes de intercambiar: " + valores[0] + ", " + valores[1]);
        intercambia(valores);
        System.out.println("Después de intercambiar: " + valores[0] + ", " + valores[1]);

        // Prueba de la función max
        int maximo = max(8, 3);
        System.out.println("Máximo entre 8 y 3: " + maximo);

        // Prueba de la función suma
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma del array: " + suma(numeros));

        // Prueba del método ordenar
        int[] aOrdenar = {5, 2, 9, 1, 7};
        ordenar(aOrdenar);
        System.out.print("Array ordenado: ");
        for (int num : aOrdenar) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Prueba de la función potencia
        double resultadoPotencia = potencia(2, 5);
        System.out.println("2^5 = " + resultadoPotencia);
    }

}
