package fiap.tds.models;

import java.util.Date;

public class Pedidos {
    private double idPedido;
    private int qntCredCarb;
    private Date dataPedido;
    private boolean fechado;

    public Pedidos(double idPedido, int qntCredCarb, Date dataPedido, boolean fechado) {
        this.idPedido = idPedido;
        this.qntCredCarb = qntCredCarb;
        this.dataPedido = dataPedido;
        this.fechado = fechado;
    }

    public double getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(double idPedido) {
        this.idPedido = idPedido;
    }

    public int getQntCredCarb() {
        return qntCredCarb;
    }

    public void setQntCredCarb(int qntCredCarb) {
        this.qntCredCarb = qntCredCarb;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
}
