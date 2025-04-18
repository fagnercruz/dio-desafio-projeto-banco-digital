public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(ContaBancaria contaDestino, double valor);
    void infoExtrato();
}
