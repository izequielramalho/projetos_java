package sistema_banco;

public class Poupanca extends Conta  implements Transacao {

    public Poupanca(String titular, double saldo, double numerodaconta) {
        super(titular, saldo, numerodaconta);
    }

    @Override
    public void depositar() {
        System.out.println("depositou" + this.saldo);
    }

    @Override
    public void sacar() {
        if(saldo >= 20000){
            System.out.println("sacou" + this.titular);
        }
        else{
            System.out.println("não sacar ainda");
        }
    }

    @Override
    public void transferir() {
            System.out.println("Poupança não pode ser transferida");
    }
}
