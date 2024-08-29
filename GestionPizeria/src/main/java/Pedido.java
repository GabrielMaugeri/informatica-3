public class Pedido {
    private String nombreCliente;
    private double precioTotal;
    private int tiempoPreparacion;

    public Pedido(String nombreCliente, double precioTotal, int tiempoPreparacion) {
        this.nombreCliente = nombreCliente;
        this.precioTotal = precioTotal;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Cliente='" + nombreCliente + '\'' +
                ", Precio=" + precioTotal +
                ", Tiempo de Preparación=" + tiempoPreparacion + " mins" +
                '}';
    }
}
