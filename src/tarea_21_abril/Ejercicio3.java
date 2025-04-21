package tarea_21_abril;

public class Ejercicio3 {
    public static void main(String[] args) {
        ContadorCompartido contador = new ContadorCompartido();

        Runnable tareaIncremento = () -> {
            for (int i = 0; i < 5; i++) {
                contador.incrementar();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable tareaDecremento = () -> {
            for (int i = 0; i < 5; i++) {
                contador.decrementar();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(tareaIncremento).start();
        new Thread(tareaDecremento).start();
    }
}
