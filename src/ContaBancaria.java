import Utils.GeradorDeContas;


public abstract class ContaBancaria implements IConta{

    private static final int AGENCIA_DEFAULT = 1234;

    protected int agencia;
    protected String numero;
    protected double saldo;
    protected Cliente titular;

    public ContaBancaria(String tipoDeConta, Cliente titular, double saldo) {
        this.agencia = AGENCIA_DEFAULT;
        this.numero = GeradorDeContas.gerarNumeroDeConta(tipoDeConta);
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void infoExtrato() {
        String tipo = this.getClass().getSimpleName().equals("ContaCorrente") ? "Corrente" : "Poupança";

        System.out.printf("\n\n======= Extrato da Conta %s ========\n", tipo);
        System.out.println(" Titular: " + titular.getNome() );
        System.out.println(" Agencia: " + agencia );
        System.out.println(" Numero da conta: " + numero );
        System.out.println(" Saldo: " + saldo );
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }


}
