import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pedido> pedidos;

    public Pizzeria() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void ordenarPorTiempoPreparacion() {
        Ordenador.insertionSort(pedidos, (p1, p2) -> p1.getTiempoPreparacion() - p2.getTiempoPreparacion());
    }

    public void ordenarPorPrecio() {
        Ordenador.shellSort(pedidos, (p1, p2) -> Double.compare(p1.getPrecioTotal(), p2.getPrecioTotal()));
    }

    public void ordenarPorNombreCliente() {
        Ordenador.quickSort(pedidos, (p1, p2) -> p1.getNombreCliente().compareTo(p2.getNombreCliente()));
    }
}
