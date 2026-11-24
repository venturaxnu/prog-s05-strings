/*
 * Ejercicio 01: Digits  (M03-UF1 Strings I)
 * Objetivos: uso de la clase String y de Java Documentation.
 *
 * El siguiente código usa distintos métodos de la clase String. Ejecútalo e indica
 * cuál es la salida por consola. ¿Qué métodos de la clase String se utilizan?
 * ¿Son estáticos o de instancia? ¿Qué función tiene cada uno de estos métodos?
 * ¿Qué devuelven? ¿Qué parámetros de entrada tienen?
 */

public class Ejercicio01 {
    void main() {

        double d = 858.48;
        String s = String.valueOf(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits before decimal point");
        System.out.println((s.length() - dot - 1) + " digits after decimal point");

    }
}
