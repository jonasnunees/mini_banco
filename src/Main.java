package src;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta("Jonas", "Corrente", "123456-0", 12.5f, true);

        c1.status();
        c1.saque(7.8f);

    }

}
