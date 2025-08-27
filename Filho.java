public class Filho extends Pessoa{

    private String Curso;

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    @Override
    public String getTipoVoz() {
        return "Fina";
    }
}
