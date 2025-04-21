package tarea_21_abril;
public class Ejercicio1 {
    
    /*Ejercicio 1: Creación básica de hilos
    Crea un programa que lance dos hilos:
    El primer hilo imprime números del 1 al 5 con un retardo de 1 segundo entre cada número.
    El segundo hilo imprime las letras de la 'A' a la 'E' con un retardo de 2 segundos.*/
    public static void main(String[] args) {
        Thread hiloNumeros = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Número: " + i);
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException exe) {
                    }
                }
            }
        };

        Thread hiloLetras = new Thread() {
            public void run() {
                for (char c = 'A'; c <= 'E'; c++) {
                    System.out.println("Letra: " + c);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException exe) {
                    }
                }
            }
        };

        hiloNumeros.start();
        hiloLetras.start();
    }
}
