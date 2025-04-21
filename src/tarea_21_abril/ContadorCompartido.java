package tarea_21_abril;
public class ContadorCompartido {
    private int contador = 0;

    public synchronized void incrementar() {
        contador++;
        System.out.println("Incrementado a: " + contador);
    }

    public synchronized void decrementar() {
        contador--;
        System.out.println("Decrementado a: " + contador);
    }
}