package java2;

public class DomainException extends Exception {
// criando uma exceção. É serialiable tem que criar uma versão. QND É RUNTIMEEXCEPTION NÃO PRECISA TRATAR ENTÃO NÃO PRECISA COLOCAR O THROWS
    //EXCEPTION É OBRIGATÓRIO TRABALHAR A EXCECAO.
private static final long serialVersionUID = 1L;

public DomainException (String msg) {
    super(msg);
}



}
