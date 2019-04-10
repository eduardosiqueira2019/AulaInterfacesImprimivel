public class Contrato implements Imprimivel{


    private String nome;
    private String tipo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nomeNovo) {
        nome = nomeNovo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoNovo) {
        tipo = tipoNovo;
    }

    @Override
    public void imprimir(String nome, String tipo) {
        System.out.println("Sou um contrato muito legal." + nome + " "+ tipo);
    }
}
