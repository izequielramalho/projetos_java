package sistema_banco;

public class ContaCorrente extends Conta  implements Transacao  {

    public ContaCorrente(String titular, double saldo, double numerodaconta) {
        super(titular, saldo, numerodaconta);
    }

    @Override
    public void depositar() {
        System.out.println("depositou" + this.saldo);
    }

    @Override
    public void sacar() {

        if(saldo > 300){
            System.out.println("sacou" + this.titular);
        }
        else{
            System.out.println("não sacou");
        }

    }

    @Override
    public void transferir() {
        if(saldo >= 200){
            System.out.println("transferiu" + this.saldo);
        }
        else{
            System.out.println("não transferiu");
        }

    }
}
