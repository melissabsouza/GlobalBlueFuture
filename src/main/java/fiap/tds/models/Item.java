package fiap.tds.models;

import java.util.Date;

public class Item extends Pedidos{
    private double idItem;
    private int disponibilidade;

    public Item(double idItem, int disponibilidade) {
        this.idItem = idItem;
        this.disponibilidade = disponibilidade;
    }

    public Item(double idPedido, int qntCredCarb, Date dataPedido, boolean fechado, double idItem, int disponibilidade) {
        super(idPedido, qntCredCarb, dataPedido, fechado);
        this.idItem = idItem;
        this.disponibilidade = disponibilidade;
    }

    public double getIdItem() {
        return idItem;
    }

    public void setIdItem(double idItem) {
        this.idItem = idItem;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
