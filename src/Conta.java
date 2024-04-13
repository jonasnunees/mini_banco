package src;

public class Conta {

    private String tipo;
    private String numeroConta;
    private float saldo;
    private boolean contaAtiva;

    // método construtor
    public Conta(String tipo, String numeroConta, float saldo, boolean contaAtiva){
        this.tipo = tipo;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.contaAtiva = contaAtiva;
    }

    // métodos getters

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

    // método para retornar uma mensagem caso a conta esteja inativa ou ativa
    public void exibeMensagem(){
        if(contaAtiva){
            System.out.println("Essa conta está ativa");
        } else{
            System.out.println("A conta está desativada!");
        }
    }

    // métodos para movimentação da conta

    // método para realizar um saque
    public void saque(float saque){
        if(saldo > 0 && saldo >= saque){
            saldo -= saque;
            System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + this.saldo);
        } else{
            System.out.println("Não foi possível realizar a operação! Você tentou realizar um saque no valor de R$ " + saque + " mas o seu saldo é de R$ " + this.saldo);
        }
    }

    // método para realizar um depósito
    public void deposito(float deposito){
        this.saldo += deposito;
        System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + this.saldo);
    }

    // método para pagar mensalidade da conta
    public void pagarMensalidade(){
        float mensalidade = 14.9f;
        if(this.saldo >= mensalidade){
            this.saldo -= mensalidade;
            System.out.println("A mensalidade custa R$ " + mensalidade + ". Seu novo saldo é de R$ " + this.saldo);
        } else{
            System.out.println("Saldo insuficiente... deposite um valor maior que R$ " + mensalidade + " para pagar sua mensalidade ou sua conta será desativada em breve.");
        }

    }

    // método para ativar a conta caso esteja desativada
    public void ativaConta(){
        if(contaAtiva){
            exibeMensagem();
        } else{
            setContaAtiva(true);
        }
    }

    // método para desativar a conta
    public void desativaConta(){
        if(!contaAtiva){
            System.out.println("Não foi feita nenhuma alteração... a conta já está desativada!");
        } else{
            setContaAtiva(false);
            exibeMensagem();
        }
    }

}
