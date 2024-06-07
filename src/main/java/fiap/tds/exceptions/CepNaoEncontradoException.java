package fiap.tds.exceptions;

public class CepNaoEncontradoException extends Exception {
    public CepNaoEncontradoException() {
        super("CEP não encontrado");
    }
}
