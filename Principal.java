public class Principal {
    public static void main(String[] args){

        Papagaio p=new Papagaio();
        Aguia a=new Aguia();

        a.setNome("Corinthians");
        System.out.println(a.voar());

        p.setNome("Loro");
        System.out.println(p.voar());

    }
    
}
