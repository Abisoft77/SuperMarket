package domain;

import java.util.Arrays;

public class Factura {
    private Cliente cliente;
    private ItemFactura[] items;
    private int contadorItems;
    private static final int MAX_ITEMS=5;
    private double totalPago;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ItemFactura[Factura.MAX_ITEMS];

    }
    public void agregarProd(ItemFactura itemFactura){
        this.items[contadorItems]= itemFactura;
        contadorItems++;
    }

    public void verDetalle(){
        System.out.println("*****Factura****");
        System.out.println("Cliente: " + this.cliente);
        for (int i = 0; i<contadorItems; i++){
            double importe = this.items[i].calcularImporte();
            System.out.print(items[i]);
            System.out.println(" subtotal:" + importe );
        }
        System.out.println("Total: " + this.calcularTotal());

    }
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i<contadorItems; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }


    @Override
    public String toString() {
        return "Factura{" +
                "cliente=" + cliente +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
