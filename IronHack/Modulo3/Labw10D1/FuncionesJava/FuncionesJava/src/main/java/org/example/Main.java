package org.example;

public class Main {
    public static void main(String[] args) {
        // Tarea 1: Diferencia entre el valor máximo y mínimo
        int[] numeros = {5, 2, 8, 1, 9};
        int diferencia = diferenciaMinMax(numeros);
        System.out.println("La diferencia entre el valor máximo y mínimo es: " + diferencia);

        // Tarea 2: Elemento más pequeño y segundo más pequeño
        int[] otrosNumeros = {3, 7, 2, 9, 2};
        encontrarMinimos(otrosNumeros);

        // Tarea 3: Expresión matemática (Ejemplo: x^2 + 3y)
        double x = 2.5;
        double y = -1.2;
        double resultado = calcularExpresion(x, y);
        System.out.println("El resultado de la expresión es: " + resultado);
    }

    public static int diferenciaMinMax(int[] numeros) {
        // ... (código de la Tarea 1)
        if (numeros.length < 1) {
            throw new IllegalArgumentException("La matriz debe tener al menos un elemento");
        }

        int max = numeros[0];
        int min = numeros[0];
        for (int num : numeros) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    public static void encontrarMinimos(int[] numeros) {
        // ... (código de la Tarea 2)
        if (numeros.length < 2) {
            throw new IllegalArgumentException("La matriz debe tener al menos dos elementos");
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num : numeros) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }

            System.out.println("El elemento más pequeño es: " + min1);
            System.out.println("El segundo elemento más pequeño es: " + min2);
    }

    public static double calcularExpresion(double x, double y) {
        // ... (código de la Tarea 3, sustituye con tu expresión)
        return Math.pow(x, 2) + Math.pow(((4+y)/5)-x, 2); //x^2 +(((4*y)/5)-x)^2
    }
}

