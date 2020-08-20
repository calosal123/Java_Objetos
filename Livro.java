public class Livro{
    private String  titulo;
    private String  autor;
    private int     ano;
    private String  categoria;
    private int     posE;
    private int     posP;
    private boolean emprestado;

    public Livro(String titulo, String autor, int ano, String categoria, int posE, int posP, boolean emprestado){
        this.titulo     = titulo;  // o uso do "this", obriga o compilador a referenciar o atributo
        this.autor      = autor;
        this.ano        = ano;
        this.categoria  = categoria;
        this.posE       = posE;
        this.posP       = posP;
        this.emprestado = emprestado;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;    // ou apenas return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setPosE(int posE){
        this.posE = posE;
    }
    public int getPosE(){
        return this.posE;
    }
    public void setPosP(int posP){
        this.posP = posP;
    }
    public int getPosP(){
        return this.posP;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    public boolean isEmprestado(){
        return this.emprestado;
    }
    public String exibirInfo(){
        String info = "Livro:"+titulo+"/"+autor+"("+ano+")";
        if (emprestado){
            info = info + " EMPRESTADO";
        }
        else{
            info = info + " DISPONIVEL";
        }
        return info;
    }
}