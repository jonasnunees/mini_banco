package src;

public class Cliente extends Conta {

    public Cliente(String nomeTitular, String cpf, String tipo, String numeroConta) {
        super(tipo, numeroConta);
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
    }

    private final String nomeTitular;
    private final String cpf;

    // métodos getters
    public String getNomeTitular(){
        return nomeTitular;
    }

    public String getCpf(){
        return cpf;
    }

    // método para retornar as informações do cliente na tela
    public void status(){
        System.out.println("Nome do titular: " + this.getNomeTitular());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Saldo: R$ " + this.getSaldo());
    }

}
