package src;

public class Conta {

    private String tipo;
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

    public void msgContaDesativada(){
        System.out.println("Não é possível prosseguir com a solicitação, essa conta está desativada!");
    }

    // bônus de criação de conta
    public void bonusCriacaoConta(){
        if(this.getTipo() == "cc"){
            this.setSaldo(this.getSaldo() + 50f);
        } else if(this.getTipo() == "cp"){
            this.setSaldo(this.getSaldo() + 150f);
        }
    }

    // método para realizar um saque
    public void saque(float saque){
        if(contaAtiva){
            if(this.getSaldo() > 0 && this.getSaldo() >= saque){
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + this.getSaldo());
            } else{
                System.out.println("Não foi possível realizar a operação! Você tentou realizar um saque no valor de R$ " + saque + " mas o seu saldo é de R$ " + this.getSaldo());
            }
        } else{
            msgContaDesativada();
        }
    }

    // método para realizar um depósito
    public void deposito(float deposito){
        if(contaAtiva){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + this.getSaldo());
        } else{

        }
    }

    // método para pagar mensalidade da conta
    public void pagarMensalidade(){
        if(contaAtiva){
            if(this.getTipo() == "cc"){
                this.setSaldo(this.getSaldo() - 12f);
            } else if(this.getTipo() == "cp"){
                this.setSaldo(this.getSaldo() - 20f);
            }
        }
    }

    // método para ativar a conta
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
            msgContaDesativada();
        } else{
            if(this.getSaldo() < 0){
                System.out.println("Seu saldo é negativo e por isso você não pode fechar sua conta. Quite seus débitos antes de continuar!");
            } else if(this.getSaldo() > 0){
                System.out.println("Falta pouco para concluir sua solicitação. Saque todo seu dinheiro e depois volte aqui para encerrar sua conta!");
            } else{
                setContaAtiva(false);
                exibeMensagem();
            }
        }
    }
}