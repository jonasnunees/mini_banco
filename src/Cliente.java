package src;

public class Cliente extends Conta {

    public Cliente(String nomeTitular, String cpf, String tipo, String numeroConta) {
        super(tipo, numeroConta);
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
    }

    private String nomeTitular;
    private String cpf;

    // métodos getters
    public String getNomeTitular(){
        return nomeTitular;
    }

    public String getCpf(){
        return cpf;
    }

    // métodos setters
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
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
