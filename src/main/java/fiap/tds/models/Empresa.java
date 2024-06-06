package fiap.tds.models;

public class Empresa {
    private double idEmpresa;
    private String nome;
    private double cnpj;
    private String email;

    public Empresa() {
    }

    public Empresa(double idEmpresa, String nome, double cnpj, String email) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
    }

    public double getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(double idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
