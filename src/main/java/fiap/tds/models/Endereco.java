package fiap.tds.models;

public class Endereco extends Empresa {
    private double idEndereo;
    private int nrLogradouro;
    private double cep;
    private String rua;
    private String complemento;


    public Endereco(double idEndereco, int nrLogradouro, double cep, String rua, String complemento) {
        this.idEndereo = idEndereo;
        this.nrLogradouro = nrLogradouro;
        this.cep = cep;
        this.rua = rua;
        this.complemento = complemento;
    }

    public double getIdEndereo() {
        return idEndereo;
    }

    public void setIdEndereo(double idEndereo) {
        this.idEndereo = idEndereo;
    }

    public int getNrLogradouro() {
        return nrLogradouro;
    }

    public void setNrLogradouro(int nrLogradouro) {
        this.nrLogradouro = nrLogradouro;
    }

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
