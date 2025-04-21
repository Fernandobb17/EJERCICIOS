package tarea_21_abril;

import java.util.Random;

class hola {
    private Integer numero = null;

    public synchronized void producir() {
        while (numero != null) {
            try {
                wait(); // Espera hasta que el consumidor consuma
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numero = new Random().nextInt(100);
        System.out.println("Productor generó: " + numero);
        notify(); // Notifica al consumidor
    }

    public synchronized void consumir() {
        while (numero == null) {
            try {
                wait(); // Espera hasta que el productor produzca
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumidor leyó: " + numero);
        numero = null;
        notify(); // Notifica al productor
    }
}