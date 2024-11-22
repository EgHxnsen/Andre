public class Conta {
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Conta(String numeroConta, String agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public String getNumeroConta() { return numeroConta; }
    public String getAgencia() { return agencia; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
