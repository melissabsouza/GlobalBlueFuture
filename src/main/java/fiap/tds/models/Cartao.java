package fiap.tds.models;

import java.util.Date;

public class Cartao extends Pagamento{
    private double idCartao;
    private double numeroTransicao;
    private Date dataTransacao;
    private String bandeira;
    private Date daraVencimento;

    public Cartao(double idCartao, double numeroTransicao, Date dataTransacao, String bandeira, Date daraVencimento) {
        this.idCartao = idCartao;
        this.numeroTransicao = numeroTransicao;
        this.dataTransacao = dataTransacao;
        this.bandeira = bandeira;
        this.daraVencimento = daraVencimento;
    }

    public double getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(double idCartao) {
        this.idCartao = idCartao;
    }

    public double getNumeroTransicao() {
        return numeroTransicao;
    }

    public void setNumeroTransicao(double numeroTransicao) {
        this.numeroTransicao = numeroTransicao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Date getDaraVencimento() {
        return daraVencimento;
    }

    public void setDaraVencimento(Date daraVencimento) {
        this.daraVencimento = daraVencimento;
    }
}
