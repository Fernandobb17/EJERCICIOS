package tarea_21_abril;

public class Ejercicio4 {
    
    /* Ejercicio 4: Uso de wait() y notify()
    Crea un programa donde un hilo productor genera números aleatorios y un hilo consumidor los imprime. 
    El consumidor debe esperar si no hay números disponibles.*/
    public static void main(String[] args) {
        hola holi = new hola();

        Thread productor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                holi.producir();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ee54) {
                    ee54.printStackTrace();
                }
            }
        });

        Thread consumidor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                holi.consumir();
                try {
                    Thread.sleep(1500); 
                } catch (InterruptedException e2e) {
                    e2e.printStackTrace();
                }
            }
        });

        productor.start();
        consumidor.start();
    }
}
