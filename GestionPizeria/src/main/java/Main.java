import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarPedido(new Pedido("Juan", 300.0, 25));
        pizzeria.agregarPedido(new Pedido("Maria", 150.0, 15));
        pizzeria.agregarPedido(new Pedido("Carlos", 250.0, 20));
        pizzeria.agregarPedido(new Pedido("Ana", 100.0, 10));

        // Ordenar por tiempo de preparación
        long tiempoInsercion = TiempoOrdenamiento.medirTiempoOrdenamiento(pizzeria.getPedidos(), pizzeria::ordenarPorTiempoPreparacion);
        System.out.println("Ordenado por Tiempo de Preparacion: " + pizzeria.getPedidos());
        System.out.println("Tiempo de ejecucion (Inserci0n): " + tiempoInsercion + " ms");

        // Ordenar por precio total
        long tiempoShellsort = TiempoOrdenamiento.medirTiempoOrdenamiento(pizzeria.getPedidos(), pizzeria::ordenarPorPrecio);
        System.out.println("Ordenado por Precio Total: " + pizzeria.getPedidos());
        System.out.println("Tiempo de ejecucion (Shellsort): " + tiempoShellsort + " ms");

        // Ordenar por nombre de cliente
        long tiempoQuicksort = TiempoOrdenamiento.medirTiempoOrdenamiento(pizzeria.getPedidos(), pizzeria::ordenarPorNombreCliente);
        System.out.println("Ordenado por Nombre del Cliente: " + pizzeria.getPedidos());
        System.out.println("Tiempo de ejecucion (Quicksort): " + tiempoQuicksort + " ms");
    }
}
