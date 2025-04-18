public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Cliente titular, double saldo) {
        super("CC", titular, saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
