package fiap.tds.models;

public class Pagamento extends Pedidos {
    private double idPagamento;
    private double valorTotal;
    private boolean stPagamento;

    public Pagamento() {
    }

    public Pagamento(double idPagamento, double valorTotal, boolean stPagamento) {
        this.idPagamento = idPagamento;
        this.valorTotal = valorTotal;
        this.stPagamento = stPagamento;
    }

    public double getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(double idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isStPagamento() {
        return stPagamento;
    }

    public void setStPagamento(boolean stPagamento) {
        this.stPagamento = stPagamento;
    }
}
