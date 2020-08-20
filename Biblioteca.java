public class Biblioteca{
    public static void main(String args[]){
        Livro l1, l2, l3;

        l1 = new Livro("Java Basico", "Isidro", 2020, "Tecnico ", 1, 2, true);
        l2 = new Livro("Java OO    ", "Isidro", 2020, "Terror  ", 1, 3, false);
        l3 = new Livro("Java Web   ", "Isidro", 2020, "Suspense", 2, 1, true);

        System.out.println(l1.exibirInfo());
        System.out.println(l2.exibirInfo());
        System.out.println(l3.exibirInfo());
    }
}