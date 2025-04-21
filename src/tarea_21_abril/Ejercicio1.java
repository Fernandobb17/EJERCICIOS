package tarea_21_abril;
public class Ejercicio1 {
    public static void main(String[] args) {
        Thread hiloNumeros = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Número: " + i);
                    try {
                        Thread.sleep(1000); // 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread hiloLetras = new Thread() {
            public void run() {
                for (char c = 'A'; c <= 'E'; c++) {
                    System.out.println("Letra: " + c);
                    try {
                        Thread.sleep(2000); // 2 segundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        hiloNumeros.start();
        hiloLetras.start();
    }
}
