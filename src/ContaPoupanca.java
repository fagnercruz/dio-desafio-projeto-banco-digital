public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Cliente titular, double saldo) {
        super("CP", titular, saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
