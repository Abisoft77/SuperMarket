import domain.Cliente;
import domain.Factura;
import domain.ItemFactura;
import domain.Producto;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Abisiai", "1054CD");
        Producto producto = new Producto("manzana", "10546544", 5.5);
        Producto producto1 = new Producto("Limon", "888546544", 3.2);
        ItemFactura itemFactura = new ItemFactura(producto, 10);
        ItemFactura itemFactura1 = new ItemFactura(producto1,25);
        Factura factura = new Factura(cliente);
        factura.agregarProd(itemFactura);
        factura.agregarProd(itemFactura1);
        factura.agregarProd(itemFactura);
        factura.verDetalle();

    }
}
