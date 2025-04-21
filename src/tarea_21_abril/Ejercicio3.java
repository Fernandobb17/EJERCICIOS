package tarea_21_abril;

public class Ejercicio3 {
    
    /* Ejercicio 3: Sincronización de hilos
    Crea un programa donde dos hilos compartan un contador.
    Un hilo incrementa el contador y el otro lo decrementa.
    Usa synchronized para evitar condiciones de carrera.*/
    
    public static void main(String[] args) {
        ContadorCompartido contador = new ContadorCompartido();

        Runnable tareaIncremento = () -> {
            for (int i = 0; i < 5; i++) {
                contador.incrementar();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException error) {
                }
            }
        };

        Runnable tareaDecremento = () -> {
            for (int i = 0; i < 5; i++) {
                contador.decrementar();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ee) {
                }
            }
        };

        new Thread(tareaIncremento).start();
        new Thread(tareaDecremento).start();
    }
}
