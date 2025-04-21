package tarea_21_abril;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        hola buffer = new hola();

        Thread productor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.producir();
                try {
                    Thread.sleep(1000); // Simula tiempo de producción
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumidor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.consumir();
                try {
                    Thread.sleep(1500); // Simula tiempo de consumo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        productor.start();
        consumidor.start();
    }
}
