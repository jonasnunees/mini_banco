package src;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Jonas", "123456789-00", "cc", "123456-0");
        c1.bonusCriacaoConta();
        c1.status();
        c1.deposito(30f);


    }

}
