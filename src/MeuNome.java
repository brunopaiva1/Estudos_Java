public class MeuNome{
    public static void main(String [] args){
        String primeiroNome = "Bruno";
        String segundoNome = " Paiva";

        String nome = nome(primeiroNome, segundoNome);
        System.out.println(nome);

    }

    public static String nome(String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }
}