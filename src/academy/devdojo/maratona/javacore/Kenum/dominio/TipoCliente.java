package academy.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    public final int VALOR;
    public final String TIPO_CLIENTE;

    TipoCliente(int VALOR, String tipoCliente) {
        this.VALOR = VALOR;
        this.TIPO_CLIENTE = tipoCliente;
    }

    public static TipoCliente tipoClienteNum(int numCliente) {
        //values() retorna todos os enums
        for (TipoCliente tipo : values()) {
            if (tipo.VALOR == numCliente) {
                return tipo;
            }
        }
        return null;
    }

}
