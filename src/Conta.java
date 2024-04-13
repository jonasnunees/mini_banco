package src;

public class Conta {

    private final String tipo;
    private final String numeroConta;
    private float saldo = 0;
    private boolean contaAtiva = true;

    // método construtor
    public Conta(String tipo, String numeroConta){
        this.tipo = tipo;
        this.numeroConta = numeroConta;
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

    // métodos setters
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

    // bônus de criação de conta
    public void bonusCriacaoConta(){
        if(this.tipo == "cc"){
            this.saldo += 50f;
        } else if(this.tipo == "cp"){
            this.saldo += 150f;
        }
    }

    // métodos para movimentação da conta

    // método para realizar um saque
    public void saque(float saque){
        if(contaAtiva){
            if(saldo > 0 && saldo >= saque){
                saldo -= saque;
                System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + this.saldo);
            } else{
                System.out.println("Não foi possível realizar a operação! Você tentou realizar um saque no valor de R$ " + saque + " mas o seu saldo é de R$ " + this.saldo);
            }
        }
    }

    // método para realizar um depósito
    public void deposito(float deposito){
        if(contaAtiva){
            this.saldo += deposito;
            System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + this.saldo);
        } else{
            System.out.println("Não é possível prosseguir com a solicitação, essa conta está desativada!");
        }
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
            if(this.saldo < 0){
                System.out.println("Seu saldo é negativo e por isso você não pode fechar sua conta. Quite seus débitos antes de continuar!");
            } else if(this.saldo > 0){
                System.out.println("Falta pouco para concluir sua solicitação. Saque todo seu dinheiro e depois volte aqui para encerrar sua conta!");
            } else{
                setContaAtiva(false);
                exibeMensagem();
            }

        }
    }

}
