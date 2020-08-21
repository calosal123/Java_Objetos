public class ComparaStrings{
    public static void main(String args[]){
        //String s1 = "Oi quer tc";
        //String s2 = "Oi quer tc";

        String s1 = new String("Oi quer tc");
        String s2 = new String("Oi quer tc");

        if (s1 == s2){
            System.out.println("Apontam para o mesmo end. de memoria");
        }
        else{
            System.out.println("Apontam para ends. diferentes");
        }

        if (s1.equals(s2)){
            System.out.println("Mesmo conteudo");
        }
        else {
            System.out.println("Conteudos diferentes");
        }


    }
}