package src;

public class Conta {

    private String titular;
    private String tipo;
    private String numeroConta;
    private float saldo;
    private boolean contaAtiva;

    // método construtor
    public Conta(String titular, String tipo, String numeroConta, float saldo, boolean contaAtiva){
        this.titular = titular;
        this.tipo = tipo;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.contaAtiva = contaAtiva;
    }

    // métodos getters
    public String getTitular(){
        return titular;
    }

    public String getTipo(){
        return tipo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public float getSaldo(){
        return saldo;
    }

    public boolean getContaAtiva(){
        return contaAtiva;
    }

    // métodos setters
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void setContaAtiva(boolean contaAtiva){
        this.contaAtiva = contaAtiva;
    }

    // método para retornar as informações do cliente na tela
    public void status(){
        System.out.println("Nome do titular: " + this.getTitular());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Saldo: R$ " + this.getSaldo());
        exibeMensagem();
    }

    // métodos para retornar uma mensagem caso a conta esteja inativa ou ativa
    public void exibeMensagem(){
        if(contaAtiva){
            System.out.println("Essa conta está ativa");
        } else{
            System.out.println("A conta está desativada!");
        }
    }

}
