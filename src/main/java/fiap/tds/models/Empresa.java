package fiap.tds.models;

public class Empresa extends Login {
    private double idEmpresa;
    private String nome;
    private double cnpj;
    private String email;
    private double idLogin;

    public Empresa() {
    }

    public Empresa(double idEmpresa, String nome, double cnpj, String email, double idLogin) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.idLogin = idLogin;
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

    @Override
    public double getIdLogin() {
        return idLogin;
    }

    @Override
    public void setIdLogin(double idLogin) {
        this.idLogin = idLogin;
    }
}
