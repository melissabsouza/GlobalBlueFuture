package fiap.tds.models;

public class Login {
    private double idLogin;
    private String usuario;
    private String senha;
    private boolean ativo;

    public Login(double idLogin, String usuario, String senha, boolean ativo) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.senha = senha;
        this.ativo = ativo;
    }

    public double getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(double idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
