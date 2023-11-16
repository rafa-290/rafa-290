public class Main {
    static pessoa pessoa1 = new pessoa();
    static pessoa pessoa2 = new pessoa("rafael",17);
    public static void main(String[] args) {
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
    }
}