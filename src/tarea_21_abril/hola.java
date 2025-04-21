package tarea_21_abril;

import java.util.Random;

public class hola {
    private Integer numero = null;

    public synchronized void producir() {
        while (numero != null) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numero = new Random().nextInt(100);
        System.out.println("Productor generó: " + numero);
        notify(); // consumidor
    }

    public synchronized void consumir() {
        while (numero == null) {
            try {
                wait(); // productor produzca
            } catch (InterruptedException evw) {
                evw.printStackTrace();
            }
        }
        System.out.println("Consumidor leyó: " + numero);
        numero = null;
        notify(); // productor
    }
}