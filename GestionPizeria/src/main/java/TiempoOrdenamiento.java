
import java.util.List;

public class TiempoOrdenamiento {

    public static <T> long medirTiempoOrdenamiento(List<T> list, Runnable ordenamiento) {
        long startTime = System.nanoTime();
        ordenamiento.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; // Retorna el tiempo en milisegundos
    }
}
