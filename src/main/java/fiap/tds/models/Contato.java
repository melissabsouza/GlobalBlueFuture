package fiap.tds.models;

public class Contato extends Empresa{
    private double idContato;
    private double numeroContato;
    private int ddi;
    private int ddd;

    public Contato(double idContato, double numeroContato, int ddi, int ddd) {
        this.idContato = idContato;
        this.numeroContato = numeroContato;
        this.ddi = ddi;
        this.ddd = ddd;
    }

    public double getIdContato() {
        return idContato;
    }

    public void setIdContato(double idContato) {
        this.idContato = idContato;
    }

    public double getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(double numeroContato) {
        this.numeroContato = numeroContato;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
}
