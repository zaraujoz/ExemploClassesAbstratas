public class Cachorro extends Mamifero {

    private String raca;
    private String tamanho;
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String amamentar() {
        // TODO Auto-generated method stub
        return "leite";
    }

    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        return "AuAu";
    }
    
}
