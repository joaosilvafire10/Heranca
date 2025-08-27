public class Main {
    public static void main(String[] args) {

        Avo avo = new Avo();
        avo.setNome("Joaquim");
        avo.setIdade(89);

        Pai pai = new Pai();
        pai.setNome("Roberto");
        pai.setProfissao("Analista de TI");

        Filho filho = new Filho();
        filho.setNome("João");
        filho.setCurso("Java");

        Pessoa[] familia = new Pessoa[3];
        familia[0] = avo;
        familia[1] = pai;
        familia[2] = filho;

        for (Pessoa p : familia) {
            System.out.println("ATRIBUTOS");
            Reflexao.listarAtributos(p);

            System.out.println("\n MÉTODOS");
            Reflexao.listarMetodos(p);
        }
    }
}
