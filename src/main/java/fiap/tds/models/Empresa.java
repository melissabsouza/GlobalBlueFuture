package fiap.tds.models;

public class Empresa extends Login {
    private int idEmpresa;
    private String nome;
    private long cnpj; // IDs CNPJ podem ser grandes, considere long
    private String email;
    private int idLogin;

    // Construtor
    public Empresa() {
    }

    public Empresa(int idEmpresa, String nome, long cnpj, String email, int idLogin) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.idLogin = idLogin;
    }

    // Getters e setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getIdLogin() {
        return idLogin;
    }
    @Override
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
}
