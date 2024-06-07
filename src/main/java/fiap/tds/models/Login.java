package fiap.tds.models;

public class Login {
    private int idLogin;
    private String usuario;
    private String senha;
    private boolean ativo;

    public Login() {
    }

    public Login(int idLogin, String usuario, String senha, boolean ativo) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.senha = senha;
        this.ativo = ativo;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
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
