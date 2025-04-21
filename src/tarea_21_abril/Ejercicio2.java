package tarea_21_abril;
public class Ejercicio2 {
    
    /* Ejercicio 2: Uso de Runnable
    Modifica el ejercicio anterior para implementar los hilos usando la interfaz Runnable 
    en lugar de heredar de Thread.*/
    
    public static void main(String[] args) {
        Runnable numeros = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Número: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException error) {
                }
            }
        };

        Runnable letras = () -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Letra: " + c);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exe) {
                }
            }
        };

        new Thread(numeros).start();
        new Thread(letras).start();
    }
}
