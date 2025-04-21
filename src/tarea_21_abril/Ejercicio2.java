package tarea_21_abril;
public class Ejercicio2 {
    public static void main(String[] args) {
        Runnable numeros = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Número: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable letras = () -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Letra: " + c);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(numeros).start();
        new Thread(letras).start();
    }
}
