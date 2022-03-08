public class Principal {
    public static void main(String[] args){

        Papagaio p=new Papagaio();
        Aguia a=new Aguia();
        Cachorro c=new Cachorro();
        Gato g=new Gato();

        a.setNome("Corinthians");
        System.out.println(a.voar());

        p.setNome("Loro");
        System.out.println(p.voar());

        c.setNome("Bruce");
        System.out.println(c.emitirSom());

        g.setNome("Mel");
        System.out.println(g.emitirSom());

    }
    
}
