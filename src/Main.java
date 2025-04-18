public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("FAGNER CRUZ");

        ContaBancaria contaCorrente = new ContaCorrente(cliente, 1000);
        ContaBancaria contaPoupanca = new ContaPoupanca(cliente, 300);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println("---");

        contaPoupanca.transferir(contaCorrente, 300);

        contaCorrente.sacar(100);
        contaPoupanca.sacar(800);
        contaPoupanca.depositar(200);

       contaCorrente.infoExtrato();
       contaPoupanca.infoExtrato();
    }
}
